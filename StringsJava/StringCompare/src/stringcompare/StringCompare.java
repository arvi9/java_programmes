/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcompare;

/**
 *
 * @author invent
 */
public class StringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 =  new String("hello");
        if(s1==s2) //== Compares Reference Number of String Objeccts
        {
            System.out.println("s1 Equal s2");
        }
        else
        System.out.println("s1 Not Equal s2");
         System.out.println("--------------------------");
        
          if(s1==s3)//== Compares Reference Number of String Objeccts [String Constant Pool]
        {
            System.out.println("s1 Equal s3");
        }
        else
        System.out.println("s1 Not Equal s3");
        System.out.println("--------------------------");
           if(s1.equals(s3) )//equals() Compares contents of String Objeccts
        {
            System.out.println("s1 Equal s3");
        }
        else
        System.out.println("s1 Not Equal s3");
        
        
    }
    
}
