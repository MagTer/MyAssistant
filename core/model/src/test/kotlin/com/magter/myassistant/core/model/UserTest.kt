package com.magter.myassistant.core.model

import org.junit.Assert.assertEquals
import org.junit.Test

class UserTest {
    @Test
    fun userPropertiesAreAccessible() {
        val user = User(id = "1", name = "Alice")
        assertEquals("1", user.id)
        assertEquals("Alice", user.name)
    }
}
