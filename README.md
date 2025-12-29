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
