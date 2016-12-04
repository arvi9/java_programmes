/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakstatement;

/**
 *
 * @author invent
 */
public class BreakStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i=0;
        for(;;)
        {
            System.out.println(i);
         if(i>10)break;
         i++;
        }
    }
    
}
