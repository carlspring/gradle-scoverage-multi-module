# Building the code
To build the code and produce aggregated Scoverage reports
```
./gradlew clean build reportScoverage aggregateScoverage
```

# Publishing to Sonar
To publish the results to Sonar
```
sonar-scanner -Dsonar.projectName=multi-module \
              -Dsonar.projectKey=multi-module \
              -Dsonar.projectVersion=1.0-SNAPSHOT \
              -Dsonar.sources=src/main/scala \
              -Dsonar.modules=a,b
              -Dsonar.sourceEncoding=UTF-8 \
              -Dsonar.scala.version=2.11 \
              -Dsonar.scoverage.reportPath=build/scoverage-aggregate/scoverage.xml
```

# Requirements:
Tested against:
* Sonarqube `7.4`, `sonar-scala_2.12-7.2.0-assembly` (no coverage recorded)
* Sonarqube `6.7.6`, `sonar-scala_2.12-6.7.0-assembly` (no coverage recorded)
* Sonarqube `5.6.7`, `sonar-scala-plugin-0.0.3-SNAPSHOT` (no coverage recorded)

# Useful links
* https://github.com/RadoBuransky/sonar-scoverage-plugin/issues/4
