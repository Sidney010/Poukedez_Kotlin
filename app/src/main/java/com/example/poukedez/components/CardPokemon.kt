package com.example.poukedez.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.poukedez.R


@Composable
fun CardPokemon(
    modifier: Modifier = Modifier,
    name: String = "Bulbasaur",
    colorTema: Color = Color(139, 195, 74, 255),
    number: String = "#001",
    onClick: () -> Unit = {}
) {
    Card(
        modifier = modifier
            .padding(6.dp)
            .aspectRatio(1f)
            .clickable { onClick() },
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(2.dp, colorTema),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
                .background(Color.White)
        ) {

            Text(
                text = number,
                color = colorTema,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(6.dp, 2.dp)
            )

            Icon(
                painter = painterResource(R.drawable.game),
                contentDescription = name,
                modifier = Modifier.align(Alignment.Center).fillMaxHeight(0.4f)
            )

            Text(
                text = name,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .background(colorTema)
                    .fillMaxWidth()
                    .padding(4.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}