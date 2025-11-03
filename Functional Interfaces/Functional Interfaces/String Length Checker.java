import java.util.function.Function;

public class StringChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();
        String msg = "HackCBS is awesome!";
        System.out.println("Message length: " + getLength.apply(msg));
    }
}
