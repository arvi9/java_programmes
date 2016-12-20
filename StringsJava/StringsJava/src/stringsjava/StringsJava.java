/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsjava;

/**
 *
 * @author invent
 */
public class StringsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ways to Create Strings in Java");
        String s;
        s = "hello";
        String s1 =  new  String("Hello"); // Object
        char c[] = {'h','e','l','l','o'}; // Char Array
        String x = new  String(c,2,3);
        System.out.println(x);
    }
    
}
