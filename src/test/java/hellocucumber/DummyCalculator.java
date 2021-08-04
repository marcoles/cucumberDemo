package hellocucumber;

public class DummyCalculator {
    public static String calculate(String n1, String n2) {
        return String.valueOf(Integer.parseInt(n1) + Integer.parseInt(n2));
    }
}
