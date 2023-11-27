/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author israe
 */
public class Clothing {
    private String description;
    private double price;
    private String size = "M";
    private final double MIN_PRICE = 10;
    private final double TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price*(1+TAX);
    }

    public void setPrice(double price) {
        if(price <= MIN_PRICE) this.price = MIN_PRICE;
        else this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
