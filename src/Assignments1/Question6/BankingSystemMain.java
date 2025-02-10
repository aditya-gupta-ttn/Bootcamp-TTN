package Assignments1.Question6;

public class BankingSystemMain {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        System.out.println(sbi.toString());
        System.out.println();
        System.out.println(boi.toString());
        System.out.println();
        System.out.println(icici.toString());
    }
}

