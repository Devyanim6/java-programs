import java.util.Scanner;

public class Bmi{
                 public static void main(String[]args){
                 Scanner Scanner = new Scanner(System.in);
    
                 System.out.println("Enter the weight:");
                 double weight = Scanner.nextDouble();
                
                 System.out.println("Enter the height:");
                 double height = Scanner.nextDouble();

                 double Bmi = weight/(height*height);
                 System.out.println("mass if your body:");

                 Scanner.close();
               }
            }