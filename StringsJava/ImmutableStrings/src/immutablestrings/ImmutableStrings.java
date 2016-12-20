/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutablestrings;

/**
 *
 * @author invent
 */
public class ImmutableStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.hashCode());
        String s2 = "Word";
         System.out.println(s2.hashCode());
    }
    
}
