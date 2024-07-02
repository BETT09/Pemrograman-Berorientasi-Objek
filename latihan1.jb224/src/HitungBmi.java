import java.util.Scanner;
public class HitungBmi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat (kg): ");
        double weight = input.nextDouble();

        System.out.print("Masukkan tinggi (m): ");
        double height = input.nextDouble()/100;

        double bmi = calculateBMI(weight, height);
        System.out.println("BMI Anda: " + bmi);

        input.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
