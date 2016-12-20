/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydecleration;

/**
 *
 * @author invent
 */
import  java.util.*;
import  java.io.*;
public class ArrayDecleration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
      int marks[] = {1,2,3,4,5,7,8,9};//Array Declearion
      int mark[];
      mark = new int[5];
        System.out.println(mark.length);
        Scanner sc = new  Scanner(System.in);
        int i = sc.nextInt();
        mark[0] = i;
        System.out.println(mark[0]);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str  = br.readLine();
       //System.out.println(str);
        String x[] = new String[10000];
        StringTokenizer st =new  StringTokenizer( str," ");
         while (st.hasMoreTokens()) {            
            int j=0;
            int strlen = st.countTokens();
            while(j<strlen)
            {
                        x[j] = st.nextToken();
                        j++;
            }

        }
        for (String string : x) {
               if(string != null)
            System.out.println(string);  
          
        }
    }
    
}
