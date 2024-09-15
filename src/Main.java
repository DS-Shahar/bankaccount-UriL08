public class Main {
    public static void main(String[] args) {

        BankAccount acct1 = new BankAccount(1000, -1000, "Bob");
        BankAccount acct2 = new BankAccount(1000, -1000, "Lisa");
        System.out.println("Bob's balance: " + acct1.getBalance());
        System.out.println("Lisa's balance: " + acct2.getBalance());
        System.out.println(acct1.transfer(acct2, 500));
        System.out.println("Bob's balance after transfering: " + acct1.getBalance());
        System.out.println("Lisa's balance after the transfer: " + acct2.getBalance());
        System.out.println(acct1.transfer(acct2, 1600));
    }   
}


