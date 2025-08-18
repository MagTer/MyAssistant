# MyAssistant – AI‑First Android App

This repository is the **starting scaffolding** for an AI‑developed, voice‑first Android assistant.

* For the full high‑level architecture, see [`docs/AI_Foundation_Blueprint.md`](docs/AI_Foundation_Blueprint.md).
* Copilot Agent is expected to do all coding, guided by:
  * `.github/copilot-instructions.md` (global coding conventions)
  * `.vscode/tasks.json` (build / test commands the agent can run)
* Continuous Integration kicks in via GitHub Actions on every PR to ensure tests & lints stay green.

## Building

`./gradlew build` builds the pure Kotlin modules out of the box. Android
modules (`app`, `feature:*`) are included only when a local Android SDK
is present. Provide the SDK path via an `ANDROID_HOME` environment
variable or a `local.properties` file with `sdk.dir=/path/to/sdk` to
compile the Android code.
