/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invent
 */
public class PreAndPostDecrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--------PRE---------");
        preDecrement();
       System.out.println("---------POST---------");
       postDecrement();
        
    }
     private static void preDecrement()//Pre Increment
    {
     int x =1;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
        System.out.println("---------PRE EXAMPLE---------");
        int a=1,b=2;
        System.out.println(a=++b);
    
    }
    
    private static void postDecrement()//Post Increment
    {
     int x =1;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
     System.out.println("---------POST EXAMPLE---------");
        int a=1,b=2;
        System.out.println(a=b++);
        System.out.println(++a*a++);
    }
}
