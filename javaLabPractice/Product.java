import java.util.Scanner;

public class Product{
public static void main(String[]args){
     Scanner Scanner = new Scanner(System.in);

     System.out.print("Enter first number:");
     int num1 = Scanner.nextInt();


     System.out.print("Enter Second number:");
     int num2 = Scanner.nextInt();

     
     System.out.print("Enter Third Number:");
     int num3 = Scanner.nextInt();

   
     System.out.print("Enter Character (s for sum,p for product):");
     
     char operation = Scanner.next().charAt(0);

     if(operation == 's'){
        int sum = num1 + num2 + num3;
    
     System.out.println("the sum of the number is:"+ sum);
     }else if(operation == 'p'){
      
      int product = num1*num2*num3;
      System.out.println("the product of the sum is:"+product);
     }else{
           System.out.println("invalid character");
     }

       Scanner.close();
 }
}

      

        
     