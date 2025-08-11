plugins {
    kotlin("jvm")
    // Potentially add Hilt plugin if UseCases need injection
    // alias(libs.plugins.hilt)
    // alias(libs.plugins.ksp)
}

// Configure Kotlin options if needed
// kotlin {
//     jvmToolchain(11)
// }

dependencies {
    implementation(project(":core:model")) // Domain uses models

    implementation(libs.kotlin.stdlib)
    implementation(libs.coroutines.core)
    // implementation(libs.hilt.core) // If using Hilt for non-Android
    // ksp(libs.hilt.compiler)

    testImplementation(libs.junit)
    // Add Kotest/MockK later if needed
}
