plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ru.rutmiit.androidsocialnetwork"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.rutmiit.androidsocialnetwork"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    val fragmentVersion = "1.6.1"

    // Java language implementation
    implementation("androidx.fragment:fragment-ktx:$fragmentVersion")
    // Kotlin
    implementation("androidx.fragment:fragment-ktx:$fragmentVersion")
    implementation("com.google.android.material:material:1.10.0")
    testImplementation("junit:junit:4.13.2")
}