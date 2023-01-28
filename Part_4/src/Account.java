public class Account {
    double balance;
    String name;
    Account(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public double withdraw(float amt){
        this.balance-=amt;
        return balance;
    }
    public double deposit(float amt){
        this.balance+=amt;
        return balance;
    }
    public void balance(){
        System.out.println(this.balance);
    }
}
