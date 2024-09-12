import java.util.Scanner;

public class Price {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Variables
        double price;
        double tax;
        double SALES_TAX = 0.05;
        double sum;

        //inputs
        System.out.println("Please input the price of the object");
        price = scan.nextDouble();

        //Process
        tax = price * SALES_TAX;
        sum = tax + price;

        //output

        System.out.println("The price of the purchase plus tax is $" + sum);
    }


}