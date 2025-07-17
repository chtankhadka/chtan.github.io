package org.chtan.portfolio.myprofile.presentation.dashboard.home

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import kotlinx.coroutines.launch
import org.chtan.portfolio.myprofile.presentation.utils.addResizeListener
import org.chtan.portfolio.myprofile.presentation.utils.getWindowHeightWidth
import org.chtan.portfolio.myprofile.presentation.utils.openLink
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.ArianaVioleta_dz2K
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.icons8_facebook
import portfolio.composeapp.generated.resources.icons8_github
import portfolio.composeapp.generated.resources.icons8_linkedin

data class ProjectDetail(
    val projectName: String,
    val projectDescription: String,
    val projectTechnologies: String,
    val projectImage: List<DrawableResource>,
    val projectLink: String?,
    val projectSourceCode: String?,
    val projectType: String?,
    val projectSubType: String?,
    val projectNote: String?
)


@Composable
fun home() {
    val viewWidhtHeight = remember {mutableStateOf<Pair<Int, Int>>(getWindowHeightWidth())}

    addResizeListener { viewport ->
        viewWidhtHeight.value = viewport
    }

    val boxCardModifier = if (viewWidhtHeight.value.first > 400) Modifier.width(400.dp) else Modifier.fillMaxWidth()
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 10.dp)
            .animateContentSize()
            .verticalScroll(rememberScrollState())
    ) {
        val myIcons = listOf(
            Res.drawable.icons8_facebook, Res.drawable.icons8_github, Res.drawable.icons8_linkedin
        )
            FlowRow(
                modifier = Modifier.padding(vertical = 10.dp),
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
                        Text(
                            text = item, style = MaterialTheme.typography.headlineMedium
                        )

                    }


                }
            }

            // My descriptions

            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FlowRow(
                    modifier = Modifier.padding(8.dp).weight(1f),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalArrangement = Arrangement.SpaceAround,
                    itemVerticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = boxCardModifier

                    ) {
                        AsyncImage(
                            modifier = Modifier.align(alignment = Alignment.Center).size(400.dp)
                                .padding(4.dp).clip(CircleShape),
                            model = "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/480932282_1436233244458586_1310469937094892216_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=cc71e4&_nc_ohc=pJGnS0c2Z58Q7kNvwGZFw4q&_nc_oc=AdlSY3tAR5xAswZLv2qAkOB-pOYvUugop5GfNbOz00wiF99_JDEhYBxLVWSpCF7hvSg&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=AFlx6FHNgwR7xhMvTFJ32Q&oh=00_AfSHcs39h6nI4WYr_PXkG7CWFvcnd3w7NuMaSXDi7PIrQA&oe=687D6B2F",
                            contentDescription = "Image"
                        )
                    }


                    Column(
                        modifier = boxCardModifier,
                        verticalArrangement = Arrangement.Center.also { Arrangement.spacedBy(10.dp) }
                    ) {
                        Text(
                            text = "Hello, I'm Chetan Khadka",
                            style = MaterialTheme.typography.headlineLarge
                        )
                        Text(text = "Application Developer & Data Analyst")
                        Text(text = "High level experience in mobile app development and data analysis, and producing quality work")
                        Button(
                            onClick = { }, modifier = Modifier.padding(8.dp)
                        ) {
                            Text(text = "Contact Me")
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.Message,
                                contentDescription = "contact me"
                            )
                        }
                    }

                }

                Column(modifier = Modifier) {
                    myIcons.forEach { item ->
                        IconButton(onClick = {
                            openLink("https://www.linkedin.com/feed/")
                        }) {
                            Image(
                                modifier = Modifier.size(50.dp),
                                painter = painterResource(item),
                                contentDescription = null
                            )
                        }

                    }
                }

            }




        // work report

        myPager(myIcons,boxCardModifier)


    }
}

@Composable
fun myPager(myIcons: List<DrawableResource>, BoxCardModifier: Modifier) {
    val pagerState = rememberPagerState(pageCount = {
        myIcons.size
    })

    val scope = rememberCoroutineScope()
    ElevatedCard(modifier = Modifier.fillMaxWidth()) {
        FlowRow(
            modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalArrangement = Arrangement.Center,
            itemVerticalAlignment = Alignment.CenterVertically


        ) {
            Box(
                modifier = BoxCardModifier
            ) {
                HorizontalPager(
                    state = pagerState, modifier = Modifier.fillMaxSize()
                ) { page ->

                    Box(modifier = Modifier.size(400.dp)) {
                        Image(
                            modifier = Modifier.fillMaxSize(),
                            painter = painterResource(myIcons[page]),
                            contentDescription = null,
                        )
                    }
                }
                Row(
                    Modifier.wrapContentHeight().fillMaxWidth().align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp), horizontalArrangement = Arrangement.Center
                ) {
                    repeat(pagerState.pageCount) { iteration ->
                        val color =
                            if (pagerState.currentPage == iteration) Color.DarkGray else Color.LightGray
                        Box(
                            modifier = Modifier.padding(2.dp).clip(CircleShape).background(color)
                                .size(16.dp)
                        )
                    }
                }
                IconButton(
                    modifier = Modifier.align(alignment = Alignment.BottomStart), onClick = {
                        if (pagerState.currentPage == 0) {
                            scope.launch {
                                pagerState.animateScrollToPage(pagerState.pageCount - 1)

                            }
                        } else {
                            scope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage - 1)
                            }
                        }
                    }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }
                IconButton(
                    modifier = Modifier.align(alignment = Alignment.BottomEnd), onClick = {
                        if (pagerState.currentPage == pagerState.pageCount - 1) {
                            scope.launch {
                                pagerState.animateScrollToPage(0)
                            }
                        } else {
                            scope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage + 1)
                            }
                        }
                    }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = null)
                }
            }

            Column(
                modifier = BoxCardModifier,
                verticalArrangement = Arrangement.Center.also { Arrangement.spacedBy(10.dp) }
            ) {
                Text(
                    text = "MoMo Bar (Restaurant App)", style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = "Used for a food ordering app where users can order food, request delivery times, and hotels can \nview customer locations."
                )
                Text(text = "Technologies and tools:", style = MaterialTheme.typography.headlineMedium)
                Text(text = "Kotlin Multiplatform, Koin, Jetpack Compose, MVI architecture, Git, AWS, Rest APIs, Ktor HTTP client etc")
            }
        }
    }

}
