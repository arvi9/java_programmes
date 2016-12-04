/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author invent
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i=10;
        while (i>0) { 
            if (i==5) {
                return; //Exit the current Method main()
            } 
            System.out.println(i);
            i--;
        }
    }
    
}
