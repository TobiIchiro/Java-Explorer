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
        c1.name = "Pinky";
        c1.size = "S";
        switch(measurement){
            case 1,2,3:
                c1.size = "S";
                break;
            case 4,5,6:
                c1.size = "M";
                break;
            case 7,8,9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
                break;
        }
                
        System.out.println("Customer: "+c1.name);
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing[] items = {item1,item2,new Clothing(),new Clothing()};
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        items[2].description = "Green Scarf";
        items[2].price = 5;
        items[2].size = "S";
        
        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";
        
        //System.out.println(item1.description + "," +item1.price+","+item1.size);
        //System.out.println(item2.description + "," +item2.price+","+item2.size);
        for(Clothing item : items)
        {
            if(item.size.equals(c1.size)) 
            {
                System.out.println(item.description + "," +item.price+","+item.size);
                total += item.price * (1 + tax);
            }
            if(total > 15)break;
        }
        //total = (2*item2.price + item1.price)*(1+tax);
        System.out.println("Total: " + total);
        
        
        
        
        
        
        
    }
    
}
