package com.iamageo.jetlinkedin.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.iamageo.jetlinkedin.R

@Composable
fun AppDrawer(navController: NavController) {
    Surface(
        color = Color.White
    ) {
        Column {
            Column(
                modifier = Modifier.padding(16.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = RoundedCornerShape(25.dp))
                        .clickable {

                        },
                    contentScale = ContentScale.Crop,
                    contentDescription = ""
                )
                Text(
                    text = "Geovani Amaral",
                    style = TextStyle(color = Color.Black, fontSize = 16.sp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Ver perfil",
                    style = TextStyle(color = Color.Gray, fontSize = 12.sp),
                )
                Divider(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp))
                Text(
                    text = "Grupos",
                    style = TextStyle(color = Color.Black, fontSize = 16.sp),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Text(
                    text = "Eventos",
                    style = TextStyle(color = Color.Black, fontSize = 16.sp),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Spacer(modifier = Modifier.weight(weight = 1f))
                Divider()
                DrawerBottomItem(icon = R.drawable.ic_search, title = "Experimente o Premium grátis")
                DrawerBottomItem(icon = R.drawable.ic_search, title = "Configurações")

            }
        }

    }
}

@Composable
private fun DrawerBottomItem(title: String, icon: Int) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "icon drawer",
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = title,
            style = TextStyle(color = Color.Black, fontSize = 16.sp),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}