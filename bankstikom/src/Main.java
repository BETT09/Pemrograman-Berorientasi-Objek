import java.util.*;
public class Main {
    public static void main(String[] args) {
//
//        Bank Helpbank = new Bank(10);
//        Bankaccount akunsaya = new Bankaccount("Opi");
//        Bankaccount akunteman = new Bankaccount("Andod");
//        Helpbank.addAccount(akunsaya);
//        Helpbank.addAccount(akunteman);
//        akunsaya.deposit(100);
//        akunteman.deposit(-500);
//        akunteman.deposit(500);
//        Helpbank.calTotal();
//        System.out.println(Helpbank.calTotal());
//        Helpbank.findaccount("Opi");
//        akunteman.withdraw(100);
//        System.out.println(Helpbank.getall());
//    }
//}
        Scanner kbd = new Scanner(System.in);
        int pilihan;
        Bank Helpbank = new Bank(20);

        do {
            menu();
            System.out.println("Silahkan masukan pilihan");
            pilihan = kbd.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Silahkan Masukan Nama");
                    String nama = kbd.next();
                    Bankaccount bankaccount = new Bankaccount(nama);
                    Helpbank.addAccount(bankaccount);
                    break;
                case 2:
                    System.out.println("Silahkan Masukan Nama yang Dicari");
                    nama = kbd.next();
                    Bankaccount cariAccount;
                    cariAccount = Helpbank.findaccount(nama);
                    if (cariAccount != null)
                        System.out.println("Data Ketemu \n" + cariAccount.toString());
                    System.out.println("Data Not Found");
                    break;
                case 3:
                    System.out.println("Silahkan Masukan Nama yang Di Deposit");
                    nama = kbd.next();
                    cariAccount = Helpbank.findaccount(nama);
                    if (cariAccount != null){
                        System.out.println("Silahkan Masukan Jumlah");
                    double jumlah = kbd.nextDouble();
                    cariAccount.deposit(jumlah);
                    System.out.println("Deposit Berhasil");
            }
            System.out.println("Data Not Found");
                    break;
                case 4:
                    System.out.println("Silahkan Masukan Nama yang Di Withdraw");
                    nama = kbd.next();
                    cariAccount = Helpbank.findaccount(nama);
                    if (cariAccount != null){
                        System.out.println("Silahkan Masukan Jumlah");
                        double withdraw = kbd.nextDouble();
                        cariAccount.deposit(withdraw);
                        System.out.println("Deposit Berhasil");
                    }
                    System.out.println("Data Not Found");
                    break;
                case 5:
                    System.out.println("Total Tabungan Nasabah \n");
                    System.out.println(Helpbank.calTotal());
                    break;
                case 6:
                    System.out.println("Total Tabungan Nasabah \n");
                    System.out.println(Helpbank.getall());
                    break;
                case 7:
                    System.out.println("Say Good Bye");
                    break;
            }
        }while (pilihan!=7);


    }
        public static void menu(){
            System.out.println("1 Add Account");
            System.out.println("2 Search Account");
            System.out.println("3 Deposit");
            System.out.println("4 Withdraw");
            System.out.println("5 Display");
            System.out.println("6 Display All Account");
            System.out.println("7 Say Good Bye");
        }
    }
