package com.magter.myassistant.domain

/**
 * Simple use case that echoes back the provided input.
 */
class EchoUseCase {
    operator fun invoke(input: String): String = input
}
