import java.util.Scanner;

public class YearCheck{
public static void main(String[]args){
     Scanner Scanner = new Scanner(System.in);

     System.out.println("Enter the Year:");
     int year = Scanner.nextInt();

     if (year % 400 == 0){
        System.out.println("it is a century leap year.");
     }else if(year % 4 == 0 ){
        System.out.println("it is a century year but not a leap year:");
     }else if( year % 4 ==0 ){
        System.out.println("it is a leap year:");
     }else{
        System.out.println("it is not a leap year:");
    }
       Scanner.close();
  }
   
}
