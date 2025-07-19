package org.chtan.portfolio.myprofile.presentation.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import io.ktor.websocket.Frame.Text
import org.chtan.portfolio.app.LottieCard
import org.chtan.portfolio.myprofile.presentation.dashboard.home.home
import org.jetbrains.compose.resources.Font
import portfolio.composeapp.generated.resources.ArianaVioleta_dz2K
import portfolio.composeapp.generated.resources.Res

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard(){
    Scaffold(
        topBar = {
            ElevatedCard(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
                FlowRow(
                    modifier = Modifier.padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Chetan", style = MaterialTheme.typography.titleLarge.copy(
                            fontFamily = FontFamily(Font(Res.font.ArianaVioleta_dz2K)), fontSize = 36.sp
                        ), modifier = Modifier.weight(0.5f)
                    )
                    FlowRow(
                        modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        listOf("Home", "About", "Skills", "Projects", "Contact").forEach { item ->
                            TextButton(onClick = {

                            }) {
                                Text(
                                    text = item, style = MaterialTheme.typography.headlineMedium
                                )
                            }


                        }


                    }
                }
            }


        },
        content = {
            var showDialog by remember { mutableStateOf(true) }
            if (showDialog){
                Dialog(
                    onDismissRequest = {
                        showDialog = false
                    }
                ) {
                    Box(){
                        ElevatedCard {
                            LottieCard(modifier = Modifier, filePath = "files/under_maintenance.lottie")

                        }
                        Text(
                            text = "Under Maintenance",
                            style = MaterialTheme.typography.headlineLarge,
                            modifier = Modifier.padding(5.dp).align(alignment = Alignment.TopCenter)
                        )
                        IconButton(
                            modifier = Modifier.align(alignment = Alignment.TopEnd),
                            onClick = {
                            showDialog = false
                        }) {
                            Icon(imageVector = Icons.Default.Close, contentDescription = null)
                        }
                    }

                }
            }



            Box(
                modifier = Modifier.padding(it).padding(horizontal = 10.dp)
            ){
                home()
            }

        }
    )
}