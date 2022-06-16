package com.example.composeapplication

import android.graphics.Color.red
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Column(
               modifier  = Modifier
                   .fillMaxSize(fraction = 0.5f)
                   .background(Color.Red)

                       ,
               horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.SpaceAround) {
               Text("Hello",color = Color.White, fontSize = 24.sp)
               Text("Hello",color = Color.White, fontSize = 16.sp)
               Row(
                   modifier = Modifier.fillMaxWidth(),
                   horizontalArrangement = Arrangement.SpaceAround,
                   verticalAlignment = Alignment.CenterVertically

               ) {
                   Text("Hi")
                   Text("Hi")
               }
           }
        }
    }
}

