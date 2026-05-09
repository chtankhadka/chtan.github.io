package org.chtan.portfolio.myprofile.presentation.dashboard.ideas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import org.chtan.portfolio.myprofile.data.IdeaDetails
import org.chtan.portfolio.myprofile.data.MyLocalData
import org.chtan.portfolio.myprofile.presentation.theme.outlineDark
import org.chtan.portfolio.myprofile.presentation.theme.primaryContainerDark
import org.chtan.portfolio.myprofile.presentation.theme.primaryLight
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.test


@Composable
fun Ideas(boxCardModifier: Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {

        LazyColumn {
            items(MyLocalData.listOfIdeas) { item ->
                Column {
                    //headings, time, date, author etc...
                    Text(
                        buildAnnotatedString {
                            withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
                                withStyle(style = SpanStyle(color = primaryLight)) {
                                    append("${item.ideaName} \n")
                                }
                                append("${item.author} \n")
                                withStyle(
                                    style = SpanStyle(
                                        fontWeight = FontWeight.Normal, color = outlineDark
                                    )
                                ) {
                                    append("${item.ideaDate}")
                                }

                            }
                        })
                    // image and description
                    FlowRow(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        itemVerticalAlignment = Alignment.Top

                    ) {
                        AsyncImage(
                            modifier = Modifier.size(400.dp).padding(10.dp)
                                .clip(shape = RoundedCornerShape(5)),
                            model = item.imageLink?:"",
                            contentScale = ContentScale.Crop,
                            contentDescription = null,
                        )
//                        Image(
//                            modifier = Modifier.size(400.dp).padding(10.dp)
//                                .clip(shape = RoundedCornerShape(5)),
//                            painter = painterResource(Res.drawable.test),
//                            contentScale = ContentScale.Crop,
//                            contentDescription = null,
//                        )
                        Text(
                            modifier = Modifier.weight(1f).widthIn(min = 200.dp), text = buildAnnotatedString {
                                withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
                                        append("${item.ideaDescription}")
                                }
                            })
                    }

                    FlowRow(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        itemVerticalAlignment = Alignment.Top

                    ) {
                        // detailed descriptions
                        item.detailedDescription?.forEach { detailedDescription ->
                            detailedDescription.imageLink?.let {
                                AsyncImage(
                                    modifier = Modifier.size(400.dp).padding(10.dp)
                                        .clip(shape = RoundedCornerShape(5)),
                                    model = detailedDescription.imageLink?:"",
                                    contentScale = ContentScale.Crop,
                                    contentDescription = null,
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            detailedDescription.videoLink?.let {

                            }
                            Text(
                                modifier = Modifier
                                    .weight(1f)
                                    .widthIn(min = 300.dp),
                                text = buildAnnotatedString {
                                    withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
                                        withStyle(style = SpanStyle(color = primaryLight)) {
                                            append("${detailedDescription.title} \n")
                                        }
                                        append("${detailedDescription.description}")
                                    }
                                })
                        }


                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

        }
    }
}