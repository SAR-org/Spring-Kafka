# Spring-Kafka

Following are the starter packages added at the time of project creation
1. Kafka
2. Web

Following steps need to be done to test this application
* Download and extract Apache Kafka from apache Kafka website : https://www.apache.org/dyn/closer.cgi?path=/kafka/2.7.0/kafka_2.13-2.7.0.tgz
* Start zookeeper, command in local : bin/zookeeper-server-start.sh config/zookeeper.properties
* Start kafka server, command in local : bin/kafka-server-start.sh config/server.properties
* Create a topic to publish and consume message from it, in local : bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka_example
* Use console consumer to consume messages from the topic, command : bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic kafka_example --from-beginning
* Start server and publish message using Spring Boot application
