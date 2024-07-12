import java.util.Scanner;s

class Stud{
           public static void main(String[]args){
           Scanner Scanner = new Scanner(System.in);

           System.out.println("Enter The Marks:");
           int marks = Scanner.nextInt();

           String grade = getGrade(marks);

           System.out.println("the grade is:"+grade);
    
           Scanner.close();
}

public static String getGrade(int marks){
       if(marks > 90){
          return "A";

       }else if (marks>=70){
         return  "B";
     
       }else if(marks>=50){
         return "C";
       
       }else{
          return "D";
       }
     }
  }