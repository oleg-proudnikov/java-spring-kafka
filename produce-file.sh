SERVER=localhost:9092

TOPIC=text

PAYLOAD=formal-offer-result.json

#kafka-console-producer --bootstrap-server $SERVER --topic $TOPIC < $PAYLOAD
kafka-console-producer --bootstrap-server $SERVER --topic $TOPIC
