/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtockenizerjava;

/**
 *
 * @author invent
 */
import  java.io.*;
import java.util.*;
public class StringTockenizerJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
           BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();
//        StreamTokenizer st = new StreamTokenizer("ABC");
//        String s1 = st.nextToken();
        StringTokenizer st = new StringTokenizer(str,",");
         System.out.println(st.countTokens()); 
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }
//    System.out.println(st.nextToken()); 
           
     
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
       
        
    }
    
}
