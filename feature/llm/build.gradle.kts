
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    // Add Hilt/KSP if needed later
}

android {
    namespace = "com.magter.myassistant.feature.llm"
    compileSdk = 35

    defaultConfig {
        minSdk = 35
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    implementation(project(":core:domain")) // Example dependency

    implementation(libs.kotlin.stdlib)
    implementation(libs.androidx.core.ktx)
    // Add MLC LLM dependencies later

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
