public class Calculator {

    public static int addition(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Example usage of the calculator methods
        System.out.println("Addition: " + addition(5, 3));
        System.out.println("Subtraction: " + subtraction(5, 3));
    }
}