package com.example.blocosdecarnaval

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blocosdecarnaval.ui.theme.BlocosDeCarnavalTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BlocosDeCarnavalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppBlocosScreen()
                }
            }
        }
    }
}

@Composable
fun AppBlocosScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column( modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(R.drawable.carnaval),
                contentDescription ="Imagem ilustrativa carnaval",

            )
            Text(
                "Data:" ,
                fontSize = 24.sp,
                color = Color(0xFF000007)
            )
            Text(
                "Nome do Bloco:",
                fontSize = 24.sp,
                color = Color(0xFF000007)
            )
            Text(
                "Descrição:",
                fontSize = 24.sp,
                color = Color(0xFF000007)
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {

                }
            ) {
                Text("Ver outro Bloco")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BlocosDeCarnavalTheme {
        AppBlocosScreen()
    }
}