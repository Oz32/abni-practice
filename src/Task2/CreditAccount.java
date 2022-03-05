package Task2;

public class CreditAccount extends Account {
    public CreditAccount(int balance, String accountName) {
        super(balance, accountName);
    }

    public static final int credLim = 300000;

    @Override
    public boolean transfer(Account account, int amount) {
        if (credLim < amount) {
            System.out.println("Недостаточно средств для совершения перевода");
            return false;
        }

        balance -= amount;
        account.balance += amount;
        System.out.println("Совершен перевод с: " + accountName + " на " + account + " - " + amount + ". Сумма кредитного баланса " + balance);
        return true;
    }

    @Override
    public boolean addMoney(int money) {
        if (money >= Math.abs(getBalance())) {
            balance = money - Math.abs(balance);
            System.out.println("Внесена оплата в размере " + money + ". Кредит погашен! Сумма кредитного счета составляет " + balance);
            return true;
        } else {
            balance += money;
            System.out.println("Пополнение на сумму в " + money + " успешно проведено! Сумма кредитного счета составляет" + balance);
            return false;
        }
    }

    @Override
    public boolean pay(int amount) {
        if (amount < credLim) {
            balance -= amount;
            System.out.println("Оплата в " + amount + " Успешно проведена! Сумма кредитного счета составляет" + balance);
        }
        return true;
    }
}