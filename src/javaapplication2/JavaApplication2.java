
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {
     /**
     * 
     * @param x
     * @return 
     */
 public static double method(double base , int exponent ){
     
     int ans=1;
        for(int c=1;c<=exponent;c++){
            
            ans *=base;
        
        }
        System.out.println(base+" "+"^ "+exponent+" = "+ ans);
                
        return ans;
    }
 
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
        double x=0;
       int y=0;
       while(true){
        System.out.println("Input Number : ");
        x=s.nextDouble();
        
        System.out.println("Input Number : ");
        y=s.nextInt();
        
                       method(x,y);
       }    
        
    }
    
}
