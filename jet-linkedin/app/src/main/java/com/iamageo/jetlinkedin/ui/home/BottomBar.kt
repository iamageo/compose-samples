package com.iamageo.jetlinkedin.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamageo.jetlinkedin.R

@Composable
fun BottomBar(
    backgroundColor: Color
) {
    BottomAppBar(
        backgroundColor = backgroundColor, elevation = 0.dp
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BottomBarIcon(R.drawable.ic_home, "Início", Color.Black)
            BottomBarIcon(R.drawable.ic_my_network, "Minha rede", Color.Gray)
            BottomBarIcon(R.drawable.ic_add, "Publicação", Color.Gray)
            BottomBarIcon(R.drawable.ic_notfications, "Notificações", Color.Gray)
            BottomBarIcon(R.drawable.ic_jobs, "Vagas", Color.Gray)
        }
    }
}

@Composable
fun BottomBarIcon(icon: Int, title: String, iconTint: Color) {
    IconButton(onClick = { }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "icon bottombar",
                tint = iconTint,
                modifier = Modifier.size(20.dp)
            )
            Text(text = title, style = TextStyle(color = Color.Gray), fontSize = 10.sp)
        }
    }
}
