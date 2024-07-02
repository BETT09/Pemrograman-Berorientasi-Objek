import java.util.*;
public class sentinellop {
    public static void main(String[] args) {
        Scanner kbd=new Scanner(System.in);
        System.out.println("Apakah Ada assgmn ? y/n");
        double total=0.0;
        int limit=0;
        char ass=kbd.next().charAt(0);

        while(ass=='y'||ass=='y'){
            System.out.println("input assgment Score");
            double score=kbd.nextInt();
            total+=score;
            System.out.println("apakah ada assgmn ? y/n");
            ass=kbd.next().charAt(0);
            limit++;
        }
        double rata=total/limit;
        System.out.println("Rata-ratan"+rata);
    }
}
