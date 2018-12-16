package kolokolov.creational.factorymethod.manager;

import kolokolov.creational.factorymethod.calcculator.CreditCalculator;
import kolokolov.creational.factorymethod.calcculator.PotrebCreditCalculator;

public class PotrebCreditCalculatorManager implements CalculatorManager {
    @Override
    public CreditCalculator getCreditCalculator() {
        return new PotrebCreditCalculator();
    }
}
