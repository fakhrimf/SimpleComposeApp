package com.fakhrimf.simplecomposeapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fakhrimf.simplecomposeapp.models.dummy
import com.fakhrimf.simplecomposeapp.ui.about.AboutMe
import com.fakhrimf.simplecomposeapp.ui.list.WeaponsListItem
import com.fakhrimf.simplecomposeapp.ui.theme.SimpleComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScaffoldMain(LocalContext.current)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldMain(context: Context) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text(text = "Weapons Info")},
                actions = { IconButton(onClick = {
                    context.startActivity(Intent(context, AboutMe::class.java))
                }) {
                    Icon(Icons.Filled.Info, "info_icon")
                }},
                modifier = Modifier.statusBarsPadding()
            )
        },
        content = {
            WeaponRows(modifier = Modifier.padding(it).statusBarsPadding())
        }
    )
}

@Composable
fun WeaponRows(
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.padding(start = 10.dp, end = 10.dp)) {
        items(dummy, key = {it.name}) {
            WeaponsListItem(weaponModel = it, context = LocalContext.current)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    SimpleComposeAppTheme {
        WeaponRows()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleComposeAppTheme {
        Greeting("Android")
    }
}