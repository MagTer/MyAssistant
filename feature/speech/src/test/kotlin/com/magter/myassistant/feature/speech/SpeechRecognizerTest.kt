package com.magter.myassistant.feature.speech

import org.junit.Assert.assertEquals
import org.junit.Test

class SpeechRecognizerTest {
    private class EchoRecognizer : SpeechRecognizer {
        override fun recognize(audio: ByteArray): String = "echo"
    }

    @Test
    fun recognizeReturnsExpectedString() {
        val recognizer = EchoRecognizer()
        assertEquals("echo", recognizer.recognize(byteArrayOf()))
    }
}
