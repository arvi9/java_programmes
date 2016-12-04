/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnjava;

/**
 *
 * @author invent
 */
public class ReturnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Return Statement is used to come out of calling method
        ReturnJava.method1();
        return;
        // ReturnJava.method2(); // Unreachable Method 
    }
    public static void  method1()
    {
        System.out.println("Method 1");
    }
     public static void method2()
    {
        System.out.println("Method 2");
    }
}
