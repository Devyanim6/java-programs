import java.util.Scanner;
 class OppCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                System.out.println("Opposite case: " + Character.toLowerCase(ch));
            } else {
                System.out.println("Opposite case: " + Character.toUpperCase(ch));
            }
        } else {
            System.out.println("Not a letter");
        }
        
        scanner.close();
    }
}
