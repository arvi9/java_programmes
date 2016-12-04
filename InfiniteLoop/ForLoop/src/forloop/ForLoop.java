/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

/**
 *
 * @author invent
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int j = 0;
        System.out.println("---------FOR-----------");
        for( ;j < 10; ) {
            
            System.out.println(j);
            j++;
        }
        System.out.println("---------FOR TWO Variables-----------");
        for(int k=0,l=0;k<10;k++,l++)
        {
            System.out.println("hi");
        
        
        }
        System.out.println("---------NESTED FOR----------");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(i);
            for(int p=0;p<10; p++)
            {
                System.out.println("\t"+p);
            }
            
        }
    }
    
}
