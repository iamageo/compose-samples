package com.iamageo.jetlinkedin.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
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
            BottomBarIcon(R.drawable.ic_home, "Início")
            BottomBarIcon(R.drawable.ic_my_network, "Minha rede")
            BottomBarIcon(R.drawable.ic_add, "Publicar")
            BottomBarIcon(R.drawable.ic_notfications, "Notificações")
            BottomBarIcon(R.drawable.ic_jobs, "Vagas")
        }
    }


}

@Composable
fun BottomBarIcon(icon: Int, title: String) {
    IconButton(onClick = { }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "icon bottombar",
                tint = Color.Black
            )
            Text(text = title, style = TextStyle(color = Color.Gray), fontSize = 12.sp)
        }
    }
}
