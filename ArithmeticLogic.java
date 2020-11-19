// Library Created for the Mathematical Arithmatic and Logic behind the operators on the calculator:

public class ArithmeticLogic {
    public static String adder(double input1, double input2) {
        return String.format("%s", input1 + input2);
    }
    public static String subtracter(double input1, double input2) {
        return String.format("%s", input1 - input2);
    }
    public static String multiplier(double input1, double input2) {
        return String.format("%s", input1 * input2);
    }
    public static String divider(double input1, double input2) {
        return String.format("%s", input1 / input2);
    }
    public static String takingSin(double input1) {
        return String.format("%s", Math.sin(Math.toRadians(input1)));
    }
    public static String takingCos(double input1) {
        return String.format("%s", Math.cos(Math.toRadians(input1)));
    }
    public static String takingTan(double input1) {
        return String.format("%s", Math.tan(Math.toRadians(input1)));
    }
}
