public class Triangle{
    public void getAngle(int a1, int a2, int a3){

        if(a1<90 && a2<90 && a3<90){
            System.out.println("The Tringle is Acute - angle triangle");
        }
        else if(a1<=90 && a2<=90 && a3==90){
            System.out.println("The Tringle is Right - angle triangle");
        }
        else if((a1>90 && 180>=a1) && (a2>90 && 180>=a2) && (a3>90 && 180>=a3)){
            System.out.println("The Tringle is Obtuse - angle tringle");
        }
        else{
            System.out.println("Triangle not possible");
        }
    }

    public static void main(String[] args) {
        Triangle angle = new Triangle();
        angle.getAngle(90,90 ,90 );
    }
}