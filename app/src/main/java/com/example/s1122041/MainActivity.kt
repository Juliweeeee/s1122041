package com.example.s1122041

import android.app.Activity
import android.graphics.fonts.Font
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.s1122041.ui.theme.S1122041Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1122041Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
        .background(Color(0xff95fe95))
        //contentAlignment = Alignment.Center
    ) {

        Column (horizontalAlignment = Alignment.CenterHorizontally){
            //var horizontalAlignment = Layout.Alignment.CenterHorizontally
                Text(
                    text = "2024期末上機考(資管二B張主臨)\n",
                    //fontFamily = FontFamily(Font(R.font.kai)),
                    //fontSize = 20.sp,
                    //color = Color.Black,

                    modifier = modifier
                )
                Image(
                    painter = painterResource(id = R.drawable.class_b),
                    contentDescription = "張主臨",
                    //alpha = 0.7f,
                    modifier = Modifier
                        //.clip(CircleShape)
                        .background(Color.Black)
                )
                Text(
                text = "遊戲持續時間 0 秒",
                modifier = modifier
            )
            Text(
                text = "您的成績 0 分",
                modifier = modifier
            )
            val activity = (LocalContext.current as? Activity)
            Box (

            ){

            Button(onClick = {
                activity?.finish()
            }) {
                Text(text = "結束App")
            }

        }
    }

}}



/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S1122041Theme {
        Greeting("Android")
    }
}*/