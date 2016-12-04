/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferreaderjava;
import  java.io.*;
/**
 *
 * @author invent
 */
public class BufferReaderJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        try {
//          char ch =(char) br.read();  
//          System.out.println(ch);
Object obj = br.readLine();
          String st = (String)obj ;
          int i = Integer.parseInt(st);
          System.out.println(i);
           System.out.println(obj.equals(obj));
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
       
        
    }
    
}
