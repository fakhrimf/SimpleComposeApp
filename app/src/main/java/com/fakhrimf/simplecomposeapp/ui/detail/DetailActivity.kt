package com.fakhrimf.simplecomposeapp.ui.detail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fakhrimf.simplecomposeapp.R
import com.fakhrimf.simplecomposeapp.models.WeaponModel
import com.fakhrimf.simplecomposeapp.ui.detail.ui.theme.SimpleComposeAppTheme
import com.fakhrimf.simplecomposeapp.utils.WEAPON_DETAIL

private var weaponModel: WeaponModel? = null

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        weaponModel = intent.getParcelableExtra<WeaponModel>(WEAPON_DETAIL)
        super.onCreate(savedInstanceState)
        setContent {
            SimpleComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScaffoldDetail()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDetail() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "${weaponModel?.name}") },
                modifier = Modifier.statusBarsPadding()
            )
        },
        content = {
            Page(modifier = Modifier.padding(it))
        }
    )
}

@Composable
fun Page(modifier: Modifier) {
    if (weaponModel != null) {
        val mod = modifier.padding(16.dp)
        val modpadtop = Modifier.padding(top = 5.dp)
        Column(modifier = mod) {
            Image(
                painter = painterResource(
                    id = weaponModel?.image ?: R.drawable.ic_launcher_background
                ),
                contentDescription = weaponModel?.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth(),
            )
            Text(text = "${weaponModel?.name}", modifier = modpadtop)
            Text(text = "Year : ${weaponModel?.year}", modifier = modpadtop)
            Text(text = "From : ${weaponModel?.origin}", modifier = modpadtop)
            Text(text = "${weaponModel?.desc}", modifier = modpadtop)
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun PagePreview() {
    SimpleComposeAppTheme {
        weaponModel = WeaponModel(
            R.drawable.akm,
            "AKM",
            1959,
            "USSR",
            "The AKM (Russian: Автома́т Кала́шникова модернизи́рованный, tr. Avtomát Kalášnikova modernizírovannyj, lit. 'Kalashnikov's Automatic Rifle Modernised') is an assault rifle designed by Soviet small arms designer Mikhail Kalashnikov in 1959. It was developed as a replacement to the AK-47 introduced a decade prior."
        )
        Page(Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    SimpleComposeAppTheme {
        Greeting2("Android")
    }
}