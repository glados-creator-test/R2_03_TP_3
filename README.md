# R2_03_TP_3
commande pour compiler avec java
```bash
javac -cp .:junit-4.13.2.jar -cp gson-2.10.1.jar *.java
java -cp .:junit-4.13.2.jar:hamcrest-2.2.jar org.junit.runner.JUnitCore TestsBoxes
```