package org.chtan.portfolio.myprofile.presentation.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalAbsoluteTonalElevation
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import org.chtan.portfolio.app.LottieCard
import org.chtan.portfolio.myprofile.data.MyTopBar
import org.chtan.portfolio.myprofile.presentation.components.DropdownMySkills
import org.chtan.portfolio.myprofile.presentation.components.MyDropDownItems
import org.chtan.portfolio.myprofile.presentation.dashboard.home.home
import org.jetbrains.compose.resources.Font
import portfolio.composeapp.generated.resources.ArianaVioleta_dz2K
import portfolio.composeapp.generated.resources.Res


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(nav: NavHostController) {
    val mySkills = listOf(
        MyDropDownItems.Both,
        MyDropDownItems.AppDeveloper,
        MyDropDownItems.SelectDateRange
    )
    var showDialog by remember { mutableStateOf(true) }

    var selectedItem by remember { mutableStateOf(mySkills[0]) }

    // navigation
    val bottomNavController = rememberNavController()




    Scaffold(topBar = {

        val navBackStackEntry by bottomNavController.currentBackStackEntryAsState()



        ElevatedCard(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
            FlowRow(
                modifier = Modifier.padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalArrangement = Arrangement.Center
            ) {
                Row(modifier = Modifier) {
                    Text(
                        text = "Chetan as ",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontFamily = FontFamily(Font(Res.font.ArianaVioleta_dz2K)),
                            fontSize = 36.sp
                        ),
                    )
                    DropdownMySkills(
                        selectedItem = selectedItem,
                        dropDownItems = mySkills, onClick = { item ->
                            selectedItem = item
                        })
                }

                FlowRow(
                    modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    listOf(
                        MyTopBar.Home, MyTopBar.Skills, MyTopBar.About,
                        MyTopBar.Ideas
                    ).forEach { screen ->
                        val isSelected =
                            navBackStackEntry?.destination?.hierarchy?.any { it.route == screen.id } == true

                            TextButton(onClick = {
                               bottomNavController.navigate(screen.id)
                            }) {
                                Text(
                                    text = screen.label,
                                    style = if (isSelected) MaterialTheme.typography.headlineLarge.copy(
                                        shadow = Shadow(
                                            offset = Offset(2f,2f),
                                            blurRadius = 0.5f,
                                        )
                                    ) else MaterialTheme.typography.headlineMedium
                                )
                            }


                    }



                }
            }
        }


    }, content = {
        if (showDialog) {
            Dialog(
                onDismissRequest = {
                    showDialog = false
                }) {
                Box() {
                    ElevatedCard {
                        LottieCard(
                            modifier = Modifier, filePath = "files/under_maintenance.lottie"
                        )

                    }
                    Text(
                        text = "Under Maintenance",
                        style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(5.dp).align(alignment = Alignment.TopCenter)
                    )
                    IconButton(
                        modifier = Modifier.align(alignment = Alignment.TopEnd), onClick = {
                            showDialog = false
                        }) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = null)
                    }
                }

            }
        }



        Box(
            modifier = Modifier.padding(it).padding(horizontal = 10.dp)
        ) {


            NavHost(
                navController = bottomNavController,
                startDestination = "home",
                modifier = Modifier.padding(horizontal = 3.dp)
            ) {
                composable("home") {
                    home(selectedItem)
                }
                composable("about_me") {

                }
                composable("skills") {

                }
                composable("ideas") {  }
            }
        }

    })
}