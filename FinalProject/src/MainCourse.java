
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
public class MainCourse {
    private String name = "";
    private String itemInfo = "";
    private double price = 0.00;
    
    static MainCourse cGyro = new MainCourse("Chicken Gyro", 8.99, "Taziki sauce, tomato, mixed lettuce and grilled onion");
    static MainCourse lGyro = new MainCourse("Lamb Gyro", 9.99, "Taziki sauce, tomato, mixed lettuce and grilled onion");
    static MainCourse bGyro = new MainCourse("Beef Gyro", 9.99, "Taziki sauce, tomato, mixed lettuce and grilled onion");
    static MainCourse vGyro = new MainCourse("Veggie Gyro", 8.99, "Pesto, tomato, grilled zucchini, squash, onion, roasted" +
            " red pepper and feta");
    static MainCourse chicken = new MainCourse("Grilled Chicken", 10.49, "Served with taziki sauce and a greek salad");
    static MainCourse beef = new MainCourse("Grilled Beef", 10.49, "Served with horseradish sauce and a greek salad");
    static MainCourse lamb = new MainCourse("Grilled Lamb", 10.49, "Served with taziki sauce and a greek salad");
    static MainCourse veggie = new MainCourse("Grilled Veggies", 10.49, "Grilled zucchini, squash, onion, red peppers and asparagus served" +
            " with \ntaziki sauce and greek salad");
    static MainCourse cKebob = new MainCourse("Grilled Chicken Kebobs", 10.49, "Two kebobs served with taziki sauce and a greek salad");
    static MainCourse bKebob = new MainCourse("Grilled Beef Kebobs", 13.49, "Two kebobs served with taziki sauce and a greek salad");
    static MainCourse lKebob = new MainCourse("Grilled Lamb Kebobs", 10.49, "Two kebobs served with taziki sauce and a greek salad");
    static MainCourse gSalad = new MainCourse("Greek Salad", 7.99, "Mixed lettuce with garbanzo beans, roasted red pepper, red onion" +
            ", feta,\npepperocini, kalamata olives and greek dressing");
    static MainCourse mSalad = new MainCourse("Mediteranean Salad", 7.99, "Mixed lettuce with garbanzo beans, roasted red pepper" +
            ", red onion, diced\ntomato and balsamic vinaigrette");
    static MainCourse cSalad = new MainCourse("Caesar Salad", 7.99, "Mixed lettuce with grated parmesan cheese, croutons and caesar" +
            " dressing");
    
    public MainCourse(){
        
    }
    
    public MainCourse(String name, double price, String itemInfo){
        this.name = name;
        this.price = price;
        this.itemInfo = itemInfo;
    }
    
    public static void addEntry(ArrayList mC){
        mC.add(cGyro);
        mC.add(lGyro);
        mC.add(bGyro);
        mC.add(vGyro);
        mC.add(chicken);
        mC.add(beef);
        mC.add(lamb);
        mC.add(veggie);
        mC.add(cKebob);
        mC.add(bKebob);
        mC.add(lKebob);
        mC.add(gSalad);
        mC.add(mSalad);
        mC.add(cSalad);
    }
    
    public static void delEntry(ArrayList mC, int n){
        mC.remove(n - 1);
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
