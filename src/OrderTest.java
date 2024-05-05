public class OrderTest {
    public static void main(String[] args) {
        OrderAction order = new OrderAction();

        //Vince Ted Matthew D. Chua
        //May 5th, 2024
        //Laboratory Assignment 5: SOLID Principle Assignment WK (14-15)

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("johndoe@example.com");
    }
}