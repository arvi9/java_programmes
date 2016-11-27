/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapesequence;

/**
 *
 * @author invent
 */
public class EscapeSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // \n -  New Line
        // \t - new Tab
        // \r - Enter Key
        // \b - Back Space
        // \f - Form Feed
        // \\ -  displays \
        // \" - displays "
        // \' - displays '
        
        String[] s =  {"\n","\t","\r", "\b", "\f", "\\","\"","\'" };
        for (String st : s) {
         System.out.println(st+"A");   
        }
        
    }
    
}
