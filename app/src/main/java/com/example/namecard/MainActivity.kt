package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.namecard.ui.theme.NameCardTheme
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val bg_image = painterResource(R.drawable.app_bg)
                    Background(bg_image)
                    Card("Muh. Fathur Rahman Awaluddin", "D121211050")
                    Contacts("+62 811 4344 279", "@frhn.efl", "farhanvanderwaal@gmail.com")
                }
            }
        }
    }
}

@Composable
fun Card(name: String, title: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val profile = painterResource(R.drawable.profile)
        Image(
            painter = profile,
            contentDescription = null,
            modifier = modifier
                .padding(0.dp,0.dp,10.dp,10.dp)
                .clip(CircleShape)
        )
        Text(
            text = name,
            fontSize = 20.sp,
            style = TextStyle(color = Color.White),
            modifier = modifier.padding(0.dp,0.dp,10.dp,10.dp)
        )
        Text(
            text = title,
            fontSize = 17.sp,
            style = TextStyle(color = Color(0xFF9F2952)),
            modifier = modifier.padding(0.dp,0.dp,10.dp,10.dp)
        )
    }
}

@Composable
fun Contacts(phone: String, social: String, email: String) {
    Row (
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center,
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.paddingFromBaseline(0.dp,106.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,
                modifier = Modifier
                    .padding(0.dp,0.dp,10.dp,10.dp)
                    .size(19.dp),
                tint = Color(0xFF9F2952)
            )
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null,
                modifier = Modifier
                    .padding(0.dp,0.dp,10.dp,10.dp)
                    .size(18.dp),
                tint = Color(0xFF9F2952)
            )
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                modifier = Modifier
                    .padding(0.dp,0.dp,10.dp,10.dp)
                    .size(18.dp),
                tint = Color(0xFF9F2952)
            )
        }
        Column (
            modifier = Modifier.paddingFromBaseline(0.dp,36.dp)
        ) {
            Text(
                text = phone,
                fontSize = 14.sp,
                style = TextStyle(color = Color.White),
                modifier = Modifier.padding(0.dp,0.dp,10.dp,10.dp)
            )
            Text(
                text = social,
                fontSize = 14.sp,
                style = TextStyle(color = Color.White),
                modifier = Modifier.padding(0.dp,0.dp,10.dp,10.dp)
            )
            Text(
                text = email,
                fontSize = 14.sp,
                style = TextStyle(color = Color.White),
                modifier = Modifier.padding(0.dp,0.dp,10.dp,10.dp)
            )
        }
    }
}

@Composable
fun Background(backgroundImage: Painter, modifier: Modifier = Modifier) {
        Image(
            painter = backgroundImage,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
}