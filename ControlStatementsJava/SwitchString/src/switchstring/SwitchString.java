/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstring;

/**
 *
 * @author invent
 */
import  java.util.*;
public class SwitchString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        String st =  sc.next().toUpperCase();
        switch(st)
        {
        case "HI": System.out.println("hi");break;
        default: System.out.println("hello");
        }
    }
    
}
