import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) throws OddNumberException {
        final int SENTINEL = 999;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int userInput = scanner.nextInt();
        while (userInput != SENTINEL) {
            try{
                if (userInput % 2 == 0){
                    // even number input
                    System.out.println("Good job!");
                } else {
                    throw new OddNumberException("Your input is an odd number, try again!");
                }
            } catch (OddNumberException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Give me a number: ");
            userInput = scanner.nextInt();
        }
        System.out.print("Program ended!");
    }
}

