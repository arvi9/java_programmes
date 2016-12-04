/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchjava;
import  java.util.*;
/**
 *
 * @author invent
 */
public class SwitchJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int code=0;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Input color code = ");
        try {
             code = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Input Integer values");
           return;
           
        }
        
        switch(code)
        {
        case 1: System.out.println("Blue");break;
        case 2: System.out.println("Red");break;
        default:System.out.println("Black");
        }
    }
    
}
