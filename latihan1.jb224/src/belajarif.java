import java.util.*;
public class belajarif {
    public static void main(String[] args) {
        int umur;
        Scanner kbd= new Scanner(System.in);
        System.out.println("masukkan umur");
        umur= kbd.nextInt();

        if(umur>17){
            System.out.println("kamu bis amengikuti pemilu");
        }else {
            System.out.println("kamu belum bisa ikut pemilu");
        }
    }
}
