package org.example.observerPattern;

public class SMSObserver implements Observer {
        @Override
        public void update(String message) {
            System.out.println("SMS received: " + message);
        }
}


