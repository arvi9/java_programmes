/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuejava;

/**
 *
 * @author invent
 */
public class ContinueJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if(i<5)continue; // Go Back to the loop until condition is false
                System.out.println(i);
        }
    }
    
}
