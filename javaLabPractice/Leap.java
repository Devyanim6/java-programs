import java.util.Scanner;
public class Leap{
                  public static void main(String []args){
                    Scanner Scanner = new Scanner(System.in);

                    System.out.print("Enter A Year:");
                    int Year = Scanner.nextInt();

                    if(isLeapYear(Year)){
                        System.out.println(Year+"is a Leap Year");
                    }else{
                     System.out.println(Year+"is a not Leap Year");
                    } 

                     Scanner.close();
                    }
                 public static boolean isLeapYear(int Year){
                    if(Year % 400 == 0){
                      return true;
                    }else if(Year % 100 == 0){
                      return false;
                    }else if(Year % 4 == 0){
                      return true;
                     }else{
                      return false;
                     }
                 } 
             }
     
               