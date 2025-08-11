package com.magter.myassistant.feature.llm

/**
 * Provides language-model capabilities.
 */
interface LlmService {
    /**
     * Generates a response for the given prompt.
     */
    fun generate(prompt: String): String
}
