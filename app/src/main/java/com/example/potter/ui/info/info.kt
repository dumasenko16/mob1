package com.example.potter.ui.info


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoScreen() {
    Column {
        Box(
            modifier = Modifier.fillMaxSize().background(Color.Gray).padding(10.dp)
        ) {
            Text(
                "Приложение создано для ознакомления с вселенной Гарри Поттера",
                fontSize = 30.sp,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(10.dp)
                    .background(Color.LightGray)

            )
            Text(
                "Добро пожаловать!",
                fontSize = 50.sp,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(1.dp)
                    .background(Color.LightGray)

            )

        }
    }
}



