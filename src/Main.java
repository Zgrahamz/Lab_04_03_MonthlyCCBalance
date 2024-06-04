// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int cardBal = 5000;
        double cardInterest = 0.17;
        double m1IntBal = cardBal * cardInterest;
        double m2IntBal = (cardBal + m1IntBal) * cardInterest;

        System.out.println("Interest due after one month is " + m1IntBal);
        System.out.println("Interest due after two months is " + m2IntBal);
    }
}