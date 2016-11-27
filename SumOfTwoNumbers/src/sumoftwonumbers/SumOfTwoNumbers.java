/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoftwonumbers;

/**
 *
 * @author invent
 */

public class SumOfTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=10,j=20;
        System.out.println("Sum = "+i+j);// Left to right string
        System.out.println("Sum = "+(i+j));
        System.out.println(args[0]);// Print the @args = 10,20
        for (String arg : args) {
            System.out.println(arg);
        }
        
    }
    
}
