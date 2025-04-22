package oop.Interfaces;

public interface PaymentMethod {
    void processPayment(double amount);

    default boolean validatePayment(double amount) {
        if (amount > 0) {
            System.out.println("Payment of $" + amount + " is valid.");
            return true;
        } else {
            System.out.println("Invalid payment amount.");
            return false;
        }
    }
}
