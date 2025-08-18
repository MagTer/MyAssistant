# Copilot Agent – Repository Instructions

**Build & Test Commands**
* Build debug APK: `./gradlew :app:assembleDebug`
* Run all unit tests: `./gradlew test`
* Run static analysis & coverage: `./gradlew lint detekt jacocoTestReport`

**Architecture Rules**
1. Keep the **domain layer (`core/domain`) Android‑free**; no `android.*` imports.
2. All features live under `feature/*` and must depend **only** on `core/*`, never on each other.
3. Use **Hilt** for dependency injection, **Coroutines/Flow** for async, **Jetpack Compose** for UI.
4. Every public function must have **unit tests** in the same module.

**Coding Style**
* Follow Kotlin style guide; 120‑char line length.
* Prefer immutability (`val`) unless mutation is strictly required.
* Use `sealed interface` + `data class` for result types.

## SDK policy
compileSdk = 35
targetSdk  = 35
minSdk     = 35   # change only if we decide to widen device support

## Dependency policy
* Use the **version catalog** (`gradle/libs.versions.toml`) for every third‑party library.
* Prefer the highest **stable** release available in Maven Central.
* Never add a direct version string in build.gradle.kts; use `libs.<alias>` only.
* Before opening a PR, run `./gradlew dependencyUpdates` and apply safe upgrades.