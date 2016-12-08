/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferreaderjava;

import java.io.*;

/**
 *
 * @author invent
 */
public class BufferReaderJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter Id:");
            Object obj = br.readLine();
            int id = Integer.parseInt(obj.toString());
            //System.out.println(obj.getClass());
            System.out.println("Enter Gender:");
           char gender = (char)br.readLine().charAt(0);
           
           System.out.println("Enter Name:");
            String name = br.readLine();
            System.out.println("Id ="+id);
            System.out.println("Gender ="+gender);
            System.out.println("Name ="+name);
            
            
            //System.out.println("Id="+id);
            
            

        } 
        catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

}
