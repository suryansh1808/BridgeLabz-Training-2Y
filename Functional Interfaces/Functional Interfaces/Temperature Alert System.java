import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 40.0;
        double currentTemp = 42.5;

        if (alert.test(currentTemp))
            System.out.println("ALERT: Temperature too high!");
        else
            System.out.println("Temperature normal.");
    }
}
