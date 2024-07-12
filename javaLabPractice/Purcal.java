import java.util.Scanner;

public class Purcal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price of the product: ");
        double unitPrice = scanner.nextDouble();
        
        System.out.print("Enter quantity of the product: ");
        int quantity = scanner.nextInt();
        
        double totalCost = unitPrice * quantity;
        System.out.println("Total cost: Rs " + totalCost);
        
        double discount;
        if (totalCost > 20000) {
            discount = 0.20 * totalCost;
        } else {
            discount = 0.10 * totalCost;
        }
        
        System.out.println("Discount: Rs " + discount);
        
        double netPrice = totalCost - discount;
        System.out.println("Net price to be paid: Rs " + netPrice);
        
        scanner.close();
    }
}
