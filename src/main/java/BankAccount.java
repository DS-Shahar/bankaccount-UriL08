class BankAccount {
    private int balance = 0;
    private int minBalance = -5000;
    private String name = " ";

    @Override

    public String toString() {
        return name + "'s balance: " + balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getMinBalance() {
        return minBalance;
      }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(int balance, int minBalance, String name) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.name = name;
    }

    public String withdraw(int amount) {
        if (this.balance - amount < minBalance) {
            return "You cannot withdraw that amount";
        }
        balance = balance - amount;
        return "You withdrew " + amount + ". You have " + balance + " left in your account.";
    }

    public String deposit(int amount) {
        balance = balance + amount;
        return "You now have" + balance + " in your account.";
    }

    public String transfer(BankAccount otherAccount, int amount) {
        if (this.balance - amount < minBalance) {
          return "Transfer denied. There isn't enough funds in the account balance.";
        }
        this.balance -= amount;
        otherAccount.balance += amount;
        return "You have transferred " + amount + " to the other account. Your current balance is " + this.balance + ".";
      }



}
