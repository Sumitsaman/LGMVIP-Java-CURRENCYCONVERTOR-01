import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates
        double usdToEur = 0.85;
        double usdToGbp = 0.74;
        double usdToJpy = 110.62;

        System.out.println("Currency Converter");
        System.out.println("==================");
        System.out.println("Available currencies: EUR, GBP, JPY");

        System.out.print("Enter the amount in USD: ");
        double amountInUsd = scanner.nextDouble();

        System.out.print("Enter the target currency (EUR, GBP, JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

        double convertedAmount;

        switch (targetCurrency) {
            case "EUR":
                convertedAmount = amountInUsd * usdToEur;
                System.out.println("Converted amount: " + convertedAmount + " EUR");
                break;
            case "GBP":
                convertedAmount = amountInUsd * usdToGbp;
                System.out.println("Converted amount: " + convertedAmount + " GBP");
                break;
            case "JPY":
                convertedAmount = amountInUsd * usdToJpy;
                System.out.println("Converted amount: " + convertedAmount + " JPY");
                break;
            default:
                System.out.println("Invalid target currency.");
        }
    }
}
