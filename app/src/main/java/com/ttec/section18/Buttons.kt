package com.ttec.section18

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ttec.section18.ui.theme.Section18Theme

/*@Preview
@Composable
fun MyButton() {
    Section18Theme {
        Button(onClick = { *//*TODO*//* }) {
            Text(text = "Pulsa")
        }
    }
}

@Preview
@Composable
fun MyButton2() {
    Section18Theme {
        Button(
            onClick = { *//*TODO*//* },
            enabled = false,
            colors = ButtonDefaults.buttonColors(
                disabledContainerColor = Color.Red,
                disabledContentColor = Color.White
            )
        ) {
            Text(text = "Pulsa")
        }
    }
}

@Preview
@Composable
fun MyFilledTonalButton() {
    FilledTonalButton(onClick = { *//*TODO*//* }) {
        Text(text = "Pulsar")
    }
}

@Preview
@Composable
fun MyElevatedButton() {
    ElevatedButton(onClick = { *//*TODO*//* }) {
        Text(text = "Pulsar")
    }
}*/

@Preview
@Composable
fun MyFAB() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(24.dp)
    ) {

        FloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = Color.Red,
            contentColor = Color.Yellow
        ) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "favortite")
        }

        Spacer(modifier = Modifier.padding(16.dp))

        SmallFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "favorite")
        }

        Spacer(modifier = Modifier.padding(16.dp))

        LargeFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "favorite")
        }

        Spacer(modifier = Modifier.padding(16.dp))

        ExtendedFloatingActionButton(
            text = { Text(text = "Pulsa") },
            icon = { Icon(imageVector = Icons.Filled.Favorite, contentDescription = "")},
            onClick = { /*TODO*/ })
    }

}