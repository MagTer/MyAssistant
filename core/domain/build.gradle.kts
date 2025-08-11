plugins {
    id("myassistant.kotlin.jvm")
    // Potentially add Hilt plugin if UseCases need injection
    // id("com.google.dagger.hilt.android")
    // id("com.google.devtools.ksp")
}

dependencies {
    implementation(project(":core:model")) // Domain uses models

    implementation(libs.kotlin.stdlib)
    implementation(libs.coroutines.core)
    // implementation(libs.hilt.core) // If using Hilt for non-Android
    // ksp(libs.hilt.compiler)

    testImplementation(libs.junit)
    // Add Kotest/MockK later if needed
}
