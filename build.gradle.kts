val kotlinVersion = "1.9.20"
val junitJupiterVersion = "5.10.0"


plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.9.20"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {

    implementation("com.google.guava:guava:32.1.2-jre")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testImplementation("org.hamcrest:hamcrest:2.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
