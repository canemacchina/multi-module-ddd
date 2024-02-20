plugins {
    id("application")
}

application {
    mainClass = "org.example.todo.Main"
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":infrastructure"))
    implementation("com.sparkjava:spark-core:2.9.4")
    implementation("org.slf4j:slf4j-simple:2.0.12")
}