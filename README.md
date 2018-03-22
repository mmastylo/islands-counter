# Islands counter

This project count islands in given multiline text. Island is group of connected 1's and following structure is accepted:

1 0 0 0 0 0 0 0 1
0 1 0 0 0 0 0 0 0
1 0 1 0 0 0 1 0 0
1 1 0 0 0 1 1 1 0
0 0 1 0 0 1 1 0 0
0 0 1 0 0 0 1 0 0
1 1 1 0 0 0 1 0 0
0 0 0 0 0 1 1 1 1

In this example there are 3 islands.

## Getting Started


### Installing

Install [Maven](https://maven.apache.org/) first.


## Running & Tests

### Running

Project is a Maven project. It can be built with following command:

```
mvn clean package
```

Islands counter can be run in console from root folder with following command :

```
java -jar target/islands-0.0.1-SNAPSHOT.jar "path to file"
```

where "path to file" is an absolute path to text file located on disk and containing multiline text to check.

### Tests

Tests can be run with following command:

```
mvn test
```

## Validation

Islands counter validates if path is provided and if file exists in given location. Algorithm throws IllegalArgumentException if given text is empty. There is no validation for text structure. There should be spaces between each number, each row should be in new line and letters are not allowed.

## Algorithm

Islands counter benefits from modification of Union-find algorithm as DFS (Deep-first search) algorithm throws StackOverflowException for large data set (too many recursions).


## Used libraries

* JUnit