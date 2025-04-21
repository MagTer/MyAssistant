# MyAssistant – AI‑First Android Blueprint

---

## 1. Product Vision
A fully offline, voice‑first personal assistant that lives entirely on your device. It captures speech instantly, interprets commands locally with a small LLM, and acts (write notes, control smart‑home, query knowledge) within two seconds – all without ever sending private data to the cloud. Long‑term, the assistant should be extendable through well‑defined action plugins and optional cloud fall‑backs (e.g., Gemini).

## 2. Guiding Principles
1. **AI‑First, Human‑Reviewed** – Copilot Agent writes the code; humans (or another AI reviewer) approve merges.
2. **Fail‑Fast & Observable** – Every module has unit tests and lint rules so mistakes surface immediately.
3. **Modular, Replaceable Parts** – Features, data sources, and UI layers live in separate Gradle modules with clearly defined public APIs to avoid entanglement.
4. **Single Source of Truth** – Business rules live only in the domain layer; UI and data layers are thin wrappers.
5. **Documentation‑as‑Code** – Vision, ADRs, API contracts, and prompt templates live in the repo and evolve with the code.

## 3. Architecture Decision Record (ADR‑0001)
| Decision | Choice |
|----------|--------|
| Language | **Kotlin 2.x** (including KMP for possible future desktop/iOS reuse) |
| UI Toolkit | **Jetpack Compose** |
| Min / Target SDK | 35 / 35 |
| DI | Hilt |
| Concurrency | Coroutines + Flow |
| Persistence | Room + DataStore |
| Networking | Ktor Client (if/when online) |
| Speech‑to‑Text | Android `SpeechRecognizer` (offline model) |
| LLM Runtime | **MLC LLM** (Phi‑2 as default) |
| Testing libs | JUnit 5, Kotest, MockK, Robolectric, Compose UI test |

*Subsequent ADRs should follow the same table structure and be stored in `/docs/adrs/ADR‑XXXX.md`.*

## 4. Repository Layout
```text
├── .github/
│   ├── workflows/
│   └── ISSUE_TEMPLATE/
├── .vscode/
├── app/
├── core/
├── feature/
├── build-logic/
└── docs/
```

... (truncated for brevity – see canvas copy).
