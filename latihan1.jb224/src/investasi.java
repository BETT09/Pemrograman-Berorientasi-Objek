import java.util.Scanner;

public class investasi{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for investment amount and duration
        System.out.print("Masukkan nominal investasi: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Masukkan jangka waktu investasi (dalam bulan): ");
        int durationInMonths = scanner.nextInt();

        // Calculate the monthly interest rate
        double monthlyInterestRate = 0.02 / 12; // 2% annual interest divided by 12 months

        // Calculate the total investment value after each month
        for (int month = 1; month <= durationInMonths; month++) {
            double interestEarned = principalAmount * monthlyInterestRate;
            principalAmount += interestEarned; // Add interest to principal

            System.out.printf("Nilai investasi di bulan %d: Rp%.2f\n", month, principalAmount);
        }
    }
}
