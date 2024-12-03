package com.example.compose_playground

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun TopScreen(
    navController: NavController,
    onClickForQiita: () -> Unit
) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Home")
                },
                modifier = Modifier.shadow(elevation = 2.dp)
            )

        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = { Text(text = "Home") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "setting"
                        )
                    },
                    label = { Text(text = "Setting") }
                )
            }
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Experience Jetpack Compose",
                fontSize = 24.sp
            )
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                items(Components.entries.size) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp)

                    ) {
                        Text(text = Components.entries[it].toString() + " Component")
                    }
                }

            }
        }
    }
}

enum class Components {
    AppBar,
    Badge,
    Button,
    Card,
    Carousel,
    CheckBox,
    Chips,
    DataPicker,
    Dialog,
    Divider,
    List,
    Menu,
    Navigation,
    ProgressIndicator,
    RadioButton,
    Search,
    Sheet,
    Slider,
    SnackBar,
    Switch,
    Tab,
    TextField,
    TimePicker,
    Tooltip,
    ForQiita,
}