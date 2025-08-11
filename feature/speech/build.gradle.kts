plugins {
    id("myassistant.android.library")
}

android {
    namespace = "com.magter.myassistant.feature.speech"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(project(":core:domain")) // Example dependency

    implementation(libs.kotlin.stdlib)
    implementation(libs.androidx.core.ktx)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
