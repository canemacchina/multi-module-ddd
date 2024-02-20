buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    id("java")
    id("idea")
}

subprojects {
    group = "com.example"
    version = "0.0.1"

    apply {
        plugin("java")
        plugin("idea")
    }

    java.sourceCompatibility = JavaVersion.VERSION_21
    java.targetCompatibility = JavaVersion.VERSION_21

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.2"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    }

    tasks.test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }
}

defaultTasks("test", "run")