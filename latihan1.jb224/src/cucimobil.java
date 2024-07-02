import java.util.*;
public class cucimobil {
    public static void main(String[] args) {
        int durasi,total;
        int harga=25000;
        Scanner CCI= new Scanner(System.in);

        System.out.println("masukkan Durasi");
        durasi=CCI.nextInt();
        total=durasi*25000;

        System.out.println("total Adalah"+total);
    }
}