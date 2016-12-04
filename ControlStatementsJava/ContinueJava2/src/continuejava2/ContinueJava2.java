/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuejava2;

/**
 *
 * @author invent
 */
public class ContinueJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j=0;
        loop1:while(j<=3)
        {
             System.out.println(j);
            loop2:for (int i = 0; i <=5; i++) {
                System.out.println("\t"+i);
                if (j==3) {
                    j++;
                    continue loop1;
                }
                 j++;
            }
        
            System.out.println("---------------");
        }
         System.out.println("-------END-------");
    }
    
}
