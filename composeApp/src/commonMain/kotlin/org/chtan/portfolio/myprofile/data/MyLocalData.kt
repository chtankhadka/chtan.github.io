package org.chtan.portfolio.myprofile.data

import androidx.annotation.ColorLong
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource

data class ProjectDetail(
    val projectName: String,
    val projectDescription: String,
    val projectTechnologies: String,
    val projectImage: List<String>,
    val projectLink: String?,
    val projectSourceCode: String?,
    val projectType: String?,
    val projectSubType: String?,
    val projectNote: String?,
    val color: Color = Color.Unspecified,
    val fontColor: Color = Color.Unspecified

)
//ProjectDetail(
//projectName = "",
//projectDescription = "",
//projectTechnologies = "",
//projectImage = listOf(),
//projectLink = null,
//projectSourceCode = null,
//projectType = "",
//projectSubType = "",
//projectNote = ""
//),

data class DetailedDescription(
    val title: String?, val imageLink: String?, val videoLink: String?, val description: String?
)

data class IdeaDetails(
    val ideaName: String,
    val author: String?,
    val ideaDate: String?,
    val imageLink: String?,
    val ideaDescription: String?,
    val progress: String?,
    val detailedDescription: List<DetailedDescription>? = null
)

object MyLocalData {
    val listOfAPPSkills = listOf(
        ProjectDetail(
            projectName = "Momo Bar",
            projectDescription = "Used for a food ordering app where users can order food, request delivery times, and hotels can view customer locations.",
            projectTechnologies = "Kotlin, Dagger Hilt, Jetpack Compose, Lottie Animation, Clean Architecture, Git, Firebase, Google Map SDK etc.",
            projectImage = listOf<String>(
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/Picture+1.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/momo2.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/momo3.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/momo4.png",
            ),
            projectLink = null,
            projectSourceCode = "https://drive.google.com/drive/folders/1q_KEnE-ih2BRt-12JVuoI7XOiA2_Z5QS?usp=sharing",
            projectType = "App",
            projectSubType = "Android",
            projectNote = "",
            color = Color(211, 219, 162),
            fontColor = Color.Yellow
        ),

        ProjectDetail(
            projectName = "Credit Score Analysis",
            projectDescription = "conducted an analysis of a US credit customer dataset. You began by loading and exploring the data through descriptive statistics, data type checks, and null value counts. This was followed by a comprehensive visualization phase where you examined the distribution of credit scores, the relationship between credit score and employment type, credit utilization rate, annual income, average monthly spend, and education level. You also generated a correlation heatmap to understand the relationships between numerical features. For the machine learning phase, you preprocessed the data by dropping unnecessary columns, encoding categorical variables, splitting the data into training and testing sets, and scaling the features. Finally, you built and evaluated a RandomForestRegressor model to predict credit scores, assessing its performance using MAE, RMSE, and R-squared, visualizing actual versus predicted scores, and identifying the most important features influencing credit scores, highlighting the significance of credit utilization rate and number of late payments.",
            projectTechnologies = "Tableau, Python, pandas, NumPy, Matplotlib, Seaborn, sklearn etc",
            projectImage = listOf<String>(
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/uscredit2.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/uscredit1.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/uscredit4.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/uscredit3.png",
            ),
            projectLink = null,
            projectSourceCode = "https://drive.google.com/drive/folders/1q_KEnE-ih2BRt-12JVuoI7XOiA2_Z5QS?usp=drive_link",
            projectType = "Data",
            projectSubType = "colab",
            projectNote = "",
            color = Color(108, 138, 186),
            fontColor = Color.Blue
        ), ProjectDetail(
            projectName = "Popeyes Overview",
            projectDescription = "Popeyes and Deliveroo data are analyzed to extract key information, enabling us to predict peak hours and prepare for upcoming delivery orders.",
            projectTechnologies = "Tableau, Google Sheets etc",
            projectImage = listOf<String>(
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/gsPop1.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/gsPop2.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/gsPop3.png",
            ),
            projectLink = null,
            projectSourceCode = "https://drive.google.com/drive/folders/1keT1F-RQo1T1KmP_WO0kZprmuvhSTPTF?usp=sharing",
            projectType = "Data",
            projectSubType = "googlesheet",
            projectNote = "",
            color = Color(224, 120, 112),
            fontColor = Color.Red
        ),

        ProjectDetail(
            projectName = "Expense Management",
            projectDescription = "Used for budget tracking and expense management, ideal for group purchases or shared expenses, as it helps visualize all expenses through graphical data.",
            projectTechnologies = "Kotlin Multiplatform, Koin, Jetpack Compose, MVI architecture, Git, AWS, Rest APIs, Ktor HTTP client etc.",
            projectImage = listOf(
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/exp1.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/exp2.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/exp3.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/exp4.png"
            ),
            projectLink = null,
            projectSourceCode = "https://github.com/chtankhadka/financeManagement",
            projectType = "App",
            projectSubType = "KMP",
            projectNote = "",
            color = Color(201, 240, 187),
            fontColor = Color(76, 96, 10)
        ), ProjectDetail(
            projectName = "EV Dashboard",
            projectDescription = "Analysed data to shows EV data with 85,802 Battery Electric Vehicles outnumbering 26,482 Plug-in Hybrids, a strong presence in King County (58,965) led by Tesla (51,997), and a peak adoption of 25,421 vehicles in 2023, indicating growing demand.",
            projectTechnologies = "Tableau",
            projectImage = listOf<String>(
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/evDashboard.png",
            ),
            projectLink = null,
            projectSourceCode = "https://drive.google.com/drive/folders/1WPUxB-JRxMiE3RcBzfNMeIpWRo5xsyGp?usp=drive_link",
            projectType = "Data",
            projectSubType = "tableau",
            projectNote = "",
            color = Color(224, 120, 112),
            fontColor = Color.Red
        ),

        ProjectDetail(
            projectName = "FF",
            projectDescription = "Designed for families or friends, this app shares information with a group you’ve joined, including details like location, mobile battery percentage, weather updates, and phone mode (silent, general, vibration, etc.). Users can also post photos and share comments on them.",
            projectTechnologies = "Kotlin, Dagger Hilt, Jetpack Compose, Lottie Animation, Git, Firebase, Google Map SDK etc.",
            projectImage = listOf(
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/ff1.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/ff2.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/ff3.png",
            ),
            projectLink = null,
            projectSourceCode = "https://github.com/chtankhadka/FF",
            projectType = "App",
            projectSubType = "Android",
            projectNote = "",
            color = Color(162, 219, 162),
            fontColor = Color.Green
        ),

        ProjectDetail(
            projectName = "Ginger Pig",
            projectDescription = "Focused on managing hotel rooms. Check In, Checkout, Cleaned and Ready, Refreshes, and most importantly helps admin for making rota. Including staff can do their attendance and provide availability, message etc.",
            projectTechnologies = "Kotlin, Koin, Jetpack Compose, Lottie Animation, Git etc.",
            projectImage = listOf(
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/ginger1.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/ginger2.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/ginger3.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/ginger4.png",
            ),
            projectLink = null,
            projectSourceCode = "https://github.com/chtankhadka/ginger",
            projectType = "App",
            projectSubType = "KMP",
            projectNote = "",
            color = Color(220, 230, 245),
            fontColor = Color.Gray
        ), ProjectDetail(
            projectName = "Talk More",
            projectDescription = "focused on dating sites with some new privacy technology and fun.",
            projectTechnologies = "Kotlin, Koin, Jetpack Compose, Lottie Animation, Git, Google Map and Apple Map etc.",
            projectImage = listOf(
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/tm1.png",
                "https://chtanportfolio.s3.eu-north-1.amazonaws.com/tm2.png",
            ),
            projectLink = null,
            projectSourceCode = "https://github.com/chtankhadka/personalWork",
            projectType = "App",
            projectSubType = "KMP>",
            projectNote = "",
            color = Color(220, 230, 245),
            fontColor = Color.Gray
        )


    )


