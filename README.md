# javaagent-example
Example of how to instrument the java class files on class loading.
AOPTransformer will transform target class to print "before invoke" when invoke methods.
You can change(instrument) the byte code without changing the java source file and recompiling. 
# Usage
Package the agent jar file.
```
mvn clean package
```

Find the packaged jar file in target directory and add it to the java command line options.
For example.
```$xslt
java -javaagent:/Users/liuzhengyang/Code/opensource/github/javaagent/target/javaagent-1.0-SNAPSHOT-jar-with-dependencies.jar=com.lzy.javaagent.Test Test
```

or run in idea and add vm options.

Have Fun!
