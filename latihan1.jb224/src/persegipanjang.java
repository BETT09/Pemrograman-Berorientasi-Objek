import java.util.*;
public class persegipanjang {
    public static void main(String[] args) {

        //variabel
        Scanner kbd = new Scanner(System.in);
        int panjang,lebar,luas,kll;

        //inisiasi
        System.out.println("silahkan masukan panjang");
        panjang=kbd.nextInt();
        System.out.println("silahkan masukan lebar");
        lebar= kbd.nextInt();

        //proses
        luas=panjang*lebar;
        kll=2*(panjang+lebar);

        System.out.println("luasnya adalah"+luas);
        System.out.println("keliling adalah"+kll);
    }
}
