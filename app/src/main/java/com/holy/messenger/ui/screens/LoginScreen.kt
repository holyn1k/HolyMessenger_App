package com.holy.messenger.ui.screens

import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }

    Column {
        TextField(value=email,onValueChange={email=it}, label={Text("Email")})
        TextField(value=pass,onValueChange={pass=it}, label={Text("Password")})
        Button(onClick={}) { Text("Login") }
    }
}