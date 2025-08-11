plugins {
    id("myassistant.android.library")
}

android {
    namespace = "com.magter.myassistant.feature.llm"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
