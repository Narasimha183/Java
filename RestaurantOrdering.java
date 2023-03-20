// program models a restaurant ordering system
import java.util.Scanner;

public class RestaurantOrdering {
    public static int displayMenu() {
        System.out.println("Menu");
        System.out.println("1 : Pizza $2.50");
        System.out.println("2 : Tacos $4.00");
        System.out.println("3 : Lasagna $5.00");
        System.out.println("4 : Sushi $3.00");
        System.out.println("5 : Fish $7.00");
        System.out.println("6 : Done ordering");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your choice:");
        int userInput = scanner.nextInt();
        return userInput;
    }
    ////This method will prompt the user for the quantity for the menu choice
    public static double getQuantityAndCost(int y) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter quantity: ");
        int x = scanner.nextInt();
        // multiply by the appropriate amount

        switch (y){
            case 1:
                sum = x*2.5 + sum;
                break;
            case 2:
                sum = x*4.0 + sum;
                break;
            case 3:
                sum = x*5.0 + sum;
                break;
            case 4:
                sum = x*3.0 + sum;
                break;
            case 5:
                sum = x*7.0 + sum;
                break;
        }
        return sum;
    }
    // This method will return the user for a tip amount
    public static double AddTipAmount(double sum) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tip amount as % i.e. 15 ");
        double tip = scanner.nextDouble();
        return (sum+((tip*sum)/100));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Café Grub. Please make your choices and select 6 when you are finished.");
        Scanner scanner = new Scanner(System.in);
        //This method will display the menu items and price per item
        int inputChoice = displayMenu();
        double total=0;
        //sentinel controlled while loop
        while (inputChoice != 6) {
            //This method will prompt the user for the quantity for the menu choice and then multiply by the appropriate amount
            double sum = getQuantityAndCost(inputChoice);
            total = total+sum;
           inputChoice = displayMenu();
        }
        //AddTipAmount(total);
        System.out.print("The total bill is $"+AddTipAmount(total));
    }
}