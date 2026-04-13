package com.example.poukedez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.poukedez.screens.DadosPesquisaPokemonScreen
import com.example.poukedez.screens.StartPoukedexScreen
import com.example.poukedez.ui.theme.PoukedezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PoukedezTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    DadosPesquisaPokemonScreen()
                }
            }
        }
    }
}
