package com.example.poukedez.screens

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.poukedez.R
import com.example.poukedez.components.CardPokemon

@Composable
fun DadosPesquisaPokemonScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(53, 122, 56, 255))
            .padding(12.dp, 12.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Icon(
                modifier = Modifier
                    .align(alignment = Alignment.End)
                    .alpha(0.2f),
                tint = Color(76, 175, 80, 255),
                painter = painterResource(R.drawable.game),
                contentDescription = "Pokebola Fundo"
            )

            CardDataPokemon {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp),
                    horizontalArrangement = Arrangement.Center,
                ) {

                    Row(
                        modifier = Modifier
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color.Green)
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text("Grass", color = Color.White)
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Row(
                        modifier = Modifier
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color.Magenta)
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text("Poison", color = Color.White)
                    }
                }

                Text(
                    text = "About",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Row( modifier = Modifier.fillMaxWidth()) {
                    Column( modifier = Modifier.fillMaxWidth(0.25f), horizontalAlignment = Alignment.CenterHorizontally) {
                        Row( modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Image(modifier = Modifier.height(20.dp),painter = painterResource(R.drawable.game),contentDescription = "")
                            Text(
                                text = "6,9kg",
                            )
                        }
                        Text(
                            text = "Weight",
                        )
                    }
                }
            }

        }

        Column(
            modifier = Modifier
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
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
            Image(
                painter = painterResource(R.drawable.avatar),
                contentDescription = "Pokemon Example"
            )
        }

    }
}
@Composable
fun CardDataPokemon(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {

    Card(
        modifier = modifier.fillMaxSize(),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.White)
                .padding(32.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                content = content
            )
        }
    }
}