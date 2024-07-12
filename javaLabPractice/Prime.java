import java.util.Scanner;
class Prime{

            public static void main(String[]args){
            Scanner Scanner = new Scanner(System.in);
 
            System.out.println("Enter the number:");
            int n1 = Scanner .nextInt();

            int n2 = 5;
            boolean isPrime = true;
  
            if (n<= 1){
                 isPrime = false;
            }else{
              for (int i = 2; i<=n/2;i++)
                  if (n % i == 0){
                      isPrime = false;
                      Scanner.close();

                 }
             } 
          }
}
       
            
