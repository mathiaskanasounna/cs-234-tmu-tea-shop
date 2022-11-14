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

public class Client extends Person{
    private ArrayList<Sale> sales;
    private String clientId;

    public Client() {
        super();
    }

    public Client(String firstName, String lastName, String email, String streetAddress, String city, String zipCode, String state, String telephone, ArrayList<Sale> sales, String clientId) {
        super(firstName, lastName, email, streetAddress, city, zipCode, state, telephone);
        this.sales = sales;
        this.clientId = clientId;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void showClientInfo() {
        System.out.println("["+clientId+", "+this.getFirstName()+", "+this.getLastName()+", "+this.getEmail()+", "+this.getTelephone()+" ]");
    }
}
