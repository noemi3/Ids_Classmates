/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package it.unisannio.lm.ids.classmates.server

import junit.framework.TestCase.assertNotNull
import org.junit.jupiter.api.Test


class AppTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}