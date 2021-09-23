public class Main {

    public static void main(String[] args) {
        int currentAccount = 100;
        int transferAmount = 1100;
        int bonus = transferAmount / 100;

        int totalAccount;
        System.out.println("На Вашем счете:");
        if (transferAmount > 1000) {

            totalAccount = currentAccount + transferAmount + bonus;

            System.out.println(totalAccount);
            System.out.println("Начислено бонусов:");
            System.out.println(bonus);
        } else {
            totalAccount = currentAccount + transferAmount;

            System.out.println(totalAccount);
            System.out.println("Начислено бонусов: 0");
        }
    }
}
