package org.example.observerPattern;

public class TestObserverPattern {
        public static void main(String[] args) {

            NotificationService service = new NotificationService();

            Observer email = new EmailObserver();
            Observer sms = new SMSObserver();

            service.attach(email);
            service.attach(sms);

            service.setMessage("Order Shipped!");
        }
}


