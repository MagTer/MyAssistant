pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MyAssistant"

// Detect a locally installed Android SDK. Android modules are only
// included in the build if the SDK path is available. This allows the
// JVM-only modules to build on machines without the heavy Android
// toolchain (e.g., in CI or development containers).
val localProperties = File(rootDir, "local.properties")
val sdkDirFromFile = if (localProperties.exists()) {
    java.util.Properties().apply { localProperties.inputStream().use { load(it) } }
        .getProperty("sdk.dir")
} else null
val sdkDir = sdkDirFromFile ?: System.getenv("ANDROID_HOME")
val hasAndroidSdk = sdkDir?.let { File(it).exists() } == true

if (hasAndroidSdk) {
    include(":app")
    include(":feature:ui")
    include(":feature:speech")
    include(":feature:llm")
} else {
    println("Android SDK not found. Skipping Android modules.")
}

// Core modules are pure Kotlin and always included
include(":core:model")
include(":core:domain")
include(":core:data")

includeBuild("build-logic")
