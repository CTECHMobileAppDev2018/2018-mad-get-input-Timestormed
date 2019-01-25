import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean inputAccepted = false;
        while (!inputAccepted) {
            try {
                System.out.print("Please enter a number: ");
                Integer.valueOf(input.nextLine());
                inputAccepted = true;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number.");
            }
        }
        System.out.println("Thank you!");
    }
}