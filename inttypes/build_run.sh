#!/usr/bin/bash

rm -f *.{class,jar}
javac *.java
mkdir -p META-INF && echo "Main-Class: Main" > META-INF/MANIFEST.MF
jar cfm MainManifest.jar META-INF/MANIFEST.MF *.class
java -jar MainManifest.jar

