package com.iamageo.jet_twitter.ui.components.multifab


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.ui.theme.TwitterBlue

@Composable
fun MultiFloatingActionButton(
    fabIcon: FabIcon,
    modifier: Modifier = Modifier,
    itemsMultiFab: List<MultiFabItem>,
    fabState: MutableState<MultiFabState> = rememberMultiFabState(),
    fabOption: FabOption = FabOption(),
    onFabItemClicked: (fabItem: MultiFabItem) -> Unit,
    stateChanged: (fabState: MultiFabState) -> Unit = {}
) {
    val rotation by animateFloatAsState(
        if (fabState.value == MultiFabState.Expand) fabIcon.iconRotate ?: 0f else 0f
    )

    Column(
        modifier = modifier.wrapContentSize(),
        horizontalAlignment = Alignment.End,
    ) {
        AnimatedVisibility(
            visible = fabState.value == MultiFabState.Expand,
            enter = fadeIn() + expandVertically(),
            exit = fadeOut()
        ) {
            LazyColumn(
                modifier = Modifier.wrapContentSize(),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {

                itemsIndexed(itemsMultiFab) { _, item ->
                    MiniFabItem(
                        item = item,
                        showLabel = fabOption.showLabels,
                        onFabItemClicked = { onFabItemClicked(item) })
                }

                item {}
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (fabState.value.isExpanded()) Text(
                text = "Tweet",
                modifier = Modifier.padding(end = 16.dp),
                fontSize = 12.sp
            )
            FloatingActionButton(
                onClick = {
                    fabState.value = fabState.value.toggleValue()
                    stateChanged(fabState.value)
                },
                backgroundColor = fabOption.backgroundTint,
                contentColor = fabOption.iconTint
            ) {
                Icon(
                    painter =
                    if (fabState.value.isExpanded()) painterResource(R.drawable.ic_pen)
                    else painterResource(fabIcon.iconRes),
                    modifier = Modifier.rotate(rotation),
                    contentDescription = null,
                    tint = fabOption.iconTint
                )
            }
        }
    }
}

