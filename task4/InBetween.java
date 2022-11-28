import java.util.Scanner;

public class InBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scanner.nextInt();
        System.out.print("Enter another number: ");
        int j = scanner.nextInt();

        int low = Math.min(i, j);
        int high = Math.max(i, j);

        if (high - low <= 1) {
            System.out.printf("No number in between %s and %s!\n", low, high);
        } else {
            System.out.printf("Number in between %s and %s are: ", low, high);
            for (int k = low + 1; k < high; k++) {
                System.out.print(k + " ");
            }
        }
    }
}
