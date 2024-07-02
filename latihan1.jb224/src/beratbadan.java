import java.util.*;
public class beratbadan {
    public static void main(String[] args) {
        int berat;

        Scanner kbd= new Scanner(System.in);
        System.out.println("masukkan berat");
        berat= kbd.nextInt();

        if (berat>80){
            System.out.println("kamu terlalu gemuk");
        }else {
            System.out.println("kamu ideal");
        }
    }
}
