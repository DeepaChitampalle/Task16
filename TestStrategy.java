package org.example.strategyPattern;

public class TestStrategy {
        public static void main(String[] args) {

            PaymentContext context = new PaymentContext();

            context.setPaymentStrategy(new UpiPayment());
            context.makePayment(500);

            context.setPaymentStrategy(new CreditCardPayment());
            context.makePayment(1500);

            context.setPaymentStrategy(new CashPayment());
            context.makePayment(200);
        }
}


