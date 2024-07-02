public class Bank {
    private final int Size = 50;
    private Bankaccount[] account;
    private int numofaccount;

    public Bank() {
        account = new Bankaccount[Size];
        numofaccount = 0;
    }

    public Bank(int ukuran) {
        if (ukuran > 0) {
            account = new Bankaccount[ukuran];
            numofaccount = 0;
        } else {
            account = new Bankaccount[Size];
            numofaccount = 0;
        }
    }
    public boolean addAccount(Bankaccount acc){
        if (numofaccount==account.length){
            System.out.println("Account Penuh");
            return false;
        }
        account[numofaccount]=acc;
        numofaccount++;
        return true;
    }
    public Bankaccount findaccount(String nama) {
        for (int i = 0; i < numofaccount; i++)
            if (account[i].getOwner().equalsIgnoreCase(nama))
                return account[i];
        return null;
    }
    public double calTotal(){
            double sum=0;
            for (int i=0;i<numofaccount;i++)
                sum+=account[i].getBalace();
            return sum;
    }

    public String getall(){
        String msg="All account \n";
        for (int i=0;i<numofaccount;i++)
            msg+=account[i].toString()+"\n";
        return msg;
    }

}
