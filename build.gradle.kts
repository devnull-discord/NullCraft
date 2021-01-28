import java.util.Properties

plugins {
    kotlin("jvm") version "1.4.21"
    id("fabric-loom") version "0.5.12"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

// load props from parent project
val parentProps = rootDir.resolve("gradle.properties").bufferedReader().use {
    Properties().apply {
        load(it)
    }
}

val modId: String by parentProps
val modVersion: String by parentProps
val group: String by parentProps
val minecraftVersion: String by parentProps

repositories {
    maven(url = "http://maven.fabricmc.net/") {
        name = "Fabric"
    }
    maven(url = "https://kotlin.bintray.com/kotlinx") {
        name = "Kotlinx"
    }
    mavenLocal()
    mavenCentral()
    jcenter()
}

minecraft {

}

dependencies {
    minecraft(group = "com.mojang", name = "minecraft", version = minecraftVersion)
    mappings(group = "net.fabricmc", name = "yarn", version = minecraftVersion+"+build.1", classifier = "v2")

    modImplementation(group = "net.fabricmc", name = "fabric-language-kotlin", version = "1.4.21+build.1")
    modImplementation(group = "net.fabricmc.fabric-api", name = "fabric-biome-api-v1", version = "3.1.3+36b77c3eeb")
}
