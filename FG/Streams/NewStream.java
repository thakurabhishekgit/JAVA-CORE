package FG.Streams;

public class NewStream {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Calculator {
            int add(int a, int b);
        }

        Calculator calc = (a, b) -> a + b;
        int result = calc.add(5, 10);
        System.out.println("Sum: " + result);

    }

}