    val listOfIdeas = listOf(
        IdeaDetails(
            ideaName = "Ultra Low-Cost Near-Space Balloon Platform for Village Monitoring",
            author = "Chetan Khadka",
            ideaDate = "06-05-2026",
            imageLink = "https://assets.grok.com/users/5c85631b-a47c-43ef-8080-dbbbe11d99eb/generated/6aa4a14b-a9c8-4c07-bdb5-3de8ffb5bd32/preview_image.jpg?cache=1",
            ideaDescription = "A handmade stratospheric balloon platform designed for remote mountain villages. The system combines a helium balloon with a small fan mechanism for lift assistance and height control. It operates without balloon burst and reaches 25–35 km altitude. The platform supports village security, wildlife tracking, disaster early warning, and high-altitude Earth observation.",
            progress = "20%",
            detailedDescription = listOf(
                DetailedDescription(
                    title = "System Description",
                    imageLink = null,
                    videoLink = null,
                    description = "" + "The platform uses a helium-filled balloon for primary lift while a small fan/propeller system provides additional support and stability. Height is maintained by adjusting air inside the balloon and controlling fan speed, eliminating the need for balloon burst. The payload includes solar panels for continuous power, a camera for live imaging, GPS tracking, and a parachute for safe recovery and reuse."
                ), DetailedDescription(
                    title = "Operational Features",
                    imageLink = null,
                    videoLink = null,
                    description = "The system reaches 25–35 km altitude (edge of space) and stays aloft for several hours to 1–2 days per flight. It is designed for wide-area security monitoring, wildlife tracking, flood and landslide detection, and high-resolution Earth photography. Solar panels with battery backup provide power, and the parachute with GPS ensures safe recovery"
                ), DetailedDescription(
                    title = "Advantages",
                    imageLink = null,
                    videoLink = null,
                    description = "The fan assistance significantly reduces helium consumption. The payload is fully reusable, enabling multiple flights. It offers wide coverage ideal for mountainous terrain, remains portable for village launches, and supports both practical local monitoring and space-related research."
                )
            )
        )
    )
}

sealed class MyTopBar(
    val label: String, val id: String
) {
    data object Home : MyTopBar(label = "Home", id = "home")
    data object About : MyTopBar(label = "About Me", id = "about_me")
    data object Skills : MyTopBar(label = "Skills", id = "skills")
    data object Ideas : MyTopBar(label = "Ideas", id = "ideas")
}