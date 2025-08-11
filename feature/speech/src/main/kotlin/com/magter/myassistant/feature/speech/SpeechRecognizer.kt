package com.magter.myassistant.feature.speech

/**
 * Defines contract for speech recognition components.
 */
interface SpeechRecognizer {
    /**
     * Converts the provided audio data into text.
     */
    fun recognize(audio: ByteArray): String
}
