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
            imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/satellite1.jpg",
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
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/satellite2.png",
                    videoLink = null,
                    description = "The system reaches 25–35 km altitude (edge of space) and stays aloft for several hours to 1–2 days per flight. It is designed for wide-area security monitoring, wildlife tracking, flood and landslide detection, and high-resolution Earth photography. Solar panels with battery backup provide power, and the parachute with GPS ensures safe recovery"
                ), DetailedDescription(
                    title = "Advantages",
                    imageLink = null,
                    videoLink = null,
                    description = "The fan assistance significantly reduces helium consumption. The payload is fully reusable, enabling multiple flights. It offers wide coverage ideal for mountainous terrain, remains portable for village launches, and supports both practical local monitoring and space-related research."
                )
            )
        ), IdeaDetails(
            ideaName = "Decentralized Offline Job & Advertising Network Using ESP32",
            author = "Chetan Khadka",
            ideaDate = "06-05-2026",
            imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/job-esp1.png",
            ideaDescription = "A low-cost, fully offline system that connects job seekers and employers locally without internet or mobile data. Each person carries or places a small ESP32-based device that automatically broadcasts and exchanges job profiles or advertisements when devices come within range. All data is stored locally and can be checked later. Perfect for cities, villages, and areas with limited internet.",
            progress = "",
            detailedDescription = listOf(
                DetailedDescription(
                    title = "System Description",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/job-esp3.png",
                    videoLink = null,
                    description = "The system uses cheap ESP32 microcontrollers to create a decentralized peer-to-peer network.\n" + "\n" + "Job seekers carry a portable version while moving.\n" + "Job providers and shop owners keep a fixed device at their shop entrance or counter.\n" + "Devices automatically detect each other, exchange basic profile data, and store it locally. No central server or internet is required."
                ), DetailedDescription(
                    title = "How It Works",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/job-esp4.png",
                    videoLink = null,
                    description = "Each device creates its own open WiFi hotspot with a captive portal.\n" + "The portal shows a simple page with job profile or advertisement (name, skills, job type, contact, requirements, etc.).\n" + "While walking or traveling, the device continuously scans for other similar devices.\n" + "When two devices come close (50–100 meters), they automatically exchange data.\n" + "All received profiles are saved on the ESP32 (or microSD card).\n" + "In the evening, the user connects the device to their phone to view all collected job offers or leads.\n" + "\n" + "Two Modes\n" + "\n" + "Job Seeker Mode (Portable): Broadcasts “I am looking for work” + skills.\n" + "Job Provider / Advertiser Mode (Fixed): Placed at shop door, broadcasts job openings or product ads."
                ), DetailedDescription(
                    title = "Advantages",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/job-esp2.png",
                    videoLink = null,
                    description = "Works completely offline — no need for mobile data or internet.\n" + "Very low cost (single device costs \$8–15).\n" + "Fully automatic — no need to talk to anyone or visit offices.\n" + "Useful for both job seekers and small businesses.\n" + "Data stays private on your own device.\n" + "Can be used daily while commuting or walking around the city."
                )
            )

        ), IdeaDetails(
            ideaName = "Hotel Rating App – Instant NFC Rating System",
            author = "Chetan Khadka",
            ideaDate = "09-05-2026",
            imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/rate4.jpg",
            progress = "10%",
            ideaDescription = "In big hotels and restaurants, getting guests to leave ratings is a big challenge.\n" + "Staff always have to explain the process, guests must open browsers, search on Google Maps or other platforms, and then rate. The entire process is too long and complicated. Most guests simply skip it.",
            detailedDescription = listOf(
                DetailedDescription(
                    title = "Proposed Solution: Instant NFC Tap Rating",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/rate3.jpg",
                    videoLink = null,
                    description = "Place small, cheap passive NFC tags on tables or counters.\n" + "When a guest is leaving, they simply tap their phone on the tag. The phone instantly opens a ready-to-use rating screen."
                ), DetailedDescription(
                    title = "Key Advantages",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/rate2.jpg",
                    videoLink = null,
                    description = "Extremely fast and frictionless (one tap)\n" + "Works offline — rating is saved and uploaded later\n" + "No app download needed (opens in browser)\n" + "Much higher completion rate than QR codes or manual search\n" + "Restaurant can display real-time positive reviews on a big LCD screen"
                ), DetailedDescription(
                    title = "Visual Comparison (Hand-drawn Style)",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/rate1.jpg",
                    videoLink = null,
                    description = ""
                ), DetailedDescription(
                    title = "Conclusion",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/rate5.jpg",
                    videoLink = null,
                    description = "This Instant NFC Rating System turns a painful, low-completion process into a one-second natural action. It solves the real friction guests face today while creating a positive feedback loop for businesses through live review displays.\n" + "The idea is practical, low-cost, and ready to implement with today’s technology."
                )
            )


        ),
        IdeaDetails(
            ideaName = "“Offline Chat App” (also called Offline Dating App)",
            author = "Chetan Khadka",
            ideaDate = "",
            imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/chat3.jpg",
            ideaDescription = "we often sit next to someone we’d love to talk to (on a bus, train, plane, café, etc.), but we can’t or don’t start the conversation.\n" + "The proposed Offline Chat App lets people connect anonymously and without internet using only Bluetooth (or Wi-Fi Direct / personal hotspot / light signals). It turns “missed connections” into real conversations — safely, privately, and offline.",
            progress = "20%",
            detailedDescription = listOf(
                DetailedDescription(
                    title = "The Problem",
                    imageLink = "",
                    videoLink = null,
                    description = "I faced a simple but very interesting problem. I saw a girl on the same bus as me. We traveled together for 2 hours, but I couldn’t bring myself to say anything. I think she also wanted to talk to me. The problem is that humans often find it hard to start a conversation in such situations.\n" + "Then I thought: What if I set my phone to show that I’m available to talk to someone? If she really wants to talk, she could message me (or I could message her) while hiding our identities. Later, once we feel comfortable and the conversation goes well, we could share our real profiles or talk openly by revealing our identities.\n" + "For this, we wouldn’t need the internet. We could use Bluetooth, a personal hotspot, a receiver, or even visible light communication, etc."
                ), DetailedDescription(
                    title = "The Solution",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/chat2.jpg",
                    videoLink = null,
                    description = "Offline Chat App — a proximity-based, internet-free messaging app that works purely on Bluetooth Low Energy (BLE), Wi-Fi Direct, or even screen-to-screen light signals.\n" + "How it works in 30 seconds:\n" + "\n" + "You open the app and tap “I’m open to chat” (anonymous).\n" + "Your phone broadcasts a tiny Bluetooth signal.\n" + "Nearby phones (within ~10–30 meters) see anonymous “open users”.\n" + "You can send a short icebreaker message without revealing who you are.\n" + "If the chat feels good → gradually unlock profile, photos, or move to normal messaging / real-life talk.\n" + "\n" + "Zero internet needed during the journey."
                ), DetailedDescription(
                    title = "Key Features",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/chat1.jpg",
                    videoLink = null,
                    description = "Anonymous mode (no name, no photo at start)\n" + "Proximity discovery via Bluetooth (works even in airplane mode)\n" + "Icebreaker chat with timed or “burn after reading” messages\n" + "Gradual reveal — unlock profile when you both feel comfortable\n" + "Mesh networking — messages can hop between phones in crowded places\n" + "Journey mode — auto-detects you’re on a bus/train and shows route-based matches\n" + "Safety tools — easy block, report, time-limited visibility\n" + "Offline-first — syncs to full profiles only when internet returns"
                ), DetailedDescription(
                    title = "Benefits & Why This Matters",
                    imageLink = null,
                    videoLink = null,
                    description = "Turns awkward bus/train rides into genuine connections\n" + "Perfect for students, commuters, travelers, events, campuses\n" + "Helps shy people (like you described) take the first step safely\n" + "Works everywhere — even underground, on flights, or in areas with no signal\n" + "Fun, low-pressure, and respectful"
                )
            )
        ),
        IdeaDetails(
            ideaName = "Balancing Anonymity and Accountability in Social Apps",
            author = "Chetan Khadka",
            ideaDate = "",
            imageLink = null,
            ideaDescription = "Social media and messaging platforms suffer from a fundamental trade-off between user privacy and accountability. Excessive anonymity enables widespread scams and fraud, while overly transparent systems compromise personal privacy. This report outlines the core problem observed in current applications and proposes a secure environment solution built at the OS or container level. The approach provides strong default privacy for legitimate users while enabling traceability for criminal activities, offering a practical path toward safer digital social interactions.",
            progress = "",
            detailedDescription = listOf(
                DetailedDescription(
                    title = "The Problem",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/env2.jpg",
                    videoLink = null,
                    description = "Current social media platforms and messaging apps create a critical security gap:\n" +
                            "\n" +
                            "Excessive anonymity in some apps enables complete hiding of identities.\n" +
                            "Excessive exposure in others removes user privacy (visible friends, followers, and personal details).\n" +
                            "Many platforms reduce security measures to attract more users, resulting in highly scammable environments.\n" +
                            "After incidents of fraud or scams, victims face significant barriers:\n" +
                            "– No reliable chat history or conversation proofs.\n" +
                            "– No identifiable user information.\n" +
                            "– Apps lack adequate logging due to privacy policies.\n" +
                            "Law enforcement and cyber teams struggle to trace perpetrators, leaving cases unresolved.\n" +
                            "\n" +
                            "This combination leads to widespread untraceable fraud while compromising user privacy."
                ),
                DetailedDescription(
                    title = "Proposed Solution",
                    imageLink = "https://chtanportfolio.s3.eu-north-1.amazonaws.com/env1.jpg",
                    videoLink = null,
                    description = "The recommended approach shifts from a simple wrapper application (which faces major technical limitations) to a deeper OS-level or container-based secure environment:\n" +
                            "\n" +
                            "Devices operate within a secure environment — implemented as a custom Android container, hardened ROM, or system-level layer.\n" +
                            "All social and messaging interactions route through this trusted environment.\n" +
                            "Users receive pseudonymous identities by default, preserving privacy for normal use.\n" +
                            "Every chat undergoes approval and secure logging within the environment.\n" +
                            "In verified scam or fraud cases, the environment can disclose real identity only to authorized law enforcement via court order (using zero-knowledge techniques until required).\n" +
                            "Devices communicate securely with each other using encrypted OS-to-OS or environment-to-environment protocols.\n" +
                            "\n" +
                            "This framework directly addresses the core issues of untraceable scams while maintaining strong default privacy protections."

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