# qa-final-project-java

[![CI Pipeline for QA Project](https://github.com/andreeasmarandache/qa-final-project-java/actions/workflows/ci.yml/badge.svg)](https://github.com/andreeasmarandache/qa-final-project-java/actions/workflows/ci.yml)

## About the project:

- has a complete QA Automation workflow using Java, Maven, GitHub Actions and Docker;
- it simulates a real-world testing setup where automated tests are executed through a CI/CD pipeline and the resulting Docker image is built and pushed to Docker Hub;
- includes the needed folder structure, configurations files, API test design in pseudocode and continuous integration and delivery automation.

## How to run tests locally

To simulate running tests locally use the following Maven command:

```bash
mvn test
```

## How to build and run the Docker image

Use the following commands:

```bash
docker build .
docker run -d
```
 
