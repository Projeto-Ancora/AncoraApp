package com.example.ancora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.ancora.Telas.Fase
import com.example.ancora.Telas.Game.GameScreen2
import com.example.ancora.ui.theme.AncoraTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            AncoraTheme {
                Scaffold { innerPadding ->
                    //GameScreen(modifier = Modifier.padding(innerPadding))
                    //ShopLayout(modifier = Modifier.padding(innerPadding))
                    /*
                    ConfiguracaoScreen (modifier = Modifier.padding(innerPadding),
                        onBackClick = {},
                        onAjudaClick = {},
                        onTermosClick = {},
                        onSobreClick = {},
                        onTrocarClick = {},
                        onSairContaClick = {})
                }*/
                   // Fase()
                GameScreen2(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AncoraTheme {
        Fase()
    }
}