package Section6;
import java.util.Scanner;

public class InputCalculator {
    
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int sum = 0;
        long average = 0;

        while (true) {
            try {
                String input = scanner.nextLine();
                int intInput = Integer.parseInt(input);
                sum += intInput;
                length++;
            } catch (NumberFormatException e) {
                break;
            }
            
        }
        average = Math.round((double) sum / length);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
