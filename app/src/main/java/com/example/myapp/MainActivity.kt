package com.example.myapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.MyappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
InputExample()
        }
    }
}
@Composable
fun InputExample(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
    verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text =" Login Page",
            modifier = Modifier.padding(20.dp),
            fontSize = 50.sp,
            fontStyle = FontStyle.Italic
        )
        OutlinedTextField(value = "", onValueChange = {}, label = {Text(text="user name")})
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = {Text(text="password")})
        Spacer(modifier = Modifier.height(20.dp))
        val context = LocalContext.current

        Text(
            text = " Forgot Password ?",
            modifier = Modifier.padding(10.dp),
            fontSize = 25.sp,
            fontStyle = FontStyle.Normal,


        )
        Button(
            onClick = {
                Toast.makeText(context, "login", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(text="Login")
        }
    }

}