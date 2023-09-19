import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello! I hope you enjoyed your meal.");

        // Initialize variables using user inputs
        // Initialize bill variable
        System.out.println("Please enter your bill: ");
        String b = s.nextLine();
        double bill = Double.parseDouble(b);

        //Initialize tipPercentage variable
        System.out.println("Please enter the tip percentage: ");
        String t = s.nextLine();
        double tipPercentage = Double.parseDouble(t) / 100; // Divide by 100 to get percentage/decimal value

        //Initialize numPeople variable
        System.out.println("Please enter the amount of people in your party: ");
        String p = s.nextLine();
        int numPeople = Integer.parseInt(p);

        // Calculating tip, tip per person, total bill, and total bill per person
        double totalTip = bill * tipPercentage;
        double tipPerPerson = totalTip / numPeople;
        double totalBill = bill + totalTip;
        double totalPerPerson = totalBill / numPeople;

        // Printing out outputs + rounding to the correct decimal place value
        // Using printf to round to a specific decimal place (0.00) to format the values in dollars and cents
        // printf works by printing a string using a format screen (that is started with the % sign)
        // .2f, 2 is the number of decimal places, f represents floating point type
        System.out.println();
        System.out.printf("Your total tip is $%.2f %n", totalTip);
        System.out.printf("Your total bill is $%.2f %n", totalBill);
        System.out.printf("Your total tip per person is $%.2f %n", tipPerPerson);
        System.out.printf("Your total per person is $%.2f %n", totalPerPerson);
    }
}