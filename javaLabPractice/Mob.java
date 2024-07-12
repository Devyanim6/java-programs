public class Mob{
    public void getDetails(int sp, int cp){

     if(sp>cp){
         int p = sp-cp;
         System.out.println("The profit is "+p);

         double pp = (p*10)/cp;
         System.out.println("The Profit Percentage is "+pp);
            }

        else if(sp<cp){
            int l=cp-sp;
            System.out.println("The Loss is "+l);

            double lp = (l*100)/sp;
            System.out.println("The Loss Perecntage is "+lp);
        }
        else {
            System.out.println("Neither Profit nor Loss");
        }
    }

    public static void main(String[] args) {
        Mob m = new Mob();
        m.getDetails(20000, 15000);
    }
}