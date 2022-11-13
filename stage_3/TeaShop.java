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

public class TeaShop {
    private String name;
    private String streetAddress;
    private String telephone;
    private String website;
    private ArrayList <Client> clients;
    private ArrayList<Employee> employees;
    private ArrayList<Manager> managers;
    private ArrayList<Product> products;
    private ArrayList<Sale> sales;

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

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    public void removeEmployee(String employeeId){

    }
    public void createSale(ArrayList<Product> products){

    }
    public void removeSale(String saleId){

    }
    public void createPromotion(String productId, double discountRate){

    }
    public void addClient(Client client){
        this.clients.add(client);
    }
    public void removeClient(String clientId){

    }
    public void removeProduct(String productId){

    }
    public  void addProduct(Product product){
        this.products.add(product);
    }


    public Product getProduct(String productId) {
        for(Product product: products){
            if(product.getProductId().equals(productId)){
                return  product;
            }
        }
        return null;
    }
    public void displayEmployees(){
        //@TODO Theodoro
        for(Employee employee:employees){
            employee.showEmployeeInfo();
        }
    }
    public void displayClients(){
        //@TODO Theodoro
        for(Clients client:clients){
            client.showClientInfo();
        }
    }
    public void displayManagers(){
        //@TODO Theodoro
    }
    public void displayProducts(){
        //@TODO Theodoro
    }
    public void displaySales(){
        //@TODO Theodoro
    }

}
