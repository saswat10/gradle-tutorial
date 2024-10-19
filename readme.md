### What is Gradle ?

- build automation tool
- takes your code and packages into a deployable unit
- applies to small or large project
- written in kotlin language, here kotlin is used as a scripting language
- Groovy can also be used as the language
- highly configurable to meet project needs


### Why use Gradle ?

- Gradle makes building and running application very easy
- no need for people using your project to install Gradle
    - Gradle wrapper comes bundled with project
    - just run 

        ```
        ./gradlew build  
        ```   
    - very concise - no XML configuration
    - lightining fast

### Key Concepts of Gradle

- build.gradle.kts is the Gradle build script file
- written in a Kotlin DSL
- equivalent of Maven's pom.xml
- lives in the top lfevel of your project
```
    .\my-project
        |
        |---build.gradle.kts
        |
```

### `build.gradle.kts`
```kotlin

// plugins
plugins{
    java                                          
}

// build metadata
group = "org.example"                          
version = "1.0-SNAPSHOT"                                 

// repositories
repositories {
    mavenCentral()                                   
}                                                        

// dependencies
dependencies{
    testImplementation("junit:junit:4.13.2")       
}                                                        

```

| Gradle Keywords                 | Use                                         |
| ------------------------------- | ------------------------------------------- |
| plugins                         | plugins add additional build functionality  |
| repositories                    | where to find dependencies                  |
| dependencies                    | requirements for building your code         |
| group, version (build metadata) | information about your build                |


### Key Gradle concepts: `tasks`

- defines a unit of work
- invoked from the command line
    `./gradlew build`
- see available tasks by running `./gradlew tasks`
- can create your own custom tasks
- tasks have dependencies on other tasks
- creates a task graph

```
        Build
       /     \
      /       \
    Assemble  Check Tasks
```

### Key Gradle concepts: `wrapper`
- script used to invoke Gradle and run tasks
`./gradlew build`
    OR
`gradlew.bat build`
- always committed into version control
- no local Gradle installation required for anyone building your project
- contains a specific version of Gradle for your project
- ALWAYS use Gradle wrapper (unless you're initialising a new Gradle project)

### Types of Gradle project structure
- Gradle supports single-project and multi-project build structures
- single-project structure is for small projects with a single build output
- multi-project structure is for complex projects with multiple build outputs
- will cover single-project structure in this course

```
    .
    |-- build.gradle.kts
    |-- gradle
    |   '--wrapper
    |       |-- gradle-wrapper.jar
    |       '-- gradle-wrapper.properties       
    |-- gradlew
    |-- gradlew.bat
    `--settings.gradle.kts
```
### Some key points
- all files/directories from previous slide SHOULD go in version control
- .gradle hidden directory SHOULD NOT go in version control(cache files)
- .gitignore file generated automatically by Gradle


```bash
# some important commands of java plugin

.\gradlew compileJava

.\gradlew processResources

.\gradlew jar
```