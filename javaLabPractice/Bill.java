import java.util.Scanner;

public class Bill{
       public static void main(String[]args){
       Scanner Scanner = new Scanner(System.in);

      System.out.println("Enter the number of units ");
      int units = Scanner.nextInt();

      double Bill=calculateBill(units);

      System.out.println("the totsl Bill is: RS."+Bill);

      Scanner.close();
}

public static double calculateBill(int units){
        double charges = 0;

        if(units<=100){
           charges = units*2.0;
        }else if(units<=200){
           charges = 100*2.0+(units -100)*1.80;
        }else{
           charges = 100*2.0*100*1.80*+(units - 200)*1.50;
        }
           charges +=200;
           return charges;

     }
}
 
