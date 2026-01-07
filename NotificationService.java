package org.example.observerPattern;
import java.util.ArrayList;
import java.util.List;
public class NotificationService implements Subject{
        private List<Observer> observers = new ArrayList<>();
        private String message;

        @Override
        public void attach(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void detach(Observer observer) {
            observers.remove(observer);
        }

        public void setMessage(String message) {
            this.message = message;
            notifyObservers();
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(message);
            }
        }
}

