# RestFulScala
Scala REST Service

#Technologies

JDK 1.8.0

Maven 4.0

SpringBoot 1.4.0.RELEASE

Scala

#Build, Test and Run application

cd RestFulScala

Then run

mvn clean package

Then run the jar

java -jar target/RestFulScala-0.0.1.jar

Application will start running on port 8080

Calling RestFulScala api services

Performing GET request on http://localhost:8080/phones will return json object with contact information 

GET http://localhost:8080/phones

Response:-

[
    {
        "id": 1,
        "name": "Phone 1",
        "homeNumber": "9898989991",
        "cellPhone": "9898989991"
    },
    {
        "id": 2,
        "name": "Phone 2",
        "homeNumber": "9898989992",
        "cellPhone": "9898989992"
    },
    {
        "id": 3,
        "name": "Phone 3",
        "homeNumber": "9898989993",
        "cellPhone": "9898989993"
    },
    {
        "id": 4,
        "name": "Phone 4",
        "homeNumber": "9898989994",
        "cellPhone": "9898989994"
    },
    {
        "id": 5,
        "name": "Phone 5",
        "homeNumber": "9898989995",
        "cellPhone": "9898989995"
    },
    {
        "id": 6,
        "name": "Phone 6",
        "homeNumber": "9898989996",
        "cellPhone": "9898989996"
    },
    {
        "id": 7,
        "name": "Phone 7",
        "homeNumber": "9898989997",
        "cellPhone": "9898989997"
    },
    {
        "id": 8,
        "name": "Phone 8",
        "homeNumber": "9898989998",
        "cellPhone": "9898989998"
    },
    {
        "id": 9,
        "name": "Phone 9",
        "homeNumber": "9898989999",
        "cellPhone": "9898989999"
    },
    {
        "id": 10,
        "name": "Phone 10",
        "homeNumber": "98989899910",
        "cellPhone": "98989899910"
    }
]


POST  http://localhost:8080/phones/create

Request Body :-

 {
        "id": 10,
        "name": "Phone 10",
        "homeNumber": "2176520720",
        "cellPhone": "2176520720"
 }
PUT  http://localhost:8080/phones/update

Request Body :-

  {
        "id": 2,
        "name": "Phone 2",
        "homeNumber": "0000000000",
        "cellPhone": "0000000000"
    }
    
DELETE     http://localhost:8080/phones/delete/1



