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
        int restart = 1;
        int i = 0;
       
        while (i < 1){
        if (restart == 0 || restart == 1){
        
        restart = 2;
        
        System.out.println("Enter first Number");
        double num1 = keyboard.nextDouble();
        
        System.out.println("Enter either 1 for (-) , 2 for (+) , 3 for (/) , 4 for (*)");
        int num2 = keyboard.nextInt();
        
        System.out.println("Enter Second Number");
        double num3 = keyboard.nextDouble();
        
        double num4 = 1;
           
         if ( num2 == 1  ){
            num4 = num1 - num3 ;
         }
         if ( num2 == 2  ){
            num4 = num1 + num3 ;
        }
         if ( num2 == 3){
            num4 = num1/num3 ;
         }
         if ( num2 == 4  ){
            num4 = num1*num3 ;
         }
        System.out.print("Total: " + num4  + "\n");
        System.out.println("To Restart Press 0 or Press 3 To Exit");
        restart = keyboard.nextInt();
        
        if (restart == 3){
                i = 3;
            }
        
        }  
    }
    }
    
}
