package Bank;

public class NationalBankAccount implements BankAccount{
    String fullName;

    int balance;

    String accountNumber;

    String pinCode;

    public NationalBankAccount(String fullName, String accountNumber, String pinCode, int balance) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public void setaccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance = balance - credit - 200;
    }

    @Override
    public void debetBalance(int debet) {
    }

    @Override
    public String accountData() {
        return null;
    }
}
