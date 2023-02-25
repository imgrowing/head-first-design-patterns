plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
}

group = "my.ex"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("ch.qos.logback:logback-classic:1.4.5")
    api("org.slf4j:slf4j-api:2.0.4")
    api("io.github.microutils:kotlin-logging-jvm:3.0.4")
}