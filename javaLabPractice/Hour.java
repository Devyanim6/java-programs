import java.util.Scanner;
class Hour{
           public static void main(String args[])
           {
            Scanner Scanner = new Scanner(System.in);

            System.out.println("Enter The Time:");
             int Hour = Scanner.nextInt();

            if (Hour<0||Hour>23){
                 
               System.out.println("Invalid Input");
            }else if(Hour>= 5 && Hour<12){
                System.out.println("Morning");
            }else if(Hour>=12 && Hour <17){
                System.out.println("Afternoon");
            }else if(Hour>=17 && Hour<21){
                System.out.println("Night");
            }
         
            Scanner.close();
   }
}

            