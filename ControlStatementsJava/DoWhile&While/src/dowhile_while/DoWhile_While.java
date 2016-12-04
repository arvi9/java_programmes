/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile_while;

/**
 *
 * @author invent
 */
public class DoWhile_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        
        System.out.println("---------DO WHILE------------");
        do{
            System.out.println(i);
            i++;
        }while(i<=10);// With semicolan
        System.out.println("---------WHILE------------");
        while(i>=1)
        {
            System.out.println(i);
            i--;
        }
        int j = 0;
        System.out.println("---------FOR-----------");
        for( ;j < 10; ) {
            
            System.out.println(j);
            j++;
        }
        for(int k=0,l=0;k<10;k++,l++)
        {
            System.out.println("hi");
        
        
        }
    }
    
}
