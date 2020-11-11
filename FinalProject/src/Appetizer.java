
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi Graham
 */
public class Appetizer{
    
    private String name = "";
    private String itemInfo = "";
    private double price = 0.00;
    
    static Appetizer hummus = new Appetizer("Hummus", 5.99, "Puree of chickpeas and tahini");
    static Appetizer taziki = new Appetizer("Taziki Dip", 5.99, "Greek yogurt with cucumber, dill and lemon");
    static Appetizer pimento = new Appetizer("Spicy Pimento Cheese", 5.99, "A dip with grated sharp cheddar, mayo, "
          + "jalapeno, roasted red pepper");
    static Appetizer feta = new Appetizer("Whipped Feta", 5.99, "Feta dip topped with honey and parsley");
    static Appetizer zucchini = new Appetizer("Crispy Zucchini Chips", 5.99, "Fried zucchini chips with greek ranch dipping sauce");
    
    public Appetizer(){
        
    }
    
    public Appetizer(String name, double price, String itemInfo){
        this.name = name;
        this.price = price;
        this.itemInfo = itemInfo;
    }
    
    public static void addEntry(ArrayList apps){
        apps.add(hummus);
        apps.add(taziki);
        apps.add(pimento);
        apps.add(feta);
        apps.add(zucchini);
    }
    
    public static void delEntry(ArrayList apps, int n){
        apps.remove(n - 1);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getInfo(){
        return itemInfo;
    }
    
    public void setInfo(String info){
        this.itemInfo = info;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public String toString(){
        return name + "\n$" + price + "\n" + itemInfo + "\n";
    }
}
