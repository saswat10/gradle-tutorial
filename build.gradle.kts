plugins{
    java
}

// after adding this build the jar file again
tasks.named<Jar>("jar"){
    manifest{
        attributes["Main-Class"] = "com.gradlehero.languageapp.SayHello"
    }
}

repositories {
    mavenCentral()
}

// dependencies
dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

// configuration for the test
tasks.named<Test>("test") {
    useJUnitPlatform()
}