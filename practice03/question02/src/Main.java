public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount BA1 = new BankAccount();

        BA1.setNumAccount(10111001);
        BA1.setAccountBalance(700);

        System.out.printf("Número da conta: %d\nSaldo da conta: R$ %.2f", BA1.getNumAccount(), BA1.getAccountBalance());
    }
}
