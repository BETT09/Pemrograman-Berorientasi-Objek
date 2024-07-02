import java.util.*;
public class tugas {
    public static void main (String [] args) {
        Scanner kbd = new Scanner(System.in);

        int uangmakan,gapok,jmkerja,gatot;

        System.out.println("masukkan uang makan");
        uangmakan=kbd.nextInt();
        System.out.println("masukkan jumlah kerja");
        jmkerja=kbd.nextInt();
        System.out.println("masukkan gaji pokok");
        gapok=kbd.nextInt();

        gatot=gapok+(uangmakan*jmkerja);
        System.out.println("total gaji"+gatot);
    }
}
