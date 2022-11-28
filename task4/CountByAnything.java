import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a value: ");
        int valueToCount = scanner.nextInt();
        int count = 0;
        for (int i = 3; i < 301; i+=valueToCount) {
            if (count == 10) {
                System.out.println();
                count = 0;
                continue;
            }
            System.out.printf("%3d ", i);
            count ++;
        }
    }
}
