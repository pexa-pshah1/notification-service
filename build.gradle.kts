import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    application
}

group = "me.pshah1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("aws.sdk.kotlin:sns:0.9.4-beta")

}

//sourceSets {
//    main.kotlin.srcDirs += 'src/main/kotlin'
//}


//mainClassName ='main.kt'

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("NotificationControllerKt")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}