import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotestVersion = "4.6.2"
plugins {
    kotlin("jvm") version "1.3.30"
}

group = "kotlinguide"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.2")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.17")
    testImplementation ("io.kotest:kotest-assertions-core:$kotestVersion")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks {
    "test"(Test::class) {
        useJUnitPlatform()
    }
}