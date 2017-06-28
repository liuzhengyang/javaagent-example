# javaagent-example
Example of how to instrument the java class files on class loading.
You can change(instrument) the byte code without changing the java source file and recompiling. 
# Usage 
`mvn clean package`
Find the packaged jar file in target directory and add it to the java command line options.
For example.
```$xslt
java -javaagent:/Users/liuzhengyang/Code/opensource/github/javaagent/target/javaagent-1.0-SNAPSHOT-jar-with-dependencies.jar Test
```

Most processing happens in `com.lzy.javaagent.AgentMain`, you can change it and add your own logic.
Have Fun!