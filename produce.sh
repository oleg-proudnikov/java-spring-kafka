SERVER=localhost:9092
TOPIC=intx.text
CNT=5000000

time kafka-verifiable-producer --broker-list $SERVER --max-messages $CNT --topic $TOPIC --producer.config producer.properties > /dev/null
