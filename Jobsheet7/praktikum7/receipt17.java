/**
 * receipt17
 */
public class receipt17 {
    String transactionId;
    String date;
    int quantity;
    double totalPrice;

    public receipt17(String transactionId, String date, int quantity, double totalPrice){
        this.transactionId = transactionId;
        this.date = date;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
    
    public String toString() {
        return "Transaction ID: " + transactionId + ", Date: " + date + ", Quantity: " + quantity + ", Total Price: " + totalPrice;
    }
}