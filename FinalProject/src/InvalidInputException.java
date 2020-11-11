/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi Graham
 */
public class InvalidInputException extends Exception{
    
    public InvalidInputException(String error){
        super(error);
    }
}
