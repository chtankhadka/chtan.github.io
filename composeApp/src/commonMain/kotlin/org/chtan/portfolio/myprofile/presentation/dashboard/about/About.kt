package org.chtan.portfolio.myprofile.presentation.dashboard.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.chtan.portfolio.myprofile.presentation.theme.outlineDark
import org.chtan.portfolio.myprofile.presentation.theme.primaryLight
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.aboutme

@Composable
fun About() {
    val scrollState = rememberScrollState()

    Box(modifier = Modifier.fillMaxSize()) {
        // 1. Your blurred parallax background
        Image(
            painter = painterResource(Res.drawable.aboutme),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .padding(end = 20.dp)
                .graphicsLayer {
                    translationX = scrollState.value / 10f
                }
                .blur(5.dp),
            alpha = 0.25f
        )

        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(scrollState)
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
                        append("I'm ")
                        withStyle(style = SpanStyle(color = primaryLight)) {
                            append("Chetan Khadka ")
                        }
                        append("a passionate developer, lifelong inventor, and visionary thinker with a ")

                        withStyle(style = SpanStyle(color = primaryLight)) {
                            append("BSc in Computer Science and Information Technology (CSIT) and an MSc in Management with Data Analytics.\n\n")
                        }

                        append("Growing up surrounded by the love of family and friends, I was always full of deep questions about life, the universe, and how technology could solve real problems — especially for poor and underprivileged communities. I loved gazing at the sky for hours, lost in thought about bigger possibilities. This curiosity pushed me to build and experiment from a young age: I created a small DIY boat powered by a dynamo, constructed a real electricity-generating windmill, and experimented with magnetic energy in pursuit of “free energy.” These early inventions sparked my lifelong drive to create solutions that can truly change the world. \n\n")

                        append("In school and college, I wasn’t always the official topper, but many top-performing students regularly learned from me. My greatest strength has always been practical, hands-on application of knowledge. I developed strong expertise by questioning theories deeply and quickly mastering new technologies — ethical hacking, CorelDRAW, PHP, Python, Blender, and more. Whenever I committed to a new language or framework, I often performed better than others.\n\n")
                        append("My journey has been full of exploration and big ideas. My endless curiosity sometimes led me to jump between projects and leave some halfway when even greater concepts emerged — but this same passion helped me land my first job as a Mobile Developer in an IT company. I learned Kotlin on the job and delivered strong results despite entering a completely new domain. Life later took me away from full-time development, but I never stopped creating.\n\n")
                        append("Today, I am building a Kotlin Multiplatform + Compose portfolio project that runs on Android, iOS, Web, and Desktop. I continue developing unique applications and refining ambitious ideas — including concepts like MiniWorld and other innovative solutions at the hardware-software intersection. With my MSc in Management and Data Analytics, I combine deep technical skills with strategic and data-driven thinking to turn visionary ideas into scalable, impactful realities.\n\n")
                        append(
                            "What defines me:\n" +
                                    "\n" +
                                    "Strong practical expertise across multiple languages and frameworks, especially Kotlin\n" +
                                    "A visionary mindset fueled by big ideas that can change the world\n" +
                                    "Deep empathy and commitment to solving problems for others\n" +
                                    "Resilience, adaptability, and stubborn dedication to my own unique path\n" +
                                    "\n" +
                                    "I’m actively seeking new opportunities where bold innovation, technical excellence, creativity, and meaningful real-world impact are valued. I’m ready to bring my inventions, practical skills, and world-changing vision to the right team or project.\n"
                        )


                    }
                })


        }
    }
}


// Custom Parallax Modifier (very simple)
fun Modifier.parallax(scrollState: ScrollState, rate: Int = 2): Modifier = this.then(
    Modifier.layout { measurable, constraints ->
        val placeable = measurable.measure(constraints)
        val yOffset = if (rate > 0) scrollState.value / rate else scrollState.value

        layout(placeable.width, placeable.height) {
            placeable.place(x = 0, y = yOffset)
        }
    })