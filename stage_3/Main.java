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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeaShop teaShop = new TeaShop();
        popuplateData(teaShop);


        System.out.println("\n                Welcome To The Tea - Shop System");
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("\nEnter your selection :\n");
            System.out.println(" 1 - Add a new Employee,        2 - Add a new Product,      3 - Add a new Client");
            System.out.println(" 4 - Add a new Sale,            5 - Add a new Promotion     6 - Add a new Manager");
            System.out.println(" 7 - Remove an Employee,        8 - Remove a Product,       9 - Remove a Client");
            System.out.println(" 10 - Remove a Sale             11 - Remove a Manager       12 - Display Employee");
            System.out.println(" 13 - Display Client,           14 - Display Manager        15 - Display Product");
            System.out.println(" 16 - Display Sales,            17 - Display Promotion      18 - Modify Client");
            System.out.println(" 19 - Modify Employee,          20 - Modify Product        q or Q - to quit");

            System.out.println(" ");
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
                                                                                }
                                                                                else{
                                                                                    if(choice.equalsIgnoreCase("18")){
                                                                                        modifyClient(teaShop);
                                                                                    }
                                                                                    else{
                                                                                        if(choice.equalsIgnoreCase("19")){
                                                                                            modifyEmployee(teaShop);

                                                                                        }
                                                                                        else{
                                                                                            if(choice.equalsIgnoreCase("20")){
                                                                                                modifyProduct(teaShop);
                                                                                            }
                                                                                            else{
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
                    }
                }
            }
        }while(!choice.equalsIgnoreCase("Q"));

    }

    private static void modifyProduct(TeaShop teaShop) {
        System.out.println("Enter the product ID to modify ");
        Scanner input = new Scanner(System.in);
        String productId = input.nextLine();
        System.out.println("Enter new Product Name ");
        Product product =teaShop.getProduct(productId);
        if(product!=null) {
            String productName = input.nextLine();
            System.out.println("Enter new Distributor Name");
            String distributorName = input.nextLine();

            System.out.println("Enter new Unit Price");
            double unitPrice = input.nextDouble();
            System.out.println("Enter new Quantity");
            int quantity = input.nextInt();

            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setUnitPrice(unitPrice);
            product.setDistributor(distributorName);
        }
        else{
            System.out.println("Invalid Product ID");
        }
    }

    private static void modifyEmployee(TeaShop teaShop) {
        System.out.println("Enter the Employee ID to modify ");
        Scanner input = new Scanner(System.in);
        String employeeId = input.nextLine();
        Employee employee = teaShop.getEmployee(employeeId);
        if(employee!=null) {
            System.out.println("Enter new First Name ");
            String firstName = input.nextLine();
            System.out.println("Enter new Last Name");
            String lastName = input.nextLine();
            System.out.println("Enter new email ");
            String email = input.nextLine();
            System.out.println("Enter new  Street Address");
            String streetAddress = input.nextLine();
            System.out.println("Enter new city");
            String city = input.next();
            System.out.println("Enter new Zip Code");
            String zip = input.next();
            System.out.println("Enter new State ");
            String state = input.next();
            System.out.println("Enter new Telephone");
            String telephone = input.next();
            System.out.println("Enter the new hire date");
            LocalDate hireDate = LocalDate.parse(input.next());
            System.out.println("Enter the new Status of the employee");
            String employeeStatus = input.next();
            System.out.println("Enter new employee username");
            String username = input.next();
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
        }
        else{
            System.out.println("Invalid Employee ID");
        }
    }

    private static void modifyClient(TeaShop teaShop) {
        System.out.println("Enter the client ID to update ");
        Scanner input = new Scanner(System.in);
        String clientId = input.nextLine();
        Client client =teaShop.getClient(clientId);
        if(client!=null) {
            System.out.println("Enter new First Name ");
            String firstName = input.nextLine();
            System.out.println("Enter new Last Name");
            String lastName = input.nextLine();
            System.out.println("Enter new email ");
            String email = input.nextLine();
            System.out.println("Enter new Street Address");
            String streetAddress = input.nextLine();
            System.out.println("Enter new city");
            String city = input.nextLine();
            System.out.println("Enter new Zip Code");
            String zip = input.nextLine();
            System.out.println("Enter new State ");
            String state = input.nextLine();
            System.out.println("Enter new Telephone");
            String telephone = input.nextLine();


            client.setFirstName(firstName);
            client.setLastName(lastName);
            client.setEmail(email);
            client.setStreetAddress(streetAddress);
            client.setCity(city);
            client.setZipCode(zip);
            client.setState(state);
            client.setTelephone(telephone);
        }
        else {
            System.out.println("Invalid Client ID");
        }

    }

    private static void popuplateData(TeaShop teaShop) {
        System.out.println("Initializing Dummies data");
        //String firstName, String lastName, String email, String streetAddress, String city, String zipCode, String state,
        // String telephone, String employeeId, LocalDate hireDate, LocalDate leaveDate, String employeeStatus, String userName
        Employee employee1 = new Employee("Mathias","Sounna","kana@gmail.com","123",
                "Portales","234","NM","555-555-5555","001",LocalDate.parse("2022-11-13"),
                LocalDate.parse("2023-11-13"),"hired","kana");
        Employee employee2 = new Employee("James","Fox","James@gmail.com","123","Portales",
                "234","NM","999-999-9999","002",LocalDate.parse("2022-11-14"),LocalDate.parse("2023-11-14"),
                "hired","james");
        teaShop.addEmployee(employee1);
        teaShop.addEmployee(employee2);

        //String firstName, String lastName, String email, String streetAddress, String city, String zipCode, String state,
        // String telephone, ArrayList<Sale> sales, String clientId
        Client client1 = new Client("Theodoro","Leyva","teddy@gmail.com","123","Portales",
                "234","NM","333-333-3333",null,"123");
        Client client2 = new Client("Sara","Hernandez","sara@gmail.com","123","Portales",
                "234","NM","444-444-4444",null,"113");
        Client client3 = new Client("Mike","Smith","Mike@gmail.com","123","Portales","234",
                "NM","111-111-1111",null,"112");
        teaShop.addClient(client1);teaShop.addClient(client2);teaShop.addClient(client3);
        //String distributor, String productId, String productName, double unitPrice, int quantity, Promotion promotion)
        Product product1 = new Product("Walmart","001","Bread",1.0,100,null);
        Product product2 = new Product("Kroger","002","Coffee",2.0,100,null);
        Product product3 = new Product("Aldi","003","Tea",1.0,100,null);
        teaShop.addProduct(product1);teaShop.addProduct(product2);teaShop.addProduct(product3);

        Product productSale1 = new Product("Kroger","002","Coffee",2.0,10,null);
        Product productSale2 = new Product("Aldi","003","Tea",1.0,10,null);
        ArrayList<Product> productsSales = new ArrayList<>();
        productsSales.add(productSale1);productsSales.add(productSale2);
        Sale sale1 = new Sale("001",LocalDateTime.now(),productsSales);
        Sale sale2 = new Sale("002",LocalDateTime.now(),productsSales);
        ArrayList<Sale> sales = new ArrayList<>();
        sales.add(sale1);sales.add(sale2);
        teaShop.setSales(sales);
    }

    private static void showPromotions(TeaShop teaShop) {
        teaShop.displayPromotion();
    }

    private static void showSales(TeaShop teaShop) {
        teaShop.displaySales();
    }

    private static void showProducts(TeaShop teaShop) {
        teaShop.displayProducts();
    }

    private static void showManagers(TeaShop teaShop) {
        teaShop.displayManagers();
    }

    private static void showClients(TeaShop teaShop) {
        teaShop.displayClients();
    }

    private static void showEmployees(TeaShop teaShop) {
        teaShop.displayEmployees();
    }

    private static void removeManager(TeaShop teaShop) {
    }

    private static void removeSale(TeaShop teaShop) {
        System.out.println("Enter the Sale ID to remove");
        Scanner input = new Scanner(System.in);
        String saleId = input.next();
        teaShop.removeSale(saleId);
    }

    private static void removeProduct(TeaShop teaShop) {
        System.out.println("Enter the Product ID to remove");
        Scanner input = new Scanner(System.in);
        String productId = input.next();
        teaShop.removeProduct(productId);
    }

    private static void removeEmployee(TeaShop teaShop) {
        System.out.println("Enter the Employee ID to remove");
        Scanner input = new Scanner(System.in);
        String employeeId = input.next();
        teaShop.removeEmployee(employeeId);
    }

    private static void createNewManager(TeaShop teaShop) {
        System.out.println("Enter the Employee ID of Manager");
        Scanner input = new Scanner(System.in);
        String employeeId = input.next();

        Employee employee = teaShop.getEmployee(employeeId);
        String choice = "R";
        while((employee==null)&&choice.equalsIgnoreCase("r")){
            System.out.println("Invalid Employee!!!  Enter r to retry or something else to quit ");
            choice = input.next();
            if(choice.equalsIgnoreCase("R")){
                System.out.println("Enter the Employee ID to Become manager");
                employeeId = input.next();
                employee = teaShop.getEmployee(employeeId);
            }
        }
        if(employee!=null){
            System.out.println("Enter the manager ID");
            String managerId = input.next();
            Manager manager = new Manager(employee);
            manager.setManagerId(managerId);
            teaShop.addManager(manager);
        }
    }

    private static void createNewPromotion(TeaShop teaShop) {
        Promotion promotion = new Promotion();
        System.out.println("Enter the detail on the new Promotion ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Promotion ID ");
        String promotionId = input.nextLine();
        System.out.println("Enter Start Date like yyyy-mm-dd");
        String startDate = input.nextLine();
        System.out.println("Enter End Date like yyyy-mm-dd");
        String endDate = input.nextLine();
        System.out.println("Enter the promotion description");
        String promotionDescription = input.nextLine();
        System.out.println("Enter coupon code ");
        String couponCode = input.nextLine();
        System.out.println("Enter Discount rate between [0,1]");
        double discountRate = input.nextDouble();
        promotion.setPromotionID(promotionId);
        promotion.setEndDate(LocalDate.parse(endDate));
        promotion.setStartDate(LocalDate.parse(startDate));
        promotion.setPromotionDescription(promotionDescription);
        promotion.setCouponCode(couponCode);
        promotion.setDiscountRate(discountRate);

        System.out.println("Enter the product ID to Apply Promotion");
        String productId = input.nextLine();
        Product product = teaShop.getProduct(productId);
        String choice = "R";
        while((product==null)&&choice.equalsIgnoreCase("r")){
            System.out.println("Invalid Product!!!  Enter r to retry or something else to quit ");
            choice = input.next();
            if(choice.equalsIgnoreCase("R")){
                System.out.println("Enter the product ID to Apply Promotion");
                productId = input.next();
                product = teaShop.getProduct(productId);
            }
        }
        if(product !=null){
            product.setPromotion(promotion);
        }

    }

    private static void addNewSale(TeaShop teaShop) {

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
                Product inventoryProduct = teaShop.getProduct(productId);
                if (inventoryProduct == null) {
                    System.out.println("The Product Id do not exist");
                } else {
                    Product product = new Product();
                    product.setDistributor(inventoryProduct.getDistributor());
                    product.setQuantity(productQuantity);
                    product.setProductName(inventoryProduct.getProductName());
                    product.setUnitPrice(inventoryProduct.getUnitPrice());
                    product.setProductId(productId);
                    inventoryProduct.setQuantity(inventoryProduct.getQuantity() - productQuantity);
                    sale.addProduct(product);
                }
            }
            else {
                if(choice.equalsIgnoreCase("q")){
                    System.out.println("Leaving the sale Menu ");
                }
                else {
                    System.out.println("Invalid Choice ");
                }
            }
        }while(choice.equalsIgnoreCase("q"));
        System.out.println("Here is the summary of the order");
        if (sale.getProducts().size()!=0) {
            teaShop.getSales().add(sale);
            sale.showSaleInfo();
            System.out.println("Number of Items : "+sale.numberOfItems());
            System.out.println("Sale Total Price "+sale.totalPrice());
        }else{
            System.out.println("No product Enter");
        }
    }

    private static void createNewClient(TeaShop teaShop) {
        Client client = new Client();
        System.out.println("Enter the detail on the new Client ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name");
        String lastName = input.nextLine();
        System.out.println("Enter email ");
        String email = input.nextLine();
        System.out.println("Enter Street Address");
        String streetAddress= input.nextLine();
        System.out.println("Enter city");
        String city = input.nextLine();
        System.out.println("Enter Zip Code");
        String zip = input.nextLine();
        System.out.println("Enter State ");
        String state = input.nextLine();
        System.out.println("Enter Telephone");
        String telephone = input.nextLine();
        System.out.println("Enter Client ID");
        String clientId = input.nextLine();

        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setEmail(email);
        client.setStreetAddress(streetAddress);
        client.setCity(city);
        client.setZipCode(zip);
        client.setState(state);
        client.setTelephone(telephone);
        client.setClientId(clientId);
        teaShop.addClient(client);
    }

    private static void createNewProduct(TeaShop teaShop) {
        Product product = new Product();
        System.out.println("Enter the detail on the new Product ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product Name ");
        String productName = input.nextLine();
        System.out.println("Enter Distributor Name");
        String distributorName = input.nextLine();
        System.out.println("Enter Product ID ");
        String productId = input.nextLine();
        System.out.println("Enter Unit Price");
        double unitPrice= input.nextDouble();
        System.out.println("Enter Quantity");
        int quantity = input.nextInt();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setQuantity(quantity);
        product.setUnitPrice(unitPrice);
        product.setDistributor(distributorName);
        teaShop.addProduct(product);
    }

    private static void createNewEmployee(TeaShop teaShop) {
        Employee employee = new Employee();
        System.out.println("Enter the detail on the new Employee ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name");
        String lastName = input.nextLine();
        System.out.println("Enter email ");
        String email = input.nextLine();
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
        teaShop.addEmployee(employee);
    }
}
