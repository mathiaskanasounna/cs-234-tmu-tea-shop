/**
 *   Name:
 *      - Mathias K.
 *      - Theodoro L.
 *   Date: 11/13/2022
 *   Title: Project Stage 3
 *   Class: CS-234
 *
 * */
package stage_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeaShop teaShop = new TeaShop();
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Sale> sales = new ArrayList<>();
        System.out.println("Welcome To The Tea - Shop System");
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter your selection :");
            System.out.println(" 1 - Add a new Employee,     2 - Add a new Product,      3 - Add a new Client");
            System.out.println(" 4 - Add a new Sale,     6 - Add a new Promotion");
            System.out.println(" 7 - Remove an Employee,     8 - Remove a Product,  9 - Remove a Client");
            System.out.println(" 10 - Remove a Sale");
            System.out.println(" q or Q - to quit");
            choice = input.next();
        }while(!choice.equalsIgnoreCase("Q"));

    }
}
