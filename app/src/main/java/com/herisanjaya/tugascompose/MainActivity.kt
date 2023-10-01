package com.herisanjaya.tugascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.herisanjaya.tugascompose.ui.theme.TugasComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Salam(firstname = "Heri", lastname = "Sanjaya Ginting")
        }
    }
}

@Composable
fun Salam(firstname: String, lastname : String, modifier: Modifier = Modifier) {
    Column (
        Modifier
            .padding(all = 20.dp)
            .background(Color.Green)
    ) {
        Text("Hello $firstname")
        Text("Hello $firstname $lastname")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TugasComposeTheme {
        Salam(firstname = "Heri", lastname = "Sanjaya Ginting")
    }
}