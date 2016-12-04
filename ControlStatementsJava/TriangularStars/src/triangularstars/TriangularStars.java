/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangularstars;
import java.util.*;

/**
 *
 * @author invent
 */
public class TriangularStars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc =  new  Scanner(System.in);
        System.out.println("Enter Value of N =");
        int n =sc.nextInt();
        for (int i = 1; i <= n; i++) {
          for(int j=1;j<=i;j++)
          {
              System.out.print(" * ");
          }
            System.out.println(""+i);
        }
    }
    
}
