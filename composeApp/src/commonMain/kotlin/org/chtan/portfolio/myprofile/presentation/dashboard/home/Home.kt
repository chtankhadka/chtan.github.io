package org.chtan.portfolio.myprofile.presentation.dashboard.home

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import kotlinx.coroutines.launch
import org.chtan.portfolio.myprofile.data.MyLocalData
import org.chtan.portfolio.myprofile.data.ProjectDetail
import org.chtan.portfolio.myprofile.presentation.components.MyDropDownItems
import org.chtan.portfolio.myprofile.presentation.theme.primaryContainerDark
import org.chtan.portfolio.myprofile.presentation.theme.primaryContainerLight
import org.chtan.portfolio.myprofile.presentation.theme.primaryLight
import org.chtan.portfolio.myprofile.presentation.utils.openLink
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.aboutme
import portfolio.composeapp.generated.resources.icons8_facebook
import portfolio.composeapp.generated.resources.icons8_github
import portfolio.composeapp.generated.resources.icons8_linkedin
import portfolio.composeapp.generated.resources.test


@Composable
fun Home(choosenSkills: MyDropDownItems, boxCardModifier: Modifier) {

    Column(
        modifier = Modifier.fillMaxSize().animateContentSize().verticalScroll(rememberScrollState())
    ) {
        val myIcons = listOf(
            Res.drawable.icons8_facebook to "https://www.facebook.com/besotted.chtan/",
            Res.drawable.icons8_github to "https://github.com/chtankhadka",
            Res.drawable.icons8_linkedin to "https://www.linkedin.com/feed/"
        )
        // My descriptions
        Box(
            modifier = Modifier.fillMaxSize()// or a fixed height like 420.dp
        ) {
//            Image(
//                modifier = Modifier.fillMaxSize().height(IntrinsicSize.Min),
//                painter = painterResource(Res.drawable.test),
//                contentDescription = null,
//                contentScale = ContentScale.Crop
//
//            )

            // Background image that scrolls slower

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
                            modifier = Modifier.fillMaxWidth().align(alignment = Alignment.Center)
                                .padding(10.dp).clip(shape = RoundedCornerShape(10)),
                            model = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/pp.jpg",
                            contentDescription = "Image",
                            contentScale = ContentScale.Crop
                        )
//                        Image(
//                            modifier = Modifier.fillMaxWidth().align(alignment = Alignment.Center)
//                                .padding(10.dp).clip(shape = RoundedCornerShape(10)),
//                            painter = painterResource(Res.drawable.test),
//                            contentDescription = "Image",
//                            contentScale = ContentScale.Crop
//                        )
                    }

                    Column(
                        modifier = boxCardModifier.weight(1f).widthIn(min = 200.dp),
                        verticalArrangement = Arrangement.Center.also { Arrangement.spacedBy(10.dp) }) {
                        Text(
                            text = "Hello, I'm Chetan Khadka",
                            style = MaterialTheme.typography.headlineLarge
                        )
                        Text(
                            buildAnnotatedString {
                                withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
                                    withStyle(style = SpanStyle(color = primaryLight)) {
                                        append("Application Developer & Data Analyst ")
                                    }
//                                    withStyle(
//                                        style = SpanStyle(
//                                            fontWeight = FontWeight.Bold, color = Color.Red
//                                        )
//                                    ) {
//                                        append("World\n")
//                                    }
                                    append("having High level experience in mobile app development with 3 years of experience and data analysis with 6 months of experience, and producing quality work")
                                }
                            })

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
        }


        // work report
        MyLocalData.listOfAPPSkills.filter { if (choosenSkills.type != "All") it.projectType == choosenSkills.type else it.projectType == "App" || it.projectType == "Data" }
            .forEach { project ->
                MyPager(data = project, boxCardModifier)
                Spacer(modifier = Modifier.height(10.dp))
            }


    }
}

@Composable
fun MyPager(data: ProjectDetail, boxCardModifier: Modifier) {
    val pagerState = rememberPagerState(pageCount = {
        data.projectImage.size
    })

    val scope = rememberCoroutineScope()
    FlowRow(
        modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        itemVerticalAlignment = Alignment.Top

    ) {

        Column(
            modifier = boxCardModifier, horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(end = 40.dp)
            ) { page ->
                AsyncImage(
                    modifier = Modifier.size(400.dp).padding(10.dp)
                        .clip(shape = RoundedCornerShape(5)),
                    model = data.projectImage[page],
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                )

//                Image(
//                    modifier = Modifier.size(400.dp)
//                        .padding(10.dp)
//                        .clip(shape = RoundedCornerShape(5)),
//                    painter = painterResource(Res.drawable.test),
//                    contentScale = ContentScale.Crop,
//                    contentDescription = null,
//                )

            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                Modifier.wrapContentHeight().fillMaxWidth().padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(pagerState.pageCount) { iteration ->
                    GlowingPagerDot(
                        isSelected = iteration == pagerState.currentPage, onClickPagerDot = {
                            scope.launch {
                                pagerState.animateScrollToPage(iteration)
                            }

                        })
                }
            }
        }

        Column(
            modifier = Modifier.weight(1f).widthIn(min = 200.dp, max = 400.dp),
            verticalArrangement = Arrangement.Center.also { Arrangement.spacedBy(10.dp) }) {
            Row(
                modifier = Modifier.wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(
                    text = data.projectName, style = MaterialTheme.typography.headlineLarge.copy(
                        color = primaryContainerDark, fontSize = 30.sp
                    )
                )
                IconButton(onClick = {
                    openLink(data.projectSourceCode ?: "")
                }) {
                    Image(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(Res.drawable.icons8_github),
                        contentDescription = null
                    )
                }


            }

            Text(
                text = data.projectDescription, maxLines = 10
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Technologies and tools:",
                style = MaterialTheme.typography.headlineLarge.copy(color = primaryContainerLight)
            )
            Text(text = data.projectTechnologies)
        }
    }


}

@Composable
fun GlowingPagerDot(
    isSelected: Boolean, onClickPagerDot: () -> Unit = {}, modifier: Modifier = Modifier
) {
    val infiniteTransition = rememberInfiniteTransition()
    val glowPulse by infiniteTransition.animateFloat(
        initialValue = 1f, targetValue = 1.22f, animationSpec = infiniteRepeatable(
            animation = tween(1100, easing = EaseInOut), repeatMode = RepeatMode.Reverse
        )
    )

    val dotSize = 10.dp
    val glowColor = MaterialTheme.colorScheme.primary

    Box(
        modifier = modifier.padding(10.dp)                    // Extra space for glow to breathe
        .size(dotSize + 10.dp).graphicsLayer {
            scaleX = if (isSelected) glowPulse else 1f
            scaleY = if (isSelected) glowPulse else 1f
        }.clickable {
            onClickPagerDot()
        }) {
        // Soft outer glow layer
        if (isSelected) {
            Box(
                modifier = Modifier.size(dotSize + 10.dp).align(Alignment.Center).clip(CircleShape)
                    .background(glowColor.copy(alpha = 0.08f)).shadow(
                        elevation = 24.dp,
                        spotColor = glowColor,
                        ambientColor = glowColor,
                        shape = CircleShape
                    )

            )
        }

        // Main glowing dot
        Box(
            modifier = Modifier.size(dotSize).align(Alignment.Center).clip(CircleShape).background(
                glowColor
            ).shadow(
                elevation = if (isSelected) 14.dp else 2.dp,
                spotColor = glowColor,
                ambientColor = glowColor,
                shape = CircleShape
            )
        )
    }
}