# Copilot Instructions for MyAssistant

## Coding Style

- Follow the official [Kotlin coding conventions](https://kotlinlang.org/docs/coding-conventions.html).
- Use four spaces for indentation and keep lines under 100 characters when possible.
- Name classes and interfaces in `PascalCase`; functions and variables use `camelCase`.
- Avoid wildcard imports; explicitly import required classes.
- Package names are all lowercase and start with `com.magter.myassistant`.
  - Do not use underscores or uppercase letters in package names.

## Commit and Test Workflow

1. Pull the latest changes from the repository.
2. Make small, focused commits with descriptive messages.
3. Run `./gradlew test` to ensure all tests pass before committing.
4. Verify a clean working tree with `git status`.

## Expectations for AI Agents

- Adhere to the coding style and workflow above.
- Do not create new branches.
- Include a summary of changes and test results in the pull request description.
