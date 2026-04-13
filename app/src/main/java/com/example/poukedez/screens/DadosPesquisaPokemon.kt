package com.example.poukedez.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.poukedez.R

@Composable
fun DadosPesquisaPokemonScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(53, 122, 56, 255))
            .padding(2.dp, 8.dp)
    ) {
        Icon(
            modifier = Modifier.align(Alignment.TopEnd),
            tint = Color(76, 175, 80, 255),
            painter = painterResource(R.drawable.game),
            contentDescription = "Pokebola Fundo"
        )
        Row(
            modifier = Modifier
                .padding(0.dp, 26.dp)
                .fillMaxWidth()
                .padding(16.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier.fillMaxHeight(0.6f),
                        painter = painterResource(R.drawable.back),
                        tint = Color.White,
                        contentDescription = "Retornar para a tela anterior"
                    )
                }
                Text(
                    text = "Bulbasauro",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = "#001",
                color = Color.White,
            )
        }
    }
}