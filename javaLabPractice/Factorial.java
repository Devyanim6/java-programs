import java.util.Scanner;

public class Factorial{
                          public static void main(String[]args){
                          Scanner Scanner = new Scanner(System.in);
     
                          System.out.println("Enter the value of n:");
                          int n = Scanner.nextInt();
 
                          int Factorial = 1;

                         
                          for (int i = 1; i<=n;i++){
                           Factorial = Factorial*i;

                         }
                      System.out.println("the Factorial of the first "+n+" numbers is:"+Factorial);
                      }
                   }
                
      
