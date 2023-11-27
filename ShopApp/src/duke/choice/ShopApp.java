/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author israe
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tax = 0.2; //Tax 20%
        double total = 0;
        int measurement = 3;
        
        System.out.println("Welcome to Duke Choice Shop!");
        
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        switch(measurement){
            case 1,2,3:
                c1.setSize("S");
                break;
            case 4,5,6:
                c1.setSize("M");
                break;
            case 7,8,9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
                break;
        }
                
        System.out.println("Customer: "+c1.getName());
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing[] items = {item1,item2,new Clothing(),new Clothing()};
        
        item1.setDescription("Blue Jacket");
        item1.setPrice(9);
        item1.setSize("M");
        
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(9);
        item2.setSize("S");
        
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5);
        items[2].setSize("S");
        
        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");
        
        //System.out.println(item1.description + "," +item1.price+","+item1.size);
        //System.out.println(item2.description + "," +item2.price+","+item2.size);
        for(Clothing item : items)
        {
            if(item.getSize().equals(c1.getSize())) 
            {
                System.out.println(item.getDescription() + "," +item.getPrice()+","+item.getSize());
                total += item.getPrice();
            }
            if(total > 15)break;
        }
        //total = (2*item2.price + item1.price)*(1+tax);
        System.out.println("Total: " + total);
        
        
        
        
        
        
        
    }
    
}
