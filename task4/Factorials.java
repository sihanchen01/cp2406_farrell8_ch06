public class Factorials {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            int result = 1;
            for (int j = 1; j < i + 1; j++) {
                result *= j;
            }
            System.out.printf("Factorial for %s: %s\n", i, result);
        }
    }
}
