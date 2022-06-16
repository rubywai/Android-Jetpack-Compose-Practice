package com.example.composeapplication

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyForm(applicationContext)
        }
    }
}

@Composable
fun MyForm(applicationContext : Context) {
    var textFieldState by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value =
            textFieldState,
            onValueChange = {
                textFieldState = it
            },
            label = {
                Text("Enter your Name")
            },
            keyboardActions = KeyboardActions(),
            keyboardOptions = KeyboardOptions(),
            singleLine = true
            )
        Button(
            onClick = {
               if(textFieldState.isEmpty()){
                   Toast.makeText(applicationContext, "Please Enter Completely", Toast.LENGTH_SHORT).show()
               }
                else{
                   Toast.makeText(applicationContext, "This is $textFieldState", Toast.LENGTH_SHORT).show()
               }
            }
        ) {
            Text("Continue")
        }

    }
}


