/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodimensionarrayjava;

/**
 *
 * @author invent
 */
import  java.util.*;
public class TwoDimensionArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int marks[][] = new int[x][y];
        String name[][] = new  String[2][3];
        int marks2[][] = {{2,3,4},{3,4,5}};
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(marks2[i][j]);
            }
        }
        System.out.println("Input Values");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                marks[i][j] = sc.nextInt();
            }
            
        }
        
        System.out.println("Transpose of Matrix");
           for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(marks[j][i]);
                System.out.print(" ");
            }
               System.out.print("\n");
        }
        
        System.out.println(marks.length);
        
    }
    
}
