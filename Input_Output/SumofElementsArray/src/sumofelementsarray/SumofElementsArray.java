/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofelementsarray;

/**
 *
 * @author invent
 */
public class SumofElementsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,7};
        int r = 0;
        float average;
        for (int i : arr) {
            r += i;
            
        }
        System.out.println(average = (float)r/arr.length); //
        r = 0;
        for (int i = 0; i < arr.length; i++) {
           System.out.println(r += i); 
        }
        
    }
    
}
