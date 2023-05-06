import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);

        while (true) {
            System.out.println("Guess the number");
            String stringAnswer = scanner.nextLine();
            int intAnswer;
            if (isNumeric(stringAnswer)) {
                intAnswer = Integer.parseInt(stringAnswer);
            } else {
                System.out.println("That's not a number");
                continue;
            }

            if (intAnswer == num) {
                System.out.println("Correct!");
                break;
            } else if (intAnswer > num) {
                System.out.println("Lower!");
            } else {
                System.out.println("Higher!");
            }
        }
        scanner.close();
    }

    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
}
