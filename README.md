# ClassLoaderExample

```
for java's ClassLoader Example
```

## How to Use
- mvn clean 
- mvn package
- sub_module's jar file (sub_module-1.0-SNAPSHOT-jar-with-dependencies.jar) move to {path}
- change main_module's path (sub_module-1.0-SNAPSHOT-jar-with-dependencies.jar -> {path}/sub_module-1.0-SNAPSHOT-jar-with-dependencies.jar)
- run

### explain
- The sub_module's purpose is just jar file.
- If you want to use other project or module, it can change
- If you used this project, you must change top pom.xml's moduels
