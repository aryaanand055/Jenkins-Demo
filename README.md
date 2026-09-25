# Jenkins-Demo

Small Java (Maven) project to validate Jenkins jobs.

## Run tests

```bash
mvn test
```

## Run app

```bash
mvn -q -DskipTests package
java -cp target/classes com.example.jenkinsdemo.App
```
