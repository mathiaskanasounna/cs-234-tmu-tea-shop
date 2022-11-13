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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeaShop teaShop = new TeaShop();
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Sale> sales = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();
        System.out.println("Welcome To The Tea - Shop System");
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter your selection :");
            System.out.println(" 1 - Add a new Employee,     2 - Add a new Product,      3 - Add a new Client");
            System.out.println(" 4 - Add a new Sale,     5 - Add a new Promotion   6 - Add a new Manager");
            System.out.println(" 7 - Remove an Employee,     8 - Remove a Product,  9 - Remove a Client");
            System.out.println(" 10 - Remove a Sale     11 - Remove a Manager");
            System.out.println(" q or Q - to quit");
            choice = input.next();
            if(choice.equalsIgnoreCase("1")){
                //create a new Employee
                createNewEmployee(teaShop);
            }
            else{
                if(choice.equalsIgnoreCase("2")){
                    //create a new product
                    createNewProduct(teaShop);
                }
                else{
                    if(choice.equalsIgnoreCase("3")){
                        // Add new client
                        createNewClient(teaShop);
                    }
                    else{
                        if(choice.equalsIgnoreCase("4")){
                            //Add new Sale
                            addNewSale(teaShop);
                        }
                        else {
                            if (choice.equalsIgnoreCase("5")) {
                                //5 - Add a new Promotion
                                createNewPromotion(teaShop);
                            }
                            else{
                                if(choice.equalsIgnoreCase("6")){
                                    //6 - Add a new Manager
                                    createNewManager(teaShop);
                                }
                                else {
                                    if(choice.equalsIgnoreCase("7")){
                                        //7 - Remove an Employee
                                        removeEmployee(teaShop);
                                    }else{
                                        if(choice.equalsIgnoreCase("8")){
                                            //8 - Remove a Product
                                            removeProduct(teaShop);
                                        }
                                        else{
                                            if(choice.equalsIgnoreCase("9")){
                                                //9 - Remove a Client
                                            }
                                            else{
                                                if(choice.equalsIgnoreCase("10")){
                                                    //10 - Remove a Sale
                                                    removeSale(teaShop);
                                                }
                                                else{
                                                    if(choice.equalsIgnoreCase("11")){
                                                        //11 - Remove a Manager
                                                        removeManager(managers);
                                                    }
                                                    else{
                                                        if(choice.equalsIgnoreCase("Q")){
                                                            // Leaving the System
                                                            System.out.println("Select to Leave the System");
                                                            System.out.println("Thank you for using the Tea Shop System");
                                                            System.out.println("Good Bye !!!");
                                                        }
                                                        else{
                                                            System.out.println("Invalid Option.. \n\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }while(!choice.equalsIgnoreCase("Q"));

    }

    private static void removeManager(ArrayList<Manager> managers) {
    }

    private static void removeSale(TeaShop teaShop) {
    }

    private static void removeProduct(TeaShop teaShop) {
    }

    private static void removeEmployee(TeaShop teaShops) {
    }

    private static void createNewManager(TeaShop teaShops) {
    }

    private static void createNewPromotion(TeaShop teaShops) {
    }

    private static void addNewSale(TeaShop teaShops) {
    }

    private static void createNewClient(TeaShop teaShops) {
    }

    private static void createNewProduct(TeaShop teaShops) {
        Product product = new Product();
        System.out.println("Enter the detail on the new Product ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product Name ");
        String productName = input.next();
        System.out.println("Enter Distributor Name");
        String distributorName = input.next();
        System.out.println("Enter Product ID ");
        String productId = input.next();
        System.out.println("Enter Unit Price");
        double unitPrice= input.nextDouble();
        System.out.println("Enter Quantity");
        int quantity = input.nextInt();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setQuantity(quantity);
        product.setUnitPrice(unitPrice);
        product.setDistributor(distributorName);
        teaShops.addProduct(product);
    }

    private static void createNewEmployee(TeaShop teaShops) {
        Employee employee = new Employee();
        System.out.println("Enter the detail on the new Employee ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name ");
        String firstName = input.next();
        System.out.println("Enter Last Name");
        String lastName = input.next();
        System.out.println("Enter email ");
        String email = input.next();
        System.out.println("Enter Street Address");
        String streetAddress= input.next();
        System.out.println("Enter city");
        String city = input.next();
        System.out.println("Enter Zip Code");
        String zip = input.next();
        System.out.println("Enter State ");
        String state = input.next();
        System.out.println("Enter Telephone");
        String telephone = input.next();
        System.out.println("Enter employee ID");
        String employeeId = input.next();
        LocalDate hireDate =  LocalDate.now();
        String employeeStatus = "Active";
        System.out.println("Enter employee username");
        String username =  input.next();
        employee.setEmployeeId(employeeId);
        employee.setHireDate(hireDate);
        employee.setEmployeeStatus(employeeStatus);
        employee.setUserName(username);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        employee.setStreetAddress(streetAddress);
        employee.setCity(city);
        employee.setZipCode(zip);
        employee.setState(state);
        employee.setTelephone(telephone);
        teaShops.addEmployee(employee);


    }
}
