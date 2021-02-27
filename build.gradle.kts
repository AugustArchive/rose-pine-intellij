plugins {
    id("org.jetbrains.intellij") version "0.7.2"
    kotlin("jvm") version "1.4.30"
    java
}

val currentVer = Version(1, 0, 0)

group = "dev.floofy.intellij"
version = currentVer.string()

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
    targetCompatibility = JavaVersion.VERSION_1_8.toString()
}

class Version(
    private val major: Int,
    private val minor: Int,
    private val patch: Int
) {
    fun string(): String = "$major.$minor.$patch"
}
