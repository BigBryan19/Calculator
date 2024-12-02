package project.nerdlab.calclator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import project.nerdlab.calclator.ui.theme.CalclatorTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.TextField
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GridPage()
        }
    }
}




@Composable
fun GridPage() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 0.dp, top = 36.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = "dropdown") {
            composable("dropdown") { DropdownBox(navController) }
            composable("convertor") { ConvertorScreen() }

            // Add more destinations if needed
        }
    }

    // State to keep track of the input in the text field
    var inputText by remember { mutableStateOf("") }
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp

    // List of button IDs and labels
    val buttonLabels = listOf("C") +
            (9 downTo 7).map { it.toString() } +
            "*" + (6 downTo 4).map { it.toString() } +
            "-" + (3 downTo 1).map { it.toString() } +
            "0" + "." + "DEL" + "OK"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(26.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        // TextField for displaying input
        OutlinedTextField(

//            onValueChange = { },
            readOnly = true,
            modifier = Modifier
                .fillMaxWidth()
                .height(screenHeight * 0.2f)
                ,
            value = inputText,
            onValueChange = {},
        )

        // LazyVerticalGrid for the buttons
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(buttonLabels.size) { index ->
                Btn(buttonLabels[index]) { label ->
                    // Handle input based on the button label
                    inputText = when (label) {
                        "C" -> ""
                        "DEL" -> if (inputText.isNotEmpty()) inputText.dropLast(1) else ""
                        "OK" -> inputText
                        "*" -> "$inputText*"
                        "-" -> "$inputText-"
                        else -> inputText + label
                    }
                }
            }
        }
    }
}



@Composable
fun Btn(label: String, onClick: (String) -> Unit) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp

    val buttonColor = when (label) {
        "OK" -> Color.Yellow
        "DEL" -> Color.Red
        else -> Color.LightGray
    }

    Button(
        onClick = { onClick(label) },
        colors = ButtonDefaults.buttonColors(buttonColor),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
//            .fillMaxHeight()
            .height(screenHeight * 0.12f)
            .padding(8.dp)
    ) {
        Text(
            text = label,
            color = Color.Black,
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium
        )
    }
}



@Composable
fun DropdownBox(navController: NavController) {
    var dropDown by remember { mutableStateOf(false) }
    val mLang = listOf("Calculator", "Convertor", "Currency exchange")
    var mSelectedText by remember { mutableStateOf("Calculator") }

    val icon = if (dropDown)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = mSelectedText,
            onValueChange = { mSelectedText = it },
            label = { Text("Select Option") },
            readOnly = true,
            trailingIcon = {
                Icon(
                    icon,
                    contentDescription = "Toggle Dropdown",
                    Modifier.clickable { dropDown = !dropDown }
                )
            }
        )

        DropdownMenu(
            expanded = dropDown,
            onDismissRequest = { dropDown = false }
        ) {
            mLang.forEach { label ->
                DropdownMenuItem(
                    text = { Text(label) },
                    onClick = {
                        mSelectedText = label
                        dropDown = false
                        if (label == "Convertor") {
                            navController.navigate("convertor") // Navigate to the Convertor screen
                        }
                    }
                )
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GridPreview() {
    CalclatorTheme {
        GridPage()
    }
}
