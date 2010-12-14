package nl.marktplaats.producer;

import org.apache.activemq.broker.BrokerService;

public class Main {
    public static void main(String... args) throws Exception {
        // start embedded broker
        BrokerService broker = new BrokerService();
        broker.addConnector("tcp://localhost:61616");
        broker.start();
        
        Producer producer = new Producer();
        int x = 0;
        while(true) {
            Thread.sleep(2000);
            producer.produceMessage(x);
            x++;
        }
    }
}
