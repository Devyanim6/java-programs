import java.util.Scanner;


public class Campair{
       public static void main(String[]args){
            Scanner Scanner = new Scanner(System.in);

       System.out.print("Enter the first number:");
       int number1 = Scanner.nextInt();

       System.out.print("Enter the second number:");
        int number2 = Scanner.nextInt();
     

        if (number1>number2){
           System.out.println("the first number("+ number1 +") is greater than the  second number(" + number2 + ".");
        } else if (number2>number1){
           System.out.println("the second number (" + number2 +")is greater then the first number(" + number1 + ".");
        }else {
             System.out.println("both numbers are equal .");
        }
             Scanner.close();
      }
  }
