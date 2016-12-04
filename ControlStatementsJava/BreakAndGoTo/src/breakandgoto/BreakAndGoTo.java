/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakandgoto;

/**
 *
 * @author invent
 */
public class BreakAndGoTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean x = true;
        block1:{
            block2:
            {
                
                block3:
                {
                    System.out.println("Block3");
                    if (x)break block2; //Goto end of Block 2
                }
                System.out.println("Block2");
            }
            System.out.println("Block1");
        }
        System.out.println("Out of All Blocks");
    }
    
}
