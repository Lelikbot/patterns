package kolokolov.creational.factorymethod;

import kolokolov.creational.factorymethod.calcculator.CreditCalculator;
import kolokolov.creational.factorymethod.manager.CalculatorManager;
import kolokolov.creational.factorymethod.manager.IpotecaCreditCalculatorManager;
import kolokolov.creational.factorymethod.manager.PotrebCreditCalculatorManager;

import java.math.BigDecimal;

public class Manager {

    private CalculatorManager manager;

    public CalculatorManager getManager() {
        return manager;
    }

    BigDecimal getCredit(Integer year, BigDecimal sum) {
        if (year >= 5) {
            manager = new IpotecaCreditCalculatorManager();
        } else {
            manager = new PotrebCreditCalculatorManager();
        }
        CreditCalculator calculator = manager.getCreditCalculator();
        return calculator.calculate(year, sum);
    }
}
