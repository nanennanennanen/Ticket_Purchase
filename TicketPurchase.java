/*
*Jae Bum Jang
*Prof. Davis
*CS21
*Week#4 - Ticket Purchase
*/
import java.util.*;
public class TicketPurchase//class name
{
    public static void main(String[]args)//main and method call
    {
        Scanner input = new Scanner(System.in);
        String finish = "";
        while(!finish.equalsIgnoreCase("N"))
        {
            receipt();
            System.out.print("Again? (enter Y/N) = ");
            finish = input.nextLine();
        }
    }
    public static void receipt()//method
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ticket prices.");
        System.out.print("Ticekt 1 = ");
        double ticket1 = input.nextDouble();
        System.out.print("Ticekt 2 = ");
        double ticket2 = input.nextDouble();
        System.out.print("Ticekt 3 = ");
        double ticket3 = input.nextDouble();
        System.out.print("Ticekt 4 = ");
        double ticket4 = input.nextDouble();
        double subtotal = ticket1 + ticket2 + ticket3 + ticket4;
        double taxamount = subtotal * 0.08 ;
        double totalcost = subtotal + taxamount ;
        System.out.println("Subtotal = " + subtotal);
        System.out.println("Tax amount = " + taxamount);
        System.out.println("Total cost = " + totalcost);
    }
}