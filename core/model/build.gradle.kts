plugins {
    id("myassistant.kotlin.jvm")
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.coroutines.core)
    // Add other dependencies specific to the model layer
    testImplementation(libs.junit)
}
