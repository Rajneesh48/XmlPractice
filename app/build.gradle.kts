plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.xmlpractice"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.xmlpractice"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.cardview)
}
