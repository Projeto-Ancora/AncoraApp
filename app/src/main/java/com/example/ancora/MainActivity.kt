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
<<<<<<< HEAD
import com.example.ancora.Telas.AjudaSuporteScreen
import com.example.ancora.Telas.CadastroScreen
import com.example.ancora.Telas.GameScree
import com.example.ancora.Telas.LoginScreen
import com.example.ancora.Telas.ShopLayout
=======
import com.example.ancora.Telas.Fase
import com.example.ancora.Telas.Game.GameScreen2
>>>>>>> 07238ee649b04a22a167b473234daa11f6a9139b
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
<<<<<<< HEAD

                    // GameScree(modifier = Modifier.padding(innerPadding))
                   /* ConfiguracaoScreen (modifier = Modifier.padding(innerPadding),
=======
                    /*
                    ConfiguracaoScreen (modifier = Modifier.padding(innerPadding),
>>>>>>> 07238ee649b04a22a167b473234daa11f6a9139b
                        onBackClick = {},
                        onAjudaClick = {},
                        onTermosClick = {},
                        onSobreClick = {},
                        onTrocarClick = {},
                        onSairContaClick = {})
<<<<<<< HEAD
                    */

                    AjudaSuporteScreen(modifier = Modifier.padding(innerPadding))

                    //CadastroScreen( modifier = Modifier.padding(innerPadding))

                    //LoginScreen( modifier = Modifier.padding(innerPadding))

                     //GameScree(modifier = Modifier.padding(innerPadding))

=======
                }*/
                   // Fase()
                GameScreen2(modifier = Modifier.padding(innerPadding))
>>>>>>> 07238ee649b04a22a167b473234daa11f6a9139b
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