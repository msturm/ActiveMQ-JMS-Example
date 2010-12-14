package nl.marktplaats.consumer;

import javax.jms.JMSException;

public class Main {
    public static void main(String... args) throws JMSException {
        System.out.println("Starting consumer...");
        Consumer consumer = new Consumer();
    }
}
