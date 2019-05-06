plugins {
    id("org.jetbrains.kotlin.jvm")

    application
}

dependencies {
    implementation(project(":commons"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin JUnit integration.
    testImplementation(Config.Libs.jetbrainJunit)

    // Use Junit 5 for tests
    testImplementation(Config.Libs.junitApi)
    testImplementation(Config.Libs.junitEngine)

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

application {
    // Define the main class for the application.
    mainClassName = "it.unisannio.lm.ids.classmates.server.AppKt"
}
