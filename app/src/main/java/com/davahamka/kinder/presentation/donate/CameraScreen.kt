package com.davahamka.kinder.presentation.donate

import android.net.Uri
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import app.futured.donut.compose.DonutProgress
import app.futured.donut.compose.data.DonutModel
import app.futured.donut.compose.data.DonutSection
import coil.compose.rememberImagePainter
import com.davahamka.kinder.common.Screen
import com.davahamka.kinder.presentation.CameraCapture
import com.davahamka.kinder.presentation.auth.InformationScreen
import com.davahamka.kinder.presentation.donate.components.ItemInformationGizi
import com.davahamka.kinder.presentation.donate.components.OptionPill
import com.davahamka.kinder.presentation.donate.components.QuantityPill
import com.davahamka.kinder.presentation.ui.component.TopBarDescription
import com.davahamka.kinder.presentation.ui.theme.Black1
import com.davahamka.kinder.presentation.ui.theme.Green3
import com.davahamka.kinder.presentation.ui.theme.Grey1
import com.davahamka.kinder.presentation.ui.theme.White1
import com.google.accompanist.flowlayout.FlowRow

@Composable
fun CameraScreen(modifier: Modifier = Modifier, navController: NavController) {
    val emptyImageUri = Uri.parse("file://dev/null")
    var imageUri by remember { mutableStateOf(emptyImageUri) }
    if (imageUri != emptyImageUri) {
        Scaffold(topBar = { TopBarDescription("Informasi Makanan") }) {
            LazyColumn(modifier = modifier) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(18.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Row() {
                            Image(
                                painter = rememberImagePainter(imageUri),
                                modifier = Modifier
                                    .height(140.dp)
                                    .width(140.dp),
                                contentDescription = "Captured image"
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column() {
                                Text(text = "Sawo", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                                Text(text = "234 Kalori")
                            }
                        }
                        Column(modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                            .background(
                                Color(0XFF2F9A49).copy(0.2f),
                                shape = RoundedCornerShape(24.dp)
                            ),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ){
                            Text(text = "Kondisi Bagus", color = Green3, modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp))
                        }
                    }
                    Divider(
                        thickness = 1.dp,
                        modifier = Modifier.padding(vertical = 14.dp, horizontal = 18.dp)
                    )
                    Text(text = "Ringkasan Gizi", fontSize=14.sp, fontWeight= FontWeight.Bold, modifier = Modifier.padding(horizontal = 18.dp))

                    DonutProgress(
                        model = DonutModel(
                            cap = 8f,
                            masterProgress = 1f,
                            gapWidthDegrees = 270f,
                            gapAngleDegrees = 90f,
                            strokeWidth = 40f,
                            backgroundLineColor = Color.LightGray,
                            sections = listOf(
                                DonutSection(amount = 1f, color = Color.Cyan),
                                DonutSection(amount = 1f, color = Color.Red),
                                DonutSection(amount = 1f, color = Color.Green),
                                DonutSection(amount = 0f, color = Color.Blue)
                            )
                        )
                    )

                    LazyRow(
                        modifier = Modifier.padding(start = 18.dp, top = 12.dp)
                    ){
                        item {
                            ItemInformationGizi()
                            ItemInformationGizi()
                            ItemInformationGizi()
                            ItemInformationGizi()
                        }
                    }

                    Column(
                        modifier = Modifier.padding(18.dp)
                    ) {
                        Text(text = "Makanan yang tidak untuk penderita penyakit di bawah ini")

                        FlowRow(
                            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
                            mainAxisSpacing = 12.dp,
                            crossAxisSpacing = 16.dp,
                        ) {
                            OptionPill("Jantung")
                            OptionPill("Diabetes")
                            OptionPill("Lambung")
                        }

                        Text(text = "Jenis makanan ini bermanfaat untuk masalah kesehatan")

                        FlowRow(
                            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
                            mainAxisSpacing = 12.dp,
                            crossAxisSpacing = 16.dp,
                        ) {
                            OptionPill("Lambung")
                            OptionPill("Darah Rendah")
                        }

                        Spacer(modifier = Modifier.height(16.dp))
                        Divider(modifier = Modifier
                            .fillMaxWidth()
                            .height(2.dp))
                        Spacer(modifier = Modifier.padding(16.dp))
                        Text(text = "Masukkan Kuantitas yang Ingin Didonasikan")
                        Row(modifier = Modifier.padding(vertical = 16.dp)) {
                            QuantityPill()
                            QuantityPill()
                            QuantityPill()
                            QuantityPill()
                        }
                        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth(), )

                    }



                    Column(
                        modifier = Modifier.padding(vertical = 18.dp, horizontal = 18.dp)
                    ) {
                        CustomButton(
                            onClick = {
                                navController.navigate(Screen.DescriptionFormScreen.route)
                            },
                            text = "Lanjutkan"
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        CustomButton(
                            onClick = {
                                imageUri = emptyImageUri
                            },
                            text = "Kembali"
                        )
                    }

                }
            }
        }
    } else {
        CameraCapture(
            modifier = modifier,
            onImageFile = { file ->
                imageUri = file.toUri()
            }
        )
    }
}