plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.magter.myassistant"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.magter.myassistant"
        minSdk = 35
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(project(":feature:ui")) // Depend on the UI feature module
    implementation(project(":core:model")) // Example: App might need core models

    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    // Remove direct UI dependencies, they are now in :feature:ui
    // implementation(libs.androidx.core.ktx)
    // implementation(libs.androidx.appcompat)
    // implementation(libs.material)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}