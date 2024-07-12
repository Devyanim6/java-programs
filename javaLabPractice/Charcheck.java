public class Charcheck {

    public static void main(String[] args) {
      
        checkCharacter('A');
        checkCharacter('z');
        checkCharacter('5');
        checkCharacter('@');
    }

   
    public static void checkCharacter(char ch) {
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}
