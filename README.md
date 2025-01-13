# kafka-quickstart-sa

This is a Spring Boot application using a single-node Apache Kafka, with one producer and one consumer.

### Prerequisites:
To start the Kafka server correctly (via the Docker Compose file), you should have Docker Engine (Docker Desktop) installed on your computer.

## Steps:
1 - Clone the repository and start the application.

2 - Once the application is started, open your browser or a REST API client (e.g., Postman) and navigate to: http://localhost:8080/send?msg=YOUR_MESSAGE

3 - In your IDE console, you will see the message you just sent printed as follows: **Message received : YOUR_MESSAGE**

Now, you have created a producer that sends a message (record) to the Kafka broker > topic > partition, and a consumer that reads that message.
