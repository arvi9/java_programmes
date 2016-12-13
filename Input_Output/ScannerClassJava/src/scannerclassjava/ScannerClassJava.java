/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerclassjava;

/**
 *
 * @author invent
 */

import  java.util.*;
public class ScannerClassJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc =new  Scanner(System.in);
        int i = sc.nextInt();
        float f = sc.nextFloat();
        String s = sc.nextLine();
        System.out.printf("Input Integer = %d %n", i);
        
    }
    
}
