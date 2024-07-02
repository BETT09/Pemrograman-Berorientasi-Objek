//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PhoneCard hpsaya=new PhoneCard();
        PhoneCard hpandod= new PhoneCard("00821845468",  20000);
        PhoneCard hpopi= new PhoneCard("00821845468",  2500);
        PhoneCard hpyudik= new PhoneCard("00821845468",  20000);
        PhoneCard hpresti= new PhoneCard("00821845468",  20000);
        PhoneCard hpjawa= new PhoneCard("00821845468",  20000);
        System.out.println(hpandod);
        hpsaya.setPhonenumber("0896755521");
        hpsaya.setBalance(25000);
        hpandod.setBalance(30000);
        System.out.println(hpandod);
        System.out.println(hpsaya);
    }

}