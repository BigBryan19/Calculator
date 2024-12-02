package project.nerdlab.calclator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import project.nerdlab.calclator.ui.theme.CalclatorTheme

class Forex : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FXPage()
        }
    }
}

@Composable
fun FXPage(){
    Column (
        modifier = Modifier.fillMaxSize()
            .padding(26.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.size(320.dp, 30.dp)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.size(320.dp, 30.dp)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.size(320.dp, 30.dp)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.size(320.dp, 30.dp)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.size(320.dp, 30.dp)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.size(320.dp, 30.dp)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )


        Row {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "C",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "7",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "8",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "9",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }


        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Row {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "C",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "4",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "5",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "6",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }


        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Row {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "1",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "2",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "3",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }


        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Row {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "4",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "0",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = ".",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(80.dp, 100.dp)
            ) {
                Text(
                    text = "DEL",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium

                )
            }


        }
    }
    }


@Preview(showBackground = true)
@Composable
fun ForexPreview() {
    CalclatorTheme {
        FXPage()
    }
}