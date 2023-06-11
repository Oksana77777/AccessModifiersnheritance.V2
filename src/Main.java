import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;


public class Main {
    public static void main(String[] args) {
        System.out.println("Проверяем SavingsAccount");
        Account savingsAccount = new SavingsAccount("Savings", 100, 50);
        System.out.println("1) " + Boolean.FALSE.equals(savingsAccount.pay(60)));
        System.out.println("2) " + Boolean.TRUE.equals(savingsAccount.pay(50)));
        System.out.println("3) " + Boolean.TRUE.equals(savingsAccount.add(Integer.MAX_VALUE)));
        System.out.println("4) " + Boolean.FALSE.equals(savingsAccount.add(-100)));
        System.out.println("5) " + Boolean.FALSE.equals(savingsAccount.pay(-100)));

        System.out.println("Проверяем CheckingAccount");
        Account checkingAccount = new CheckingAccount("Checking", 100);
        System.out.println("6) " + Boolean.FALSE.equals(checkingAccount.pay(110)));
        System.out.println("7) " + Boolean.TRUE.equals(checkingAccount.pay(100)));
        System.out.println("8) " + Boolean.TRUE.equals(checkingAccount.add(Integer.MAX_VALUE)));
        System.out.println("9) " + Boolean.FALSE.equals(checkingAccount.add(-100)));
        System.out.println("10) " + Boolean.FALSE.equals(checkingAccount.pay(-100)));

        System.out.println("Проверяем CreditAccount");
        Account creditAccount = new CreditAccount("Credit", -100);
        System.out.println("11) " + Boolean.FALSE.equals(creditAccount.add(110)));
        System.out.println("12) " + Boolean.TRUE.equals(creditAccount.add(100)));
        System.out.println("13) " + Boolean.TRUE.equals(creditAccount.pay(Integer.MAX_VALUE)));
        System.out.println("14) " + Boolean.FALSE.equals(creditAccount.pay(-100)));
        System.out.println("15) " + Boolean.FALSE.equals(creditAccount.add(-100)));

        System.out.println("Если в консоли выводиться хотя бы в одном месте – false, значит функциональность реализована неверно.");
        System.out.println("Разберитесь, какой метод выводит false, и попытайтесь понять, почему он работает некорректно.");
    }
}
