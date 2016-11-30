/**
 * By: Sahil Patel, Nate Bell
 * Pizza Ordering Program
 * For Pizza Express
 */
import java.util.Scanner;
import java.util.Date;

public class Pizza
{
    private double pizzaCost; // pizza's cost
    private String crust; //Pizza's crust
    private int size; //Pizza's size
    private int numToppings; //Pizza's toppings
    private String toppingList; //a list of the toppings


    //Adds the cost into the parameter
    public void setCost (double cost)
    {
        this.pizzaCost = this.pizzaCost + cost;
    }

    //passes in the crust type
    public void setCrust (String crust)
    {
        this.crust = crust;
    }

    //Passes in the size of the pizza
    public void setSize (int size)
    {
        this.size = size;
    }

    //sets the number of toppings to the parameter number
    public void setNumToppings(int numToppings)
    {
        this.numToppings = numToppings;
    }

    //sets the list of toppings
    public void setToppingList (String toppingList)
    {
        this.toppingList = toppingList;
    }

    //returns the cost of the pizza
    public double getCost()
    {
        return pizzaCost;
    }

    //returns the crust type
    public String getCrust()
    {
        return crust;
    }

    //returns the size of the pizza
    public int getSize()
    {
        return size;
    }

    //returns the number of toppings
    public int getNumToppings()
    {
        return numToppings;
    }

    //returns the list of toppings
    public String getToppingList()
    {
        return toppingList;
    }

    private static double TAX_RATE = .06;//sales tax rate

    public static void main (String [] args)
    {
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner (System.in);

        //Create an instance of a Pizza
        Pizza order = new Pizza ();

        //Declaring local variables
        String firstName;//customers name
        int size; //size of the pizza
        char crustType; //type of crust
        double cost; //cost of the pizza
        double tax; //amount of tax
        char choice; //users choice
        String input; //user input
        String toppings = "Cheese ";//list of toppings
        int numberOfToppings = 0; //number of toppings

        // Displaying the date and time
        // at the top of the program.
        Date date = new Date();
        System.out.println(date.toString());

        System.out.println("Welcome to Pizza Express");

        //Prompting the user and getting their first name
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();
        System.out.println("Customer: " + firstName);

        //Displaying the menu items the user
        //can choose from.
        System.out.println("Pizza Size (inches) Cost");
        System.out.println("-------------------------");
        System.out.println(" 10 inch $10.99");
        System.out.println(" 12 inch $12.99");
        System.out.println(" 14 inch $14.99");
        System.out.println(" 16 inch $16.99");
        System.out.println();

        //Prompting the user to enter the size
        //pizza they would like.
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 " + "(enter the number only): ");
        size = keyboard.nextInt();

        //Checking if the size is 10, 12, 14, 16 it will pass in the size
        //and price. And will do that for the size the user chooses
        if (size == 10)
        { order.setSize(10);
            order.setCost(10.99); }
        else

        if(size == 12){
            { order.setSize(12);
                order.setCost(12.99);}
        }
        else
        if (size == 14)
        {   order.setSize(14);
            order.setCost(14.99);}
        else
        if (size == 16)
        {   order.setSize(16);
            order.setCost(16.99); }

        keyboard.nextLine();
        //Asks the user what type of crust they would like
        //and displays the choices they can choose from
        System.out.println("What type of crust do you want? ");
        System.out.println("(H) Hand-tossed");
        System.out.println("(T) Thin-Crust");
        System.out.println("(D) Deep-dish ");
        input = keyboard.nextLine();
        crustType = Character.toUpperCase(input.charAt(0));

        switch (crustType)
        {
            case 'H': order.setCrust("Hand-tossed");
                break;
            case 'D': order.setCrust("Deep-dish");
                break;
            case 'T': order.setCrust("Thin-crust");
                break;
            default:  order.setCrust("Invalid selection: Using Hand-tossed");
                break;
        }

        //Telling the user the toppings cost 1.25 extra and what toppings the user
        //can choose from.
        System.out.println("Additional toppings are $1.25 each, choose from: ");
        System.out.println("Pepperoni, Jalapeno, Onion, Mushroom");

        //Asking if the customer wants Pepperoni on the pizza
        System.out.print("Do you want Pepperoni? (Y/N): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'Y')
        {
            numberOfToppings = numberOfToppings + 1;
            toppings = toppings + "Pepperoni ";
        }
        //Asking if the customer wants Jalapeno on the pizza
        System.out.print("Do you want Jalapeno? (Y/N): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'Y')
        {
            numberOfToppings = numberOfToppings + 1;
            toppings = toppings + "Jalapeno ";
        }
        //Asking if the customer wants Onion on the pizza
        System.out.print("Do you want Onion? (Y/N): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'Y')
        {
            numberOfToppings = numberOfToppings + 1;
            toppings = toppings + "Onion ";
        }
        //Asking if the customer wants Mushrooms on the pizza
        System.out.print("Do you want Mushroom? (Y/N): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'Y')
        {
            numberOfToppings = numberOfToppings + 1;
            toppings = toppings + "Mushroom ";
        }

        //set number of toppings and topping list on pizza ordered
        order.setNumToppings(numberOfToppings);
        order.setToppingList(toppings);
        //add additional toppings cost to cost of pizza
        order.setCost(1.25 * numberOfToppings);

        System.out.println();

        //Printing the customers final order
        System.out.println("Your order is as follows: ");
        System.out.println(order.getSize() + " inch pizza");
        System.out.println(order.getCrust() + " crust");
        System.out.println(order.getToppingList());


        //displaying the cost of pizza and the tax and how much
        //the pizza will cost with tax.
        cost = order.getCost();
        System.out.println("The cost of your order is: $" + cost);
        tax = (cost * TAX_RATE);
        System.out.println("The tax is: $" + tax);
        System.out.println("The total due is: $" + (tax +cost));
        System.out.println("Your order will be ready for pickup in 45 minutes.");
    }
}
