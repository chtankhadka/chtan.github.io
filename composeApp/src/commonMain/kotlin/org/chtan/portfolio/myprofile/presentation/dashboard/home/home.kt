package org.chtan.portfolio.myprofile.presentation.dashboard.home

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import kotlinx.coroutines.launch
import org.chtan.portfolio.myprofile.data.MyLocalData
import org.chtan.portfolio.myprofile.data.ProjectDetail
import org.chtan.portfolio.myprofile.presentation.components.MyDropDownItems
import org.chtan.portfolio.myprofile.presentation.utils.addResizeListener
import org.chtan.portfolio.myprofile.presentation.utils.getWindowHeightWidth
import org.chtan.portfolio.myprofile.presentation.utils.openLink
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.icons8_facebook
import portfolio.composeapp.generated.resources.icons8_github
import portfolio.composeapp.generated.resources.icons8_linkedin


@Composable
fun home(choosenSkills: MyDropDownItems) {
    val viewWidhtHeight = remember { mutableStateOf<Pair<Int, Int>>(getWindowHeightWidth()) }

    addResizeListener { viewport ->
        viewWidhtHeight.value = viewport
    }

    val boxCardModifier =
        if (viewWidhtHeight.value.first > 400) Modifier.width(400.dp) else Modifier.fillMaxWidth()
    Column(
        modifier = Modifier.fillMaxSize().animateContentSize().verticalScroll(rememberScrollState())
    ) {
        val myIcons = listOf(
            Res.drawable.icons8_facebook to "https://www.facebook.com/besotted.chtan/", Res.drawable.icons8_github to "https://github.com/chtankhadka", Res.drawable.icons8_linkedin to "https://www.linkedin.com/feed/"
        )

        // My descriptions

        Row(
            modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically
        ) {
            FlowRow(
                modifier = Modifier.padding(8.dp).weight(1f),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalArrangement = Arrangement.spacedBy(10.dp),
                itemVerticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = boxCardModifier

                ) {
                        AsyncImage(
                            modifier = Modifier.align(alignment = Alignment.Center).padding(10.dp).clip(shape = RoundedCornerShape(10)).size(300.dp),
                            model = "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/520092422_1542752410473335_5806185386542453646_n.jpg?stp=cp6_dst-jpegr_tt6&_nc_cat=100&ccb=1-7&_nc_sid=f727a1&_nc_ohc=cyJdSvdxp7wQ7kNvwEXiP6e&_nc_oc=AdkuOs8m90_aJXqJzBfCKoR5PZgbuJkM-vwzmjg8wRD-Pcbu6np-WyLSbIRQ23bbw5nwIF1Pz7lVQymXGkY1kJ2g&_nc_zt=23&se=-1&_nc_ht=scontent.fsou1-1.fna&_nc_gid=T8YIdTT00KdKbWK1Fz--7A&oh=00_AfSwa-3LJbPsVF28VfmXjxSynKvEwapRdYi6h9eNHtamPA&oe=688096CE",
                            contentDescription = "Image",
                            contentScale = ContentScale.Crop



                        )


                }


                Column(
                    modifier = boxCardModifier,
                    verticalArrangement = Arrangement.Center.also { Arrangement.spacedBy(10.dp) }) {
                    Text(
                        text = "Hello, I'm Chetan Khadka",
                        style = MaterialTheme.typography.headlineLarge
                    )
                    Text(text = "Application Developer & Data Analyst", style = MaterialTheme.typography.headlineSmall)
                    Text(text = "having High level experience in mobile app development with 3 years of experience and data analysis with 6 months of experience, and producing quality work")

                }

            }

            Column(modifier = Modifier) {
                myIcons.forEach { item ->
                    IconButton(onClick = {
                        openLink(item.second)
                    }) {
                        Image(
                            modifier = Modifier.size(50.dp),
                            painter = painterResource(item.first),
                            contentDescription = null
                        )
                    }

                }
            }

        }


        // work report
        MyLocalData.listOfAPPSkills.filter { if (choosenSkills.type != "All") it.projectType == choosenSkills.type else it.projectType == "App" || it.projectType == "Data" }.forEach { project ->
            myPager(data = project, boxCardModifier)
            Spacer(modifier = Modifier.height(10.dp))
        }


    }
}

@Composable
fun myPager(data: ProjectDetail, boxCardModifier: Modifier) {
    val pagerState = rememberPagerState(pageCount = {
        data.projectImage.size
    })

    val scope = rememberCoroutineScope()
    ElevatedCard(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = data.color)
    ) {
        FlowRow(
            modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            itemVerticalAlignment = Alignment.CenterVertically


        ) {
            Box(
                modifier = boxCardModifier
            ) {
                HorizontalPager(
                    state = pagerState, modifier = Modifier.fillMaxSize()
                ) { page ->

                    Box(modifier = Modifier.size(400.dp)) {
                        AsyncImage(
                            modifier = Modifier.fillMaxSize().align(Alignment.Center),
                            model = data.projectImage[page],
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
                Button(
                    modifier = Modifier.align(alignment = Alignment.CenterStart),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = data.color
                    ),
                    onClick = {
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
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                        contentDescription = null
                    )
                }
                Button(
                    modifier = Modifier.align(alignment = Alignment.CenterEnd),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = data.color
                    ),
                    onClick = {
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
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null
                    )
                }
            }

            Column(
                modifier = boxCardModifier,
                verticalArrangement = Arrangement.Center.also { Arrangement.spacedBy(10.dp) }) {
                Row(modifier = Modifier.wrapContentHeight(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                    Text(
                        text = data.projectName, style = MaterialTheme.typography.headlineLarge.copy(
                            color = data.fontColor, fontSize = 30.sp
                        )
                    )
                    IconButton(onClick = {
                        openLink(data.projectSourceCode?:"")
                    }) {
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(Res.drawable.icons8_github),
                            contentDescription = null
                        )
                    }


                }

                Text(
                    text = data.projectDescription
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Technologies and tools:",
                    style = MaterialTheme.typography.headlineLarge.copy(color = data.fontColor)
                )
                Text(text = data.projectTechnologies)
            }
        }
    }

}
