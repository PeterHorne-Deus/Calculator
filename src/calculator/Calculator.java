/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = keyboard.nextInt();
        System.out.println("Enter Second Number");
        int num2 = keyboard.nextInt();
        System.out.println("Enter either 1 for (-) , 2 for (+) , 3 for (/) , 4 for (*)");
        int num3 = keyboard.nextInt();
        int num4 = 1;
       
        
              
      if ( num3 == 1  ){
     num4 = num1-num2 ;
   }
      if ( num3 == 2  ){
     num4 = num1+num2 ;
   }
      if ( num3 == 3){
     num4 = num1/num2 ;
   }
      if ( num3 == 4  ){
     num4 = num1*num2 ;
   }
            
        System.out.print(num4  + "\n");
        
    }
    
}
