import java.util.Scanner;
import java.util.Random;

public class Guesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            String response = menu(scanner);
            
            if (response.equals("0")) {
                keepGoing = false;
            } else if (response.equals("1")) {
                humanGuesser(scanner);
            } else if (response.equals("2")) {
                computerGuesser(scanner);
            } else {
                System.out.println("Invalid option. Please enter 0-2.");
            }
        }
        scanner.close();
    }

    public static String menu(Scanner scanner) {
        System.out.println("0) Exit");
        System.out.println("1) Human Guesser");
        System.out.println("2) Computer Guesser");
        System.out.print("Please enter 0-2: ");
        return scanner.nextLine();
    }

    public static void humanGuesser(Scanner scanner) {
        Random rand = new Random();
        int num = rand.nextInt(101);
        int tries = 0;
        boolean keepGoing = true;

        System.out.println("Human Guesser");
        while (keepGoing) {
            System.out.print("Please enter a number: ");
            int guess = scanner.nextInt();
            scanner.nextLine();  // Clear buffer
            tries++;

            if (guess == num) {
                System.out.println("You got it in " + tries + " tries!");
                if (tries < 7) {
                    System.out.println("You win");
                } else if (tries == 7) {
                    System.out.println("You tied");
                } else {
                    System.out.println("You lose");
                }
                keepGoing = false;
            } else if (guess > num) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
    }

    public static void computerGuesser(Scanner scanner) {
        int low = 1;
        int high = 100;
        boolean keepGoing = true;
        int tries = 0;
        
        System.out.println("");
        System.out.println("Think of a number between 1 and 100. The computer will try to guess it.");
        
        while (keepGoing) {
            int guess = getMean(low, high);
            tries++;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
            String response = scanner.next().toLowerCase();

            if (response.equals("c")) {
                System.out.println("Computer guessed your number in " + tries + " tries!");
                keepGoing = false;
            } else if (response.equals("h")) {
                high = guess - 1;
            } else if (response.equals("l")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input, please enter H, L, or C.");
            }
        }
    }

    public static int getMean(int low, int high) {
        return (low + high) / 2;
    }
}
