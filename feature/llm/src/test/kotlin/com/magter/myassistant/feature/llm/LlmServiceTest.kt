package com.magter.myassistant.feature.llm

import org.junit.Assert.assertEquals
import org.junit.Test

class LlmServiceTest {
    private class ConstantLlmService : LlmService {
        override fun generate(prompt: String): String = "response"
    }

    @Test
    fun generateReturnsResponse() {
        val service = ConstantLlmService()
        assertEquals("response", service.generate("prompt"))
    }
}
