package Bank;

public class CityBankAccount implements BankAccount{
    String name;

    String surname;

    int balance;

    String accountNumber;

    String pinCode;

    public CityBankAccount(String name, String surname, String accountNumber, String pinCode, int balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }


    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String newCode) {
        pinCode = newCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
            }

    @Override
    public void debetBalance(int debet) {
        balance += debet;
    }

    @Override
    public String accountData() {
        return "Full name: " + name + " " + surname + ", Account Number: " + accountNumber + ", Pin Code: " + pinCode + ", Balance:" + balance;
    }
}
