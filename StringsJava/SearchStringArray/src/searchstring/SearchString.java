/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchstring;

/**
 *
 * @author invent
 */
import  java.io.*;
public class SearchString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
   
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Number of Elemts in Array");
        int n = Integer.parseInt(br.readLine()) ;
        String arr[] = new String[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i <n; i++) {
            arr[i] = br.readLine();
        }
        
        System.out.println("Enter String to Search");
        String input = br.readLine();
        int loc = 0;
        for (String string : arr) {
            loc++;
            if(string.equalsIgnoreCase(input))
            {
                System.out.println("String Location"+" "+(loc));
            }
        }
        
        
        
        
    }
    
}
