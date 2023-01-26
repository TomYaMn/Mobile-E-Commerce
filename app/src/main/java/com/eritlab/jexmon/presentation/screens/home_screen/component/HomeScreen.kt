package com.eritlab.jexmon.presentation.screens.home_screen.component

import android.annotation.SuppressLint
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.eritlab.jexmon.presentation.dashboard_screen.component.AppBar
import com.eritlab.jexmon.presentation.dashboard_screen.component.NavigationBar
import com.eritlab.jexmon.presentation.graphs.home.HomeNavGraph


@SuppressLint("RememberReturnType")
@Composable
fun HomeScreen(
    navController: NavHostController = rememberNavController(),
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    boxScrollState: ScrollState = rememberScrollState(),
) {

    //topBar visibility state
    val topBarVisibilityState = remember {
        mutableStateOf(true)
    }


    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBar(
                navController = navController,
                isVisible = topBarVisibilityState.value,
                searchCharSequence = {

                })
        },
        bottomBar = {
            NavigationBar(navController = navController) { isVisible ->
                topBarVisibilityState.value = isVisible
            }
        }

    ) { padding ->
        Box(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(boxScrollState)
        ) {
            HomeNavGraph(navHostController = navController)
        }
    }
}