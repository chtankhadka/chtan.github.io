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



object MyLocalData{
    val listOfAPPSkills = listOf<ProjectDetail>(
        ProjectDetail(
            projectName = "Momo Bar",
            projectDescription = "Used for a food ordering app where users can order food, request delivery times, and hotels can view customer locations.",
            projectTechnologies = "Kotlin, Dagger Hilt, Jetpack Compose, Lottie Animation, Clean Architecture, Git, Firebase, Google Map SDK etc.",
            projectImage = listOf<String>(
"https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/520871858_1542704717144771_8063619041379559501_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=f727a1&_nc_ohc=OAYBLzswXAUQ7kNvwF5NBYi&_nc_oc=AdmFu9VAC4fPB1NJ_Ye6CM1_5AbfovVj25zBJAx1AF5h5xB1LLGk9l64-pHmSjfGHezJbfNGzMeRCLzxGx5sg5zV&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=JYATIOCjRG_Sv_5Z7O5bpQ&oh=00_AfS80olFDMXSMeSKG_sfBGhejrUxOZTmF6k1Hhs8r_HVZQ&oe=68807BD1",
"https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/519250676_1542704633811446_4545169681934598696_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=f727a1&_nc_ohc=jIa_i1oxPwcQ7kNvwFjNEZr&_nc_oc=AdmF8Gix2JMmZFCuCHSC-IKymlt_LB85aqhO43J3r0gsMV06T4cD7AhvMcTEpxbAqQ6iKtjHmeZqwaV099XJecMC&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=1019nkRjd4aoBazYJDoFyw&oh=00_AfS2JboZ1uwPGAl3wUmdZcRBIDK6NEmZdmSa3D5FoWU_kw&oe=68809845",
                "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/521541081_1542704590478117_1494174581335034992_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=f727a1&_nc_ohc=LB4FfDTl_8AQ7kNvwHUD5GM&_nc_oc=AdltfQ5PJAACVaDOO71WSQZdSPGT901Rl6Nw4Qi-sPXC_HMp4W1c9kL3UCB8G7hHJU3Uvntclqsh6nH5k7XROL0_&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=G1vUset0l2shDUIFHsl5ng&oh=00_AfTQf3CNznIYddKps_1aEm_Y7uTy4vxyaaJcxVpBk1K2Nw&oe=68807A87",
 "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/520497311_1542704680478108_4122194657384908815_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=f727a1&_nc_ohc=SOnl6LrbbQMQ7kNvwHh-faZ&_nc_oc=Adn8FzoYaUZahLOoTkYNljH3Ie6-f9Wm2ytHpxjX276_dSMZCkzl1FGLsRs5lJ7CT70MwcruaQjlN7MAlDMNvnEn&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=JZzo9jwoI7TpFfHcn7iHSw&oh=00_AfT1Vl5NTWkNhXKR4k8EPkPfNwt8nb-E3bySfbaKQ46wog&oe=6880963E"
            ),
            projectLink = null,
            projectSourceCode = "https://github.com/chtankhadka/orderDelivery",
            projectType = "App",
            projectSubType = "Android",
            projectNote = "",
            color = Color(211, 219, 162),
            fontColor = Color.Yellow
        ), ProjectDetail(
            projectName = "Expense Management",
            projectDescription = "Used for budget tracking and expense management, ideal for group purchases or shared expenses, as it helps visualize all expenses through graphical data.",
            projectTechnologies = "Kotlin Multiplatform, Koin, Jetpack Compose, MVI architecture, Git, AWS, Rest APIs, Ktor HTTP client etc.",
            projectImage = listOf(
                "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/519625881_1542704330478143_3618497461116392090_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=f727a1&_nc_ohc=DVgP3yhDHeMQ7kNvwGuFmaY&_nc_oc=AdmxxgYZqVB32PLrkHutFdnxbkDZ_WoRXfZHsaBHfbDG_NcZTjOXG1CC-cfiF50Mq-WEHr4-XwrUSoHe92LSU8W1&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=yqyVjliT7mT8s4kwj8aibw&oh=00_AfRyIIcQW5sIcacUYqgJ3R3x9065PoA94ThjVDKrMj3c0w&oe=688090D7",
                "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/519943276_1542704297144813_3883609297874416791_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=f727a1&_nc_ohc=Hrxvs2-elL0Q7kNvwFbkVol&_nc_oc=AdkAIQ1nuc7xBn8FeCCGOB15vVMc1biR_uOlSsSEI_qP6t1DBpPdcl526huSPVi3arWBq7UoTqK6orjK-UXmmcoh&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=2NCbT3Xgij8fzPAazKMZLg&oh=00_AfTRhWPuWyXf1EcpFh88X7GzLCtYdZlF9ZZ7Gfo48-Oi7Q&oe=688093AF",
                "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/520260081_1542704333811476_8825849413527394218_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=f727a1&_nc_ohc=1pP2ofJZKvMQ7kNvwF04ctd&_nc_oc=AdmRcM_k88lfuZnE_2qjgVikGm3L9UXMo-mZdskPXFRekzL53j5aWLXTJzt0i_0sBBegddDQabB08yZC2iw6_RJH&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=LtA2vzdFzsNINL9LFAHWOA&oh=00_AfRaWnzND7W1AzSpKIYFG0rAivJOnaE56KJKfTFKx3HBnw&oe=68809C9E",
                "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/522583349_1542704387144804_7157659926581151079_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=f727a1&_nc_ohc=_af345gqeBkQ7kNvwGXLJzx&_nc_oc=AdkCGZUN83OaOa3xFGK0QsV0V8KAalfcuxf8jO2c3WHECF60GIJk8e36NsScKw1129oOJJDESr6hluth_MG142p9&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=YOFOWd4rbetfppVQ-0BNCg&oh=00_AfTRF4aPQdrkjau-42L-3XOmtXVdF8O6l5BScPRIYYchMQ&oe=6880A8FE"
            ),
            projectLink = null,
            projectSourceCode = "https://github.com/chtankhadka/financeManagement",
            projectType = "App",
            projectSubType = "KMP",
            projectNote = "",
            color = Color(201, 240, 187),
            fontColor = Color(76, 96, 10)
        ), ProjectDetail(
            projectName = "FF",
            projectDescription = "Designed for families or friends, this app shares information with a group you’ve joined, including details like location, mobile battery percentage, weather updates, and phone mode (silent, general, vibration, etc.). Users can also post photos and share comments on them.",
            projectTechnologies = "Kotlin, Dagger Hilt, Jetpack Compose, Lottie Animation, Git, Firebase, Google Map SDK etc.",
            projectImage = listOf(
                "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/520812958_1542704463811463_5037189322372714043_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=f727a1&_nc_ohc=dxIvmCTpgdcQ7kNvwGwfZL2&_nc_oc=Adng5JOEGfI_OwhmaTtbDDvhpt_tiKYYrh4mqfYlmoCaAc8JDNVINacRoz7FhIG5ttMM6rkjXwA06PUdvyx6GFbC&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=XRXOiqW2V_e5Sd2ndexy3Q&oh=00_AfS-2Cw7xP3D1aKvI8tAg6jTDVmor_0xULWL7uvICy8GnA&oe=6880A061",
                "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/520051501_1542704483811461_617988588039944430_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=f727a1&_nc_ohc=n8RiABPlfjsQ7kNvwHF21Qr&_nc_oc=AdmYDvRs6CABDbFcUjqeJrFb_ah28gERhjXLOQbp1eIGZcVK7Z8qNL5LyPkjrSysOeGcZAbwkQfZeRMOJjbQsQTU&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=sZ8-uA9whbiwCAdGEUmpSQ&oh=00_AfRFatJLe3j6ukoyja-OSZ_z9xF74_N1M4jRmPLoOjUpug&oe=68808EA2",
                "https://scontent.fsou1-1.fna.fbcdn.net/v/t39.30808-6/519679891_1542704583811451_4120962157616230798_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=f727a1&_nc_ohc=Us7VRg7siX4Q7kNvwGlT7pT&_nc_oc=AdlhKAZYToOp2R54g9EX5NMPF2Q97y3flNMiTFq5w4aXcb3DIrNTQPfPIuzb5c9-c-oUsF5L3A70dYyb264EGEmW&_nc_zt=23&_nc_ht=scontent.fsou1-1.fna&_nc_gid=P1d1IrorC2JsZ2VfY-LpNA&oh=00_AfQC46WrWU1_Ppp85fQfjrBg6tEMpL7t_6gigPIxUr1qWQ&oe=68808A71"
            ),
            projectLink = null,
            projectSourceCode = "https://github.com/chtankhadka/FF",
            projectType = "App",
            projectSubType = "Android",
            projectNote = "",
            color = Color(162, 219, 162),
            fontColor = Color.Green
        ),
    )
}

sealed class MyTopBar(
    val label : String,
    val id: String
){
    data object Home: MyTopBar(label = "Home", id = "home")
    data object About: MyTopBar(label = "About Me", id = "about_me")
    data object Skills: MyTopBar(label = "Skills", id = "skills")
    data object Ideas: MyTopBar(label = "Ideas", id = "ideas")
}