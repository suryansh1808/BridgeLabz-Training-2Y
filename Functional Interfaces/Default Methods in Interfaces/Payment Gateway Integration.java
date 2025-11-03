interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount);
    }
}

class Paytm implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Paytm.");
    }
}

public class GatewayDemo {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        p.processPayment(500);
        p.refund(100);
    }
}
