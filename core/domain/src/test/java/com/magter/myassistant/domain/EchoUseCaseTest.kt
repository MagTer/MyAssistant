package com.magter.myassistant.domain

import org.junit.Assert.assertEquals
import org.junit.Test

class EchoUseCaseTest {

    @Test
    fun `invoke should return the same input string`() {
        // Arrange
        val input = "Hello"
        val useCase = EchoUseCase()

        // Act
        val result = useCase(input)

        // Assert
        assertEquals(input, result)
    }
}
