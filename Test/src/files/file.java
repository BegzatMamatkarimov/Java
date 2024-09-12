package files;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\tДобро пожаловать");

        while (true) {
            System.out.println("Выберите пунк ниже:\n[0] - Войти систему\n[1] - Авторизоваться\n");
            int n = sc.nextInt();
            switch (n) {
                case 0 -> {
                    int count = 3;
                    while (true) {
                        String userLog;
                        int userPin;
                        try {
                            System.out.println("Остаток попыток: " + count);
                            System.out.print("Логин: ");
                            userLog = sc.next();
                            System.out.print("pin: ");
                            userPin = sc.nextInt();

                            System.out.println("\nСекундочку . . .\n");
                            Thread.sleep(2000);
                            FileRead fileRead = new FileRead();
                            if (fileRead.hasData()) {
                                if (fileRead.chakc(userLog, userPin)) {
                                    System.out.println("Добро пожаловать уважаемый " + fileRead.name + " " + fileRead.lname);
                                    System.out.println("Приятно видеть вас еще раз в нашем платформе😊");
                                    System.exit(0);
                                }
                            } else {
                                System.out.println("Ваши данные нету в базе, пожалуйста авторизуйтес на нашу базу\n");
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\n**Pin код дольжен состоит только из чисел**\n");
                            sc.nextLine();
                            if (count > 1) {
                                count--;
                            } else if (count == 1) {
                                System.out.println("Ваши данные нету в базе, пожалуйста авторизуйтес на нашу базу\n");
                                break;
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (NullPointerException e) {
                            System.out.println("Логин или пин код неправильно написано, повторите попытку\n");
                            if (count > 1) {
                                count--;
                            } else if (count == 1) {
                                System.out.println("Вероятно ваши данные нету в базе, пожалуйста авторизуйтес на нашу базу\n");
                                break;
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

                case 1 -> {
                    while (true) {
                        System.out.print("Имя: ");
                        String username = sc.next();
                        System.out.print("Фомилия: ");
                        String userfname = sc.next();
                        System.out.print("Придумайте логин: ");
                        String userLog = sc.next();
                        System.out.print("Придумайте pin код: ");
                        int userPin = sc.nextInt();

                        try {
                            FileWrite fileWrite = new FileWrite();
                            fileWrite.writeData(userLog, userPin, username, userfname);

                            System.out.println("\nВы успешно авторизовались на базу👍\nПопробуйте войти.");
                            break;
                        } catch (IOException e) {
                            System.out.println("Что-то пошло не так повторите регистрацию");
                        }
                    }
                }
            }
        }
    }
}