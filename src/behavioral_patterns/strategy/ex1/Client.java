package behavioral_patterns.strategy.ex1;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(
                new CreditCardPayment("John Doe", "1234567890")
        );

        shoppingCart.checkout(100);

        shoppingCart.setPaymentStrategy(new PayPalPayment("johndoe@example.com"));
        shoppingCart.checkout(200);
    }
}
