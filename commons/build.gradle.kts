plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin JUnit integration.
    testImplementation(Config.Libs.jetbrainJunit)

    // Use Junit 5 for tests
    testImplementation(Config.Libs.junitApi)
    testRuntimeOnly(Config.Libs.junitEngine)

    // Use Spek for BDD tests
    testImplementation(Config.Libs.spekDsl)
    testRuntimeOnly(Config.Libs.spekRunner)

    // Use kluent for the assertions
    testImplementation(Config.Libs.kluent)
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
