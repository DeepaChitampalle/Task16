package org.example.observerPattern;

public class EmailObserver implements Observer {
        @Override
        public void update(String message) {
            System.out.println("Email received: " + message);
        }
}


