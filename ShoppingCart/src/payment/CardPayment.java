package payment;

public class CardPayment implements Payment{
    private final String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid "+amount+ " with card "+cardNumber);
    }
}
