package org.example.factoryPattern;

public class TestFactory {
        public static void main(String[] args) {

            Payment payment1 = PaymentFactory.getPaymentMethod("CREDIT");
            payment1.pay(1500);

            Payment payment2 = PaymentFactory.getPaymentMethod("UPI");
            payment2.pay(500);

            Payment payment3 = PaymentFactory.getPaymentMethod("CASH");
            payment3.pay(200);
        }
}


