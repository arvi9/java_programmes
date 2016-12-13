/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author invent
 */
import java.io.*;

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f1 = 0, f2 = 1;
        
            System.out.print(f1);
             System.out.print("\t"+f2);
             int f ;
            for (int i = 3; i <= n; i++) 
            {
                
                f= f1+f2; //Fn = Fn-1 + Fn-2;
                System.out.print("\t"+f);
                f2=f1;
                f1=f;
                
            }
             System.out.println("\n");
        }
    }


