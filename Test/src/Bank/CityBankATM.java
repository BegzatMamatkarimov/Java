package Bank;

import java.util.Objects;
import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.print("Enter account number: ");
            String acNum = sc.next();
            sc.nextLine();
            System.out.print("Enter PIN code: ");
            String pinCode = sc.next();
            sc.nextLine();

            for(BankAccount db : Database.allAccounts){
                if((Objects.equals(db.getAccountNumber(), acNum)) && (Objects.equals(db.getPinCode(), pinCode))){
                    check = false;
                    if(db instanceof CityBankAccount){
                        boolean intoCheck = true;
                        while (intoCheck) {
                            System.out.println("\t\tOPTION:\n");
                            System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                            System.out.println("PRESS [2] TO VIEW BALANCE");
                            System.out.println("PRESS [3] TO CHANGE PIN CODE");
                            System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                            System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                            System.out.println("PRESS [6] TO EXIT");
                            int n = sc.nextInt();

                            switch (n){
                                case 1:
                                    System.out.println("Сколька хотите снять: ");
                                    int nummins = sc.nextInt();
                                    db.creditBalance(nummins);
                                    System.out.println("Вашем балансе осталось: " + db.totalBalance());
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println("Ваш баланс: " + db.totalBalance());
                                    System.out.println();
                                    break;
                                case 3:
                                    System.out.println("Введите новый пароль: ");
                                    String newPasword = sc.next();
                                    db.setPinCode(newPasword);
                                    System.out.println("Пароль успешна изменен.");
                                    System.out.println();
                                    break;
                                case 4:
                                    System.out.println("Сколька хотите добавит: ");
                                    int numplas = sc.nextInt();
                                    db.debetBalance(numplas);
                                    System.out.println("Ваше баланс: " + db.totalBalance());
                                    System.out.println();
                                    break;
                                case 5:
                                    System.out.println("Info about this accounts:");
                                    System.out.println(db.accountData());
                                    break;
                                case 6:
                                    intoCheck = false;
                                    break;
                            }
                        }
                    }
                    if(db instanceof NationalBankAccount){
                        boolean intoCheck = true;
                        while (intoCheck) {
                            System.out.println("\t\tOPTION:\n");
                            System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                            System.out.println("PRESS [2] TO VIEW BALANCE");
                            System.out.println("PRESS [3] TO EXIT");
                            int n = sc.nextInt();

                            switch (n){
                                case 1:
                                    System.out.println("Сколька хотите снять: ");
                                    int nummins = sc.nextInt();
                                    db.creditBalance(nummins);
                                    System.out.println("Камиссия 200тг");
                                    System.out.println("Вашем балансе осталось: " + db.totalBalance());
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println("Ваш баланс: " + db.totalBalance());
                                    System.out.println();
                                    break;
                                case 3:
                                    intoCheck = false;
                                    break;
                            }
                        }
                    }
                }
            }
            if(check) {
                System.out.println("ERROR. Repeed again: \n");
            }
        }

    }
}
