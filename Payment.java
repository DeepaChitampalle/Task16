package org.example.factoryPattern;

public interface Payment {
        void pay(double amount);
}
class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}


class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

class PaymentFactory {

    public static Payment getPaymentMethod(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toUpperCase()) {
            case "CREDIT":
                return new CreditCardPayment();

            case "UPI":
                return new UpiPayment();

            case "CASH":
                return new CashPayment();

            default:
                throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
