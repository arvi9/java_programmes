/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtobyteintfloatshortdouble;

/**
 *
 * @author invent
 */
import  java.io.*;
public class StringToByteIntFloatShortDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Accepting Charactor From Keyboard :");
        char c = (char) br.read();
        System.out.println(c);
         System.out.println("Accepting String From Keyboard :");
        String s = (String) br.readLine();
        System.out.println(s);
        System.out.println("Accepting Byte From Keyboard :");
        Byte b = Byte.parseByte(br.readLine()) ;
        System.out.println(b);
        System.out.println("Accepting Short From Keyboard :");
        Short sh = Short.parseShort(br.readLine()) ;
        System.out.println(sh);
        
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
