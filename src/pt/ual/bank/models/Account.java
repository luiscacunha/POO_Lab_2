package pt.ual.bank.models;

public class Account {
    private double balance;
    private String clientId;
    private String accountId;
    private boolean bankoverdraft;
    

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setBankoverdraft(boolean bankoverdraft) {
        this.bankoverdraft = bankoverdraft;
    }

    public String getAccountId() {
        return accountId;
    }
}
