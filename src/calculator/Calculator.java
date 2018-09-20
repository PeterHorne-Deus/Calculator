/*
 * Peter Horne-Deus
 * calculator.java
 * This program is a simple calculator 
 * September 20, 2018
 */

package calculator;

import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creates the scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Variables for restarting and stoping the program
        
        int restart = 1;
        int i = 0;
       
        //Calculator 
        while (i < 1){
            if (restart == 0 || restart == 1){


                restart = 2;

                //User input
                System.out.println("Enter first Number");
                double num1 = keyboard.nextDouble();

                System.out.println("Enter either 1 for (-) , 2 for (+) , 3 for (/) , 4 for (*)");
                int num2 = keyboard.nextInt();

                System.out.println("Enter Second Number");
                double num3 = keyboard.nextDouble();

                //Calculations
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
                 //Text to finish program
                    System.out.print("Total: " + num4  + "\n");
                    System.out.println("To Restart Press 0 or Press 3 To Exit");
                    restart = keyboard.nextInt();

                    //To close the program
                    if (restart == 3){
                            i = 3;
                        }

        }  
    }
    }
   
    }

