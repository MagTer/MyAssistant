plugins {
    id("myassistant.kotlin.jvm")
    // Potentially add Hilt/KSP if repositories need injection
}

dependencies {
    implementation(project(":core:model"))
    implementation(project(":core:domain")) // Data layer implements domain interfaces

    implementation(libs.kotlin.stdlib)
    implementation(libs.coroutines.core)
    // Add Room/DataStore/Ktor dependencies later if needed

    testImplementation(libs.junit)
}
