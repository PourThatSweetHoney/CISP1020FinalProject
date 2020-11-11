
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi Graham
 */
public class NubianBitesTester {
    
    public static void main(String[] args) throws InvalidInputException{
        ArrayList<Appetizer> apps = new ArrayList<>();
        Appetizer.addEntry(apps);
        
        ArrayList<MainCourse> mC = new ArrayList<>();
        MainCourse.addEntry(mC);

        ArrayList<Beverage> bev = new ArrayList<>();
        Beverage.addEntry(bev);
        //Beverage.delEntry(bev, 2);
        
        Scanner in = new Scanner(System.in);
        int select = 0;
        String choice = "";
        boolean flag = false;
        
        //System.out.println("Do you want to edit the menu? (y/n)");
        //choice = in.nextLine();
        do{
            try{
            System.out.print("Do you want to edit the appetizer menu? (y/n)");
            choice = in.nextLine();
                if (choice.toLowerCase().equals("y")) {
                    do {
                        try {
                            for (int i = 0; i < apps.size(); i++) {
                                System.out.println((i + 1) + ") " + apps.get(i).toString());
                            }
                            System.out.println("Pick an item number to remove from menu or enter 0 to continue with no changes");
                            System.out.println("If you make a mistake type -1 to reset menu: ");
                            select = in.nextInt();
                            if (select <= apps.size() && select >= 1) {
                                Appetizer.delEntry(apps, select);
                            } else if (select == 0) {
                            } else if (select == -1){
                                apps.clear();
                                Appetizer.addEntry(apps);
                            } else {
                                throw new InvalidInputException("Invalid input, please try again");
                            }

                        } catch (InvalidInputException ex) {
                            System.out.println(ex.getMessage());
                        }
                    } while (select !=0);
                    flag = true;
                }
            else if(choice.toLowerCase().equals("n")){
                flag = true;
            }
            else{
                flag = false;
                throw new InvalidInputException("Invalid input, please try again.");
            }
            }catch(InvalidInputException e){
                System.out.println(e.getMessage());
            }
        }
        while(flag == false);
        
        do{
            try{
            System.out.print("Do you want to edit the entree menu? (y/n)");
            choice = in.nextLine();
                if (choice.toLowerCase().equals("y")) {
                    do {
                        try {
                            for (int i = 0; i < mC.size(); i++) {
                                System.out.println((i + 1) + ") " + mC.get(i).toString());
                            }
                            System.out.println("Pick an item number to remove from menu or enter 0 to continue with no changes");
                            System.out.println("If you make a mistake type -1 to reset menu: ");
                            select = in.nextInt();
                            if (select <= mC.size() && select >= 1) {
                                MainCourse.delEntry(mC, select);
                            } else if (select == 0) {
                            } else if (select == -1){
                                mC.clear();
                                MainCourse.addEntry(mC);
                            } else {
                                throw new InvalidInputException("Invalid input, please try again");
                            }

                        } catch (InvalidInputException ex) {
                            System.out.println(ex.getMessage());
                        }
                    } while (select !=0);
                    flag = true;
                }
            else if(choice.toLowerCase().equals("n")){
                flag = true;
            }
            else{
                flag = false;
                throw new InvalidInputException("Invalid input, please try again.");
            }
            }catch(InvalidInputException e){
                System.out.println(e.getMessage());
            }
        }
        while(flag == false);
        
        do{
            try{
            System.out.print("Do you want to edit the beverage menu? (y/n)");
            choice = in.nextLine();
                if (choice.toLowerCase().equals("y")) {
                    do {
                        try {
                            for (int i = 0; i < bev.size(); i++) {
                                System.out.println((i + 1) + ") " + bev.get(i).toString());
                            }
                            System.out.println("Pick an item number to remove from menu or enter 0 to continue with no changes");
                            System.out.println("If you make a mistake type -1 to reset menu: ");
                            select = in.nextInt();
                            if (select <= bev.size() && select >= 1) {
                                Beverage.delEntry(bev, select);
                            } else if (select == 0) {
                            } else if (select == -1){
                                bev.clear();
                                Beverage.addEntry(bev);
                            } else {
                                throw new InvalidInputException("Invalid input, please try again");
                            }

                        } catch (InvalidInputException ex) {
                            System.out.println(ex.getMessage());
                        }
                    } while (select !=0);
                    flag = true;
                }
            else if(choice.toLowerCase().equals("n")){
                flag = true;
            }
            else{
                flag = false;
                throw new InvalidInputException("Invalid input, please try again.");
            }
            }catch(InvalidInputException e){
                System.out.println(e.getMessage());
            }
        }
        while(flag == false);
        
//        for (int i = 0; i < mC.size(); i++){
//            System.out.println((i + 1) + ") " + mC.get(i).toString());
//        }
//        
//        for (int i = 0; i < bev.size(); i++){
//            System.out.println((i + 1) + ") " + bev.get(i).toString());
//        }
    }
    
}
