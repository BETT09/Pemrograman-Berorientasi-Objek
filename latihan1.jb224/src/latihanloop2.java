import java.util.*;
public class latihanloop2 {
    public static void main(String[] args) {
        int counter, score, total, limit;
        double rata;
        String nama, jur;
        counter = 1;
        total = 0;
        Scanner kbd = new Scanner(System.in);
        System.out.println("how many assgment ?");
        limit = kbd.nextInt();

        while (counter <= limit) {
            System.out.println("masukkan nama");
            nama = kbd.next();
            System.out.println("masukan jurusan");
            jur = kbd.next();
            System.out.println("input assgment Score");
            score = kbd.nextInt();
            total += score;
            counter++;
        }
        rata = total / (double) limit;
        System.out.println("rata-rata" + rata);
    }
}