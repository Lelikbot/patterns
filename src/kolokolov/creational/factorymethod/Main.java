package kolokolov.creational.factorymethod;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        BigDecimal credit = manager.getCredit(10, new BigDecimal(100_000));
        System.out.println("Total sum: " + credit);


        BigDecimal credit1 = manager.getCredit(11, new BigDecimal(100_000));
        System.out.println("Total sum: " + credit1);
    }
}
