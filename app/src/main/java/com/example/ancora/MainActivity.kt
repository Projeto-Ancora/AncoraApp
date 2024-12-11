package com.example.ancora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ancora.Telas.*
import com.example.ancora.Telas.Game.GameScreen
import com.example.ancora.Telas.Game.GameScreen2
import com.example.ancora.Telas.TenteNovamente.TryAgainScreen
import com.example.ancora.ui.theme.AncoraTheme
import com.example.teladeconfiguracao.ConfiguracaoScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()

        setContent {
            AncoraTheme {
                AppScaffold()
            }
        }
    }
}

@Composable
fun AppScaffold() {
    val navController = rememberNavController()
    Scaffold { innerPadding ->
        AppNavigator(modifier = Modifier.padding(innerPadding), navController = navController)
    }
}

@Composable
fun AppNavigator(modifier: Modifier = Modifier, navController: androidx.navigation.NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            TelaDeCadastroLogin(modifier = modifier, navController = navController)
        }
        composable("cadastro") {
            CadastroScreen(modifier = modifier, navController = navController)
        }
        composable("login") {
            LoginScreen(modifier = modifier, navController = navController)
        }
        composable("escolherpersona") {
            MainContent(modifier = modifier, innerPadding = PaddingValues(), navController = navController)
        }
        composable("menu_principal") {
            MainContent(modifier = modifier, innerPadding = PaddingValues(), navController = navController)
        }
        composable("menuprincipal") {
            MainContent(modifier = modifier, innerPadding = PaddingValues(), navController = navController)
        }
        composable("menu") {
            MainContent(modifier = modifier, innerPadding = PaddingValues(), navController = navController)
        }
        composable("loja") {
            ShopLayout(modifier = modifier, navController = navController)
        }
        composable("jogar") {
            Fase(navController = navController)
        }
        composable("perfil") {
            Perfil(navController = navController)
        }
        composable("config") {
            ConfiguracaoScreen(modifier = modifier, navController = navController)
        }
        composable("fasee") {
            Fase(navController = navController)
        }
        composable("menuu") {
            MainContent(modifier = modifier, innerPadding = PaddingValues(), navController = navController)
        }
        composable(route = "fase1"){
            GameScreen(modifier = modifier, navController = navController)
        }
        composable("fase2"){
            GameScreen2(modifier, navController)
        }
        composable("tenteNovamente") {
            TryAgainScreen(modifier = modifier, navController)
        }
    }
}

@Preview
@Composable
fun PreviewAppScaffold() {
    AncoraTheme {
        AppScaffold()
    }
}
