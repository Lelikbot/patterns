package kolokolov.creational.factorymethod.manager;

import kolokolov.creational.factorymethod.calcculator.CreditCalculator;
import kolokolov.creational.factorymethod.calcculator.MortgageCreditCalculator;

public class IpotecaCreditCalculatorManager implements CalculatorManager {
    @Override
    public CreditCalculator getCreditCalculator() {
        return new MortgageCreditCalculator();
    }
}
