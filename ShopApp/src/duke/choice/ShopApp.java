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
        // double tax = 0.2; //Tax 20%
        double total;
        
        System.out.println("Welcome to Duke Choice Shop!");
        
        Customer c1 = new Customer("Pinky",3);              
        System.out.println("Customer: "+c1.getName());
        
        System.out.println(Clothing.MIN_PRICE);
        
        Clothing item1 = new Clothing("Blue Jacket",9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt",9,"S");
        Clothing[] items = {item1,item2,new Clothing("Green Scarf",5,"S"),
            new Clothing("Blue T-Shirt",10.5,"S")};
        
        /*item1.setDescription("Blue Jacket");
        item1.setPrice(9);
        item1.setSize("M");*/
        
        /*item2.setDescription("Orange T-Shirt");
        item2.setPrice(9);
        item2.setSize("S");*/
        
        /*items[2].setDescription("Green Scarf");
        items[2].setPrice(5);
        items[2].setSize("S");*/
        
        /*items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");*/
        c1.addItems(items);
        //System.out.println(item1.description + "," +item1.price+","+item1.size);
        //System.out.println(item2.description + "," +item2.price+","+item2.size);
        for(Clothing item : c1.getItems())
        {
            System.out.println(item);
        }
        total = c1.getTotalClothingCost();
        //total = (2*item2.price + item1.price)*(1+tax);
        System.out.println("Total: " + total);
        
        double average = 0;
        int count = 0;
        for(Clothing item : c1.getItems())
        {
            if(item.getSize().equals("L"))
            {
                count++;
                average += item.getPrice();
            }
        }
        try{
            average = average / count;
        }
        catch(ArithmeticException e){
            System.out.println("Dividing by 0");
        }
        System.out.println("Average: " + average);
    }
    
}
