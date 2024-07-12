
public class Timeconv{
                      public static void timeConverter(int hr,int min){
                      
                      System.out.println("hours stored:"+hr+"hours");
                      System.out.println(hr+"hours in minutes:"+(hr*60)+"minutes");
                      System.out.println();
                      System.out.println("minute stored:"+min+"minutes");
                      System.out.println(min+"minutes in hour:"+(min/60)+"hours");
    
                      }
                      public static void main(String[]args){
                      
                      System.out.println("main starts");
                      timeConverter(5,180);
                      System.out.println("main ends");

                     }
                  }
                     
