public class CheckNo{
    public void getInput(int n1, int n2, int n3){
        if(n1>n2 && n1>n3)
        {
            System.out.println("Greatest number: "+n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("Greatest number: "+n2);
        }
        else if(n3>n1 && n3>n2){
            System.out.println("Greatest number: "+n3);
        }
        else if(n1==n2 && n1!=n3){
            System.out.println(n1+" and "+n2+ " both are same" );
        }
        else if(n2==n3 && n2!=n1){
            System.out.println(n2+" and "+n3+ " both are same" );
        }
        else if(n1==n3 && n1!=n2){
            System.out.println(n1+" and "+n3+ " both are same");
        }
        else {
            System.out.println("All numbers are equal!!");
        }
    }
    public static void main(String[] args) {
        CheckNo c = new CheckNo();
        c.getInput(81,81,81);
    }
}