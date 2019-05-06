/*
 * MIT License
 *
 * Copyright (c) 2019 norangebit
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

object Config {
    object Versions {
        const val kluent = "1.49"
        const val junit = "5.4.2"
        const val spek = "2.0.2"
        const val kotlin = "1.3.31"
    }

    object Libs {
        const val junitApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
        const val junitEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
        const val kluent = "org.amshove.kluent:kluent:${Versions.kluent}"
        const val spekDsl = "org.spekframework.spek2:spek-dsl-jvm:${Versions.spek}"
        const val spekRunner = "org.spekframework.spek2:spek-runner-junit5:${Versions.spek}"
        const val jetbrainJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val androidGradlePlugin = "com.android.tools.build:gradle:3.4.0"
    }

    object Repositoryes {
        const val spek = "https://dl.bintray.com/spekframework/spek"
    }
}