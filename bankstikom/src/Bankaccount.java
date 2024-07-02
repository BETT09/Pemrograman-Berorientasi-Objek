public class Bankaccount {
    String Owner;
    double Balace;

    public Bankaccount(String owner) {
        Owner = owner;
    }

    public String getOwner() {
        return Owner;
    }

    public Double getBalace() {
        return Balace;
    }
    public boolean deposit(double amount){
        if (amount>0){
            Balace+=amount;
            return true;
        }else
            return false;
    }
    public boolean withdraw(double amount){
        if (amount>0 && amount<Balace){
            Balace-=amount;
            return true;
        }else
            return false;
    }
public String toString(){
        return "Owner " +Owner+" Balance "+Balace;
}



}
