package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount(100_000, "card owner's name");
        Account acc2 = new CreditAccount(-100_000, "card owner's name");
        Account acc3 = new CheckingAccount(100_000, "card owner's name");
        Users user1 = new Users("Mike", "Hello123");

        Scanner scan = new Scanner(System.in);
        System.out.println("***Добро пожаловать в Runtime Bank***" +
                "\nВведите имя пользователя:");

        while (true) {
            String username = scan.nextLine();
            if (username.equals(user1.getName())) {
                System.out.println("Добро пожаловать " + user1.getName());
                break;
            } else {
                System.out.println("Пользователь не найден, попробуйте еще раз");
                continue;
            }
        }
        System.out.println("Введите пароль, у вас есть 3 попытки");

        for (int x = 1; x < 2; x++) {
            for (int y = 2; y >= 0; y--) {
                String pass = scan.nextLine();
                if (pass.equals(user1.getPass())) {
                    System.out.println("Пароль верный");
                    break;
                } else {
                    System.out.println("Пароль неверный. Количество оставшихся попыток: " + y);
                    if (y == 0) {
                        System.out.println("Вы превысили количество допустимых попыток, терминал закрывается, хорошего дня!");
                        return;
                    }
                }
            }
        }

        while (true) {
            System.out.println("***Главное меню***" +
                    "\nНажмите 1 для операций со сберегательным счетом " +
                    "\nНажмите 2 для операций с кредитным счетом " +
                    "\nНажмите 3 для операций с расчетным счетом ");
            int o = scan.nextInt();

            if (o == 3) {
                System.out.println("Пожалуйста выберите операцию:" +
                        "\nНажмите 0 чтобы узнать баланс текущего счета" +
                        "\nНажмите 1 для проведения оплаты" +
                        "\nНажмите 2 для перевода средств" +
                        "\nНажмите 3 для пополнения счета");
                {
                    int j = scan.nextInt();
                    if (j == 1) {
                        System.out.println("Пожалуйста ведите сумму для проведения оплаты");
                        int a = scan.nextInt();
                        acc3.pay(a);
                        System.out.println("Ваш текущий баланс составляет " + acc3.balance);
                        System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                        int n = scan.nextInt();
                        if (n == 1) continue;
                        else if (n == 0) {
                            System.out.println("Работа с банком заврешена, до свидания!");
                            return;
                        }
                    } else if (j == 2) {
                        System.out.println("Выберите счет для перевода: " +
                                "\nнажмите 1 для перевода на сберегательный счет;" +
                                "\nнажмите 2 для перевода на кредитный счет");
                        int h = scan.nextInt();
                        if (h == 1) {
                            System.out.println("Пожалуйста введите сумму для перевода");
                            acc3.transfer(acc1, scan.nextInt());
                            System.out.println("Ваш текущий баланс составляет " + acc3.balance);
                            System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                            int n = scan.nextInt();
                            if (n == 1) continue;
                            else if (n == 0) {
                                System.out.println("Работа с банком заврешена, до свидания!");
                                return;
                            }
                        } else if (h == 2) {
                            System.out.println("Пожалуйста введите сумму для перевода");
                            acc3.transfer(acc2, scan.nextInt());
                            System.out.println("Ваш текущий баланс составляет " + acc3.balance);
                            System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                            int n = scan.nextInt();
                            if (n == 1) continue;
                            else if (n == 0) {
                                System.out.println("Работа с банком заврешена, до свидания!");
                                return;
                            }
                        }
                    } else if (j == 3) {
                        System.out.println("Введите сумму для пополнения текущего счета: ");
                        acc3.addMoney(scan.nextInt());
                        System.out.println("Ваш текущий баланс составляет " + acc3.balance);
                        System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                        int n = scan.nextInt();
                        if (n == 1) continue;
                        else if (n == 0) {
                            System.out.println("Работа с банком заврешена, до свидания!");
                            return;
                        }
                    } else if (j == 0) {
                        System.out.println("Остаток текущего счета составляет " + acc3.balance);
                        System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                        int n = scan.nextInt();
                        if (n == 1) continue;
                        else if (n == 0) {
                            System.out.println("Работа с банком заврешена, до свидания!");
                            return;
                        }
                    }
                }

            } else if (o == 2) {
                System.out.println("Пожалуйста выберите операцию:" +
                        "\nНажмите 0 чтобы узнать баланс текущего счета" +
                        "\nНажмите 1 для проведения оплаты" +
                        "\nНажмите 2 для перевода средств" +
                        "\nНажмите 3 для пополнения счета");
                {
                    int j = scan.nextInt();
                    if (j == 1) {
                        System.out.println("Пожалуйста ведите сумму для проведения оплаты");
                        int a = scan.nextInt();
                        acc2.pay(a);
                        System.out.println("Ваш текущий баланс составляет " + acc2.balance);
                        System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                        int n = scan.nextInt();
                        if (n == 1) continue;
                        else if (n == 0) {
                            System.out.println("Работа с банком заврешена, до свидания!");
                            return;
                        }
                    } else if (j == 2) {
                        System.out.println("Выберите счет для перевода: " +
                                "\nнажмите 1 для перевода на сберегательный счет;" +
                                "\nнажмите 3 для перевода на расчетный счет");
                        int h = scan.nextInt();
                        if (h == 1) {
                            System.out.println("Пожалуйста введите сумму для перевода");
                            acc2.transfer(acc1, scan.nextInt());
                            System.out.println("Ваш текущий баланс составляет " + acc2.balance);
                            System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                            int n = scan.nextInt();
                            if (n == 1) continue;
                            else if (n == 0) {
                                System.out.println("Работа с банком заврешена, до свидания!");
                                return;
                            }
                        } else if (h == 3) {
                            System.out.println("Пожалуйста введите сумму для перевода");
                            acc2.transfer(acc3, scan.nextInt());
                            System.out.println("Ваш текущий баланс составляет " + acc2.balance);
                            System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                            int n = scan.nextInt();
                            if (n == 1) continue;
                            else if (n == 0) {
                                System.out.println("Работа с банком заврешена, до свидания!");
                                return;
                            }
                        }
                    } else if (j == 3) {
                        System.out.println("Введите сумму для пополнения текущего счета: ");
                        acc2.addMoney(scan.nextInt());
                        System.out.println("Ваш текущий баланс составляет " + acc2.balance);
                        System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                        int n = scan.nextInt();
                        if (n == 1) continue;
                        else if (n == 0) {
                            System.out.println("Работа с банком заврешена, до свидания!");
                            return;
                        }
                    } else if (j == 0) {
                        System.out.println("Остаток текущего счета составляет " + acc2.balance);
                        System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                        int n = scan.nextInt();
                        if (n == 1) continue;
                        else if (n == 0) {
                            System.out.println("Работа с банком заврешена, до свидания!");
                            return;
                        }
                    }
                }

            } else if (o == 1) {
                System.out.println("Пожалуйста выберите операцию:" +
                        "\nНажмите 0 чтобы узнать баланс текущего счета" +
                        "\nНажмите 2 для перевода средств" +
                        "\nНажмите 3 для пополнения счета");
                {
                    int j = scan.nextInt();
                    if (j == 2) {
                        System.out.println("Выберите счет для перевода: " +
                                "\nнажмите 2 для перевода на кредитный счет;" +
                                "\nнажмите 3 для перевода на расчетный счет");
                        int h = scan.nextInt();
                        if (h == 2) {
                            System.out.println("Пожалуйста введите сумму для перевода");
                            acc1.transfer(acc2, scan.nextInt());
                            System.out.println("Ваш текущий баланс составляет " + acc1.balance);
                            System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                            int n = scan.nextInt();
                            if (n == 1) continue;
                            else if (n == 0) {
                                System.out.println("Работа с банком заврешена, до свидания!");
                                return;
                            }
                        } else if (h == 3) {
                            System.out.println("Пожалуйста введите сумму для перевода");
                            acc1.transfer(acc3, scan.nextInt());
                            System.out.println("Ваш текущий баланс составляет " + acc1.balance);
                            System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                            int n = scan.nextInt();
                            if (n == 1) continue;
                            else if (n == 0) {
                                System.out.println("Работа с банком заврешена, до свидания!");
                                return;
                            }
                        }
                    } else if (j == 3) {
                        System.out.println("Введите сумму для пополнения текущего счета: ");
                        acc1.addMoney(scan.nextInt());
                        System.out.println("Ваш текущий баланс составляет " + acc1.balance);
                        System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                        int n = scan.nextInt();
                        if (n == 1) continue;
                        else if (n == 0) {
                            System.out.println("Работа с банком заврешена, до свидания!");
                            return;
                        }
                    } else if (j == 0) {
                        System.out.println("Остаток текущего счета составляет " + acc1.balance);
                        System.out.println("Нажмите 1 для возврата в основное меню либо 0 для выхода");
                        int n = scan.nextInt();
                        if (n == 1) continue;
                        else if (n == 0) {
                            System.out.println("Работа с банком заврешена, до свидания!");
                            return;
                        }
                    }
                }
            }
        }
    }
}