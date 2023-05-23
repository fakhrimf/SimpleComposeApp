package com.fakhrimf.simplecomposeapp.ui.list

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fakhrimf.simplecomposeapp.models.WeaponModel
import com.fakhrimf.simplecomposeapp.models.dummy
import com.fakhrimf.simplecomposeapp.ui.detail.DetailActivity
import com.fakhrimf.simplecomposeapp.ui.theme.SimpleComposeAppTheme
import com.fakhrimf.simplecomposeapp.utils.WEAPON_DETAIL

@Composable
fun WeaponsListItem(weaponModel: WeaponModel, modifier: Modifier = Modifier, context: Context) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.clickable {
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(WEAPON_DETAIL, weaponModel)
        context.startActivity(intent)
    }) {
        Image(
            painter = painterResource(id = weaponModel.image),
            contentDescription = weaponModel.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(200.dp).fillMaxWidth(),
        )
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = weaponModel.name, modifier = Modifier.padding(10.dp))
            Text(text = "From: "+weaponModel.origin, modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 35.dp, bottom = 10.dp))
        }
    }
}