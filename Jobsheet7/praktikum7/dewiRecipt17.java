import java.util.Scanner;
import java.util.Stack;

/**
 * dewiRecipt17
 */
public class dewiRecipt17 {

    public static void main(String[] args) {
        Stack<receipt17> receiptStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 8; i++) {
            System.out.println("Enter details for Receipt " + i + ":");
            System.out.print("Transaction ID: ");
            String transactionId = scanner.nextLine();
            System.out.print("Date: ");
            String date = scanner.nextLine();
            System.out.print("Quantity of Items: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Total Price: ");
            double totalPrice = Double.parseDouble(scanner.nextLine());
            
            receipt17 receipt = new receipt17(transactionId, date, quantity, totalPrice);
            receiptStack.push(receipt);
        }
        
        System.out.println("\nRetrieving Receipts:");
        while (!receiptStack.isEmpty()) {
            receipt17 receipt = receiptStack.pop();
            System.out.println(receipt);
        }
    }
}