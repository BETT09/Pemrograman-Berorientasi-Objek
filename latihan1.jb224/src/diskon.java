import java.util.Scanner;
public class diskon {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                // Langkah 1: Mendefinisikan variabel
                double totalBelanja, diskon = 0, totalPembayaran;

                // Langkah 2: Meminta input dari pengguna
                System.out.print("Masukkan total belanja: ");
                totalBelanja = input.nextDouble();

                // Langkah 3: Menghitung diskon berdasarkan total belanja
                if (totalBelanja >= 100000) {
                    diskon = 0.1 * totalBelanja; // Diskon 10%
                } else if (totalBelanja >= 50000) {
                    diskon = 0.05 * totalBelanja; // Diskon 5%
                }

                // Langkah 4: Menghitung total pembayaran setelah diskon
                totalPembayaran = totalBelanja - diskon;

                // Langkah 5: Menampilkan hasil
                System.out.println("Diskon: Rp" + diskon);
                System.out.println("Total pembayaran: Rp" + totalPembayaran);

                input.close();
            }
        }
