interface SensitiveData {}

class CustomerInfo implements SensitiveData {
    String name = "Suryansh";
    String password = "secret123";
}

public class MarkerDemo {
    public static void main(String[] args) {
        CustomerInfo info = new CustomerInfo();
        if (info instanceof SensitiveData)
            System.out.println("This data is marked as sensitive.");
    }
}