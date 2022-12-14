/**
 *   Name:
 *      - Mathias K.
 *      - Theodoro L.
 *   Date: 11/13/2022
 *   Title: Project Stage 3
 *   Class: CS-234
 *
 * */
package stage_4.application.src.stage_3;

import stage_3.Client;
import stage_3.Employee;
import stage_3.Manager;
import stage_3.Product;
import stage_3.Sale;

import java.util.ArrayList;

public class TeaShop {
    private String name;
    private String streetAddress;
    private String telephone;
    private String website;
    private ArrayList <stage_3.Client> clients;
    private ArrayList<Employee> employees;
    private ArrayList<stage_3.Manager> managers;
    private ArrayList<stage_3.Product> products;
    private ArrayList<stage_3.Sale> sales;

    public TeaShop() {
        this.clients= new ArrayList<>();
        this.employees = new ArrayList<>();
        this.products = new ArrayList<>();
        this.sales = new ArrayList<>();
        this.managers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public ArrayList<stage_3.Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<stage_3.Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<stage_3.Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<stage_3.Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<stage_3.Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<stage_3.Product> products) {
        this.products = products;
    }

    public ArrayList<stage_3.Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<stage_3.Sale> sales) {
        this.sales = sales;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
        System.out.println("Added new employee");
    }
    public void removeEmployee(String employeeId){
        int listSize= employees.size();
        for(int i=0; i<employees.size();i++){
            if(employees.get(i).getEmployeeId().equalsIgnoreCase(employeeId)){
                employees.remove(i);
            }
        }
        if(listSize==employees.size()){
            System.out.println("No Employee ID "+employeeId+" found");
        }
        else{
            System.out.println("Employee Removed");
        }
    }
    public void createSale(ArrayList<stage_3.Product> products){

    }
    public void removeSale(String saleId){
        int listSize= sales.size();
        for(int i=0; i<sales.size();i++){
            if(sales.get(i).getOrderId().equalsIgnoreCase(saleId)){
                sales.remove(i);
            }
        }
        if(listSize==sales.size()){
            System.out.println("No Sale ID "+saleId+" found");
        }
        else{
            System.out.println("Sale Removed");
        }
    }
    public void addClient(stage_3.Client client){
        this.clients.add(client);
        System.out.println("Added new client");
    }
    public void removeClient(String clientId){
        int listSize= clients.size();
        for(int i=0; i<clients.size();i++){
            if(clients.get(i).getClientId().equalsIgnoreCase(clientId)){
                clients.remove(i);
            }
        }
        if(listSize==clients.size()){
            System.out.println("No Client ID "+clientId+" found");
        }
        else{
            System.out.println("Client Removed");
        }
    }
    public void removeProduct(String productId){
        int listSize= products.size();
        for(int i=0; i<products.size();i++){
            if(products.get(i).getProductId().equalsIgnoreCase(productId)){
                products.remove(i);
            }
        }
        if(listSize==products.size()){
            System.out.println("No Product ID "+productId+" found");
        }
        else{
            System.out.println("Product Removed");
        }
    }
    public  void addProduct(stage_3.Product product){
        this.products.add(product);
        System.out.println("Added new Product");
    }

    public  void addManager(stage_3.Manager manager){
        this.managers.add(manager);
        System.out.println("Added new Manager");
    }
    public  void removeManager(String managerId){
        int listSize= managers.size();
        for(int i=0; i<managers.size();i++){
            if(managers.get(i).getManagerId().equalsIgnoreCase(managerId)){
                managers.remove(i);
            }
        }
        if(listSize==managers.size()){
            System.out.println("No Sale ID "+managerId+" found");
        }
        else{
            System.out.println("Manager Removed");
        }
    }
    public stage_3.Product getProduct(String productId) {
        for(stage_3.Product product: products){
            if(product.getProductId().equals(productId)){
                return  product;
            }
        }
        return null;
    }
    public void displayEmployees(){
        System.out.println("\nHere is the list of Employees\n");
        for(Employee employee:employees){
            employee.showEmployeeInfo();
        }
    }
    public void displayClients(){
        System.out.println("\nHere is the list of Clients\n");
        for(stage_3.Client client:clients){
            client.showClientInfo();
        }
    }
    public void displayManagers(){
        System.out.println("\nHere is the list of Managers\n");
        for(Manager manager:managers){
            manager.showManagerInfo();
        }
    }
    public void displayProducts(){
        System.out.println("\nHere is the list of Products\n");
        for(stage_3.Product product:products){
            product.showProductInfo();
        }
    }
    public void displaySales(){
        System.out.println("\nHere is the list of Sales\n");
        for(Sale sale:sales){
            sale.showSaleInfo();
        }
    }

    public Employee getEmployee(String employeeId) {
        for(Employee employee:employees){
            if(employee.getEmployeeId().equalsIgnoreCase(employeeId)){
                return employee;
            }
        }
        return null;
    }
    public stage_3.Client getClient(String clientId) {
        for(Client client:clients){
            if(client.getClientId().equalsIgnoreCase(clientId)){
                return client;
            }
        }
        return null;
    }
    public void displayPromotion() {
        System.out.println("\nHere is the list of Promotions\n");
        for(Product product:products){
            if(product.getPromotion()!=null){
                product.getPromotion().showPromotionInfo();
            }
        }
    }
}
