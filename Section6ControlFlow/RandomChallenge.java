package Section6ControlFlow;
import java.util.Scanner;

public class RandomChallenge {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int nextValue = 1;
        int totalInputs = 0;
        boolean condition = true;

        while (condition) {
            try {
                if (totalInputs == 5) {
                    break;
                }
                System.out.println("Enter number#" + nextValue);
                String input = scanner.nextLine();
                int intInput = Integer.parseInt(input);
                if (intInput != nextValue) {
                    System.out.println("Try " + nextValue);
                    continue;
                }
                totalInputs++;
                nextValue++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Only numbers!");
            }
        }

    }


}
