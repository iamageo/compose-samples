package com.iamageo.jet_twitter.ui.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileButton(
    modifier: Modifier = Modifier,
    isMyProfile: Boolean = false
) {
    Button(
        modifier = modifier
            .padding(end = 16.dp),
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, if (isMyProfile) Color.Gray else Color.Black),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isMyProfile) Color.White.copy(
                alpha = 0.9f
            ) else Color.Black
        )
    ) {
        if (isMyProfile) {
            Text(text = "Editar perfil", fontSize = 12.sp)
        } else {
            Text(
                text = "Seguir",
                fontSize = 12.sp, color = Color.White
            )
        }
    }

}