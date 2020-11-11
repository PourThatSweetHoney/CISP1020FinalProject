
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
public class Beverage {
    private String name = "";
    private String itemInfo = "";
    private double price = 0.00;
    
    //ArrayList<Beverage> bev = new ArrayList<>();
    static Beverage coke = new Beverage("Coke", 2.29, "20 0z, free refills with dine in");
    static Beverage dietCoke = new Beverage("Diet Coke", 2.29, "20 oz, free refills with dine in");
    static Beverage sprite = new Beverage("Sprite", 2.29, "20 oz, free refills with dine in");
    static Beverage tea = new Beverage("Tea", 2.29, "20 oz, free refills with dine in");
    static Beverage water = new Beverage("Bottled Water", 2.29, "12 oz");
        
    
    public Beverage(){
        
    }
    
    public Beverage(String name, double price, String itemInfo){
        this.name = name;
        this.price = price;
        this.itemInfo = itemInfo;
    }
    
    public static void addEntry(ArrayList bev){
        bev.add(coke);
        bev.add(dietCoke);
        bev.add(sprite);
        bev.add(tea);
        bev.add(water);
    }
    
    public static void delEntry(ArrayList bev, int n){
        bev.remove(n - 1);
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
