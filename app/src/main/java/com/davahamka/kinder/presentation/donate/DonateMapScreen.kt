package com.davahamka.kinder.presentation.donate

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.davahamka.kinder.dummy.DonateDummy
import com.davahamka.kinder.presentation.home.components.ModalBottomShare
import com.davahamka.kinder.presentation.home.components.ModalDetailReceiver
import com.davahamka.kinder.static.NearestDataStatic
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DonateMapScreen(navController: NavHostController) {
        val singapore = LatLng(-7.983908, 	112.621391)

        val modalBottomSheetState = rememberModalBottomSheetState(
            ModalBottomSheetValue.Hidden
        )

        val coroutineScope = rememberCoroutineScope()

        val cameraPositionState = rememberCameraPositionState {
            position = CameraPosition.fromLatLngZoom(singapore, 16f)
        }
    
        ModalBottomSheetLayout(
            sheetState = modalBottomSheetState,
            sheetContent = {
                ModalDetailReceiver(navController)
        }) {
            GoogleMap(
                modifier = Modifier.fillMaxSize(),
                cameraPositionState = cameraPositionState
            ) {
                NearestDataStatic.dataCard.forEach {
                    Marker(
                        position = it.position,
                        title = it.name
                    )
                }
                Marker(position = singapore, onClick = {
                    coroutineScope.launch { modalBottomSheetState.show() }
                    Log.d("TEST","SINGA")
                    true
                })

            }
        }
    

}