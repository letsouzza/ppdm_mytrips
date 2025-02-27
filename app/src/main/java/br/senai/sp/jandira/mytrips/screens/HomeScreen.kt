package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xF5C1CEE8)
            )
    ){
        Card(
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .align(Alignment.BottomStart),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xF5256DDC)
            ),
            shape = RoundedCornerShape(
                topEnd = 30.dp
            )
        ) {}
        Card(
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .align(Alignment.TopEnd),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xF5256DDC)
            ),
            shape = RoundedCornerShape(
                bottomStart = 30.dp
            )
        ) {}
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()

                    .padding(top = 60.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.login
                    ),
                    fontSize = 45.sp,
                    color = Color(0xF5256DDC),
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    modifier = Modifier
                        .padding(5.dp),
                    text = stringResource(
                        R.string.please
                    ),
                    fontSize = 18.sp,
                    color = Color(0xF50D1A64)
                )
                OutlinedTextField(
                    value = "teste@email.com",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(0xF5256DDC)
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                R.string.email
                            )
                        )
                    },
                    shape = RoundedCornerShape(
                         15.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp)
                        .padding(bottom = 20.dp)
                )
                OutlinedTextField(
                    value = "*************",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(0xF5256DDC)
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                R.string.password
                            )
                        )
                    },
                    shape = RoundedCornerShape(
                        15.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)
                )

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xF5256DDC)),
                    shape = RoundedCornerShape(
                        10.dp
                    ),
                    modifier = Modifier
                        .align(Alignment.End)
                ) {
                    Text(
                        text = stringResource(
                            R.string.sign_in
                        )
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = ""
                    )

                }
                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(top = 20.dp)
                ) {
                    Text(
                        text = stringResource(
                            R.string.no_account
                        ),
                        color = Color(0xF50D1A64),

                        )
                    Text(
                        text = stringResource(
                            R.string.sign_up
                        ),
                        color = Color(0xF5256DDC),
                        fontWeight = FontWeight.ExtraBold
                    )
                }


            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
