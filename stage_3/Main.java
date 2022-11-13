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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeaShop teaShop = new TeaShop();

        System.out.println("Welcome To The Tea - Shop System");
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter your selection :");
            System.out.println(" 1 - Add a new Employee,     2 - Add a new Product,      3 - Add a new Client");
            System.out.println(" 4 - Add a new Sale,     5 - Add a new Promotion   6 - Add a new Manager");
            System.out.println(" 7 - Remove an Employee,     8 - Remove a Product,  9 - Remove a Client");
            System.out.println(" 10 - Remove a Sale     11 - Remove a Manager   12 - Display Employee");
            System.out.println(" 13 - Display Client,     14 - Display Manager   15 - Display Product");
            System.out.println(" 16 - Display Sales,     17 - Display Promotion   ");
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
                                                        removeManager(teaShop);
                                                    }
                                                    else{
                                                        if(choice.equalsIgnoreCase("Q")){
                                                            // Leaving the System
                                                            System.out.println("Select to Leave the System");
                                                            System.out.println("Thank you for using the Tea Shop System");
                                                            System.out.println("Good Bye !!!");
                                                        }
                                                        else{
                                                            if(choice.equalsIgnoreCase("12")){
                                                                //12 display employee
                                                                showEmployees(teaShop);
                                                            }
                                                            else{
                                                                if(choice.equalsIgnoreCase("13")){
                                                                  //13 display client
                                                                    showClients(teaShop);
                                                                }
                                                                else{
                                                                    if(choice.equalsIgnoreCase("14")){
                                                                        // 14 display manager
                                                                        showManagers(teaShop);
                                                                    }
                                                                    else{
                                                                        if(choice.equalsIgnoreCase("15")){
                                                                            //15 Display product
                                                                            showProducts(teaShop);
                                                                        }
                                                                        else{
                                                                            if(choice.equalsIgnoreCase("16")){
                                                                                //16 display sale
                                                                                showSales(teaShop);
                                                                            }else{
                                                                                if(choice.equalsIgnoreCase("17")){
                                                                                   //17 display promotion
                                                                                    showPromotions(teaShop);
                                                                                }else{
                                                                                    System.out.println("Invalid choice");
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
                                }
                            }
                        }
                    }
                }
            }
        }while(!choice.equalsIgnoreCase("Q"));

    }

    private static void showPromotions(TeaShop teaShop) {
    }

    private static void showSales(TeaShop teaShop) {
    }

    private static void showProducts(TeaShop teaShop) {
    }

    private static void showManagers(TeaShop teaShop) {
    }

    private static void showClients(TeaShop teaShop) {
    }

    private static void showEmployees(TeaShop teaShop) {
    }

    private static void removeManager(TeaShop teaShop) {
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

        Sale sale = new Sale();
        System.out.println("Enter the detail on the new Sale ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Order ID ");
        String orderId = input.next();
        LocalDateTime orderDate = LocalDateTime.now();
        String choice;
        do {
            System.out.println("Select Sale operation");
            System.out.println(" 1 - to Enter Product information on the Sale,      q - to Quit");
            choice = input.next();
            if(choice.equalsIgnoreCase("1")) {
                System.out.println("Enter product ID on sale " + orderId);
                String productId = input.next();
                System.out.println("Enter product quantity for " + productId);
                int productQuantity = input.nextInt();
                sale.setOrderDate(orderDate);
                sale.setOrderId(orderId);
                Product inventoryProduct = teaShops.getProduct(productId);
                if (inventoryProduct == null) {
                    System.out.println("The Product Id do not exist");
                } else {
                    Product product = new Product();
                    product.setDistributor(inventoryProduct.getDistributor());
                    product.setQuantity(productQuantity);
                    product.setProductName(inventoryProduct.getProductName());
                    product.setUnitPrice(inventoryProduct.getUnitPrice());
                    inventoryProduct.setQuantity(inventoryProduct.getQuantity() - productQuantity);
                    sale.addProduct(product);
                }
            }
            else {
                if(choice.equalsIgnoreCase("q")){
                    System.out.println("Here is the summary of the order");
                    //@TODO
                    //print the summary of the order
                }
                else {
                    System.out.println("Invalid Choice ");
                }
            }
        }while(choice.equalsIgnoreCase("q"));
    }

    private static void createNewClient(TeaShop teaShops) {
        Client client = new Client();
        System.out.println("Enter the detail on the new Client ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name ");
        String firstName = input.next();
        System.out.println("Enter Last Name");
        String lastName = input.next();
        System.out.println("Enter email ");
        String email = input.next();
        System.out.println("Enter Street Address");
        String streetAddress= input.nextLine();
        System.out.println("Enter city");
        String city = input.next();
        System.out.println("Enter Zip Code");
        String zip = input.next();
        System.out.println("Enter State ");
        String state = input.next();
        System.out.println("Enter Telephone");
        String telephone = input.next();
        System.out.println("Enter Client ID");
        String clientId = input.next();

        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setEmail(email);
        client.setStreetAddress(streetAddress);
        client.setCity(city);
        client.setZipCode(zip);
        client.setState(state);
        client.setTelephone(telephone);
        client.setClientId(clientId);
        teaShops.addClient(client);
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
        String streetAddress= input.nextLine();
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
