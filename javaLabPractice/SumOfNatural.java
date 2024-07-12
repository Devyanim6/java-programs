import java.util.Scanner;

public class SumOfNatural{
                          public static void main(String[]args){
                          Scanner Scanner = new Scanner(System.in);
     
                          System.out.println("Enter the value of n:");
                          int n = Scanner .nextInt();
 
                          int sum = 0;
                         
                          for (int i = 1; i<=n;i++){
                           sum+=i;

                         }
                      System.out.println("the sum of the first "+n+" natural numbers is:"+sum);
                      }
                   }
                
      