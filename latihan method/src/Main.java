import java.lang.Math;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Math.max(7, 9));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.random());
        salam();
        salam();
        lagu(" Joko");
        System.out.println((hitungjumlah(2000, 0)));
        hitungjumlah(2000, 7);
        System.out.println(hitung.persegi(4));
    }

    public static void salam() {
        System.out.println("Selamat Datang");
    }

    public static void lagu() {
        System.out.println("Selamat Ulang Tahun");
    }

    public static void lagu(String nama) {
        System.out.println("Selamat ulang tahun" + nama);
    }

    public static double hitungjumlah(double harga, int jumlah) {

        double total = harga * jumlah;
        return total;
    }
}