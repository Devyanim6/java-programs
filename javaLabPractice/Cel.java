import java.util.Scanner;

public class Cel{
                 public static void main(String[]args){

                 Scanner Scanner = new Scanner(System.in);
                 System.out.print("Enter The Temparature In celsius:");
                 double celsius = Scanner.nextDouble();

                 double fahrenheit = (celsius* 9/5)+32;
                 System.out.println(celsius +" degree cel is equal to " + fahrenheit + "degrees fahrenheit.");

                 Scanner.close();
              }
           }