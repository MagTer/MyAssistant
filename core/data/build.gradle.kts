
plugins {
    alias(libs.plugins.kotlin.jvm)
    // Potentially add Hilt/KSP if repositories need injection
}

// Configure Kotlin options if needed
// kotlin {
//     jvmToolchain(11)
// }

dependencies {
    implementation(project(":core:model"))
    implementation(project(":core:domain")) // Data layer implements domain interfaces

    implementation(libs.kotlin.stdlib)
    implementation(libs.coroutines.core)
    // Add Room/DataStore/Ktor dependencies later if needed

    testImplementation(libs.junit)
}
