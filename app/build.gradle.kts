plugins {
    id("myassistant.android.application")
    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.magter.myassistant"

    defaultConfig {
        applicationId = "com.magter.myassistant"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
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
