# Java Notes
## Initialization
```bash
# Use maven to manage java projects
# Create
mvn archetype:generate \
  -DgroupId=myapp \
  -DartifactId=my-project \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false

# groupID: project group
# artifactId: project name
# archetypeArtifactId: template
# interactiveMode=false: skps prompts and uses these parameters

# Compile
mvn compile

# Test
mvn test

# Package into a JAR
mvn package
```

## Standard Foler Layout

* src/main/java -> application source code
* src/main/resources -> non-code resources
* src/test/java -> tests
* pom.xml -> project configuration

## Dependencies
In pom.xml:
```xml
<project>
  …
  <dependencies>
    <dependency>
      <groupId>org.example</groupId>
      <artifactId>example-library</artifactId>
      <version>1.2.3</version>
    </dependency>
  </dependencies>
</project>
```
* \<groupId\> -> the group or organization that publishes the library
* \<artifactId\> -> the library’s name
* \<version\> -> the version

