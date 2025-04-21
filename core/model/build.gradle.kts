
plugins {
    alias(libs.plugins.kotlin.jvm)
}

// Configure Kotlin options if needed
// kotlin {
//     jvmToolchain(11)
// }

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.coroutines.core)
    // Add other dependencies specific to the model layer
}
