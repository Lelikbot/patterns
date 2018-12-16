package kolokolov.creational.factorymethod.calcculator;

import java.math.BigDecimal;

/**
 * Калькулятор потребительских кредитов
 */
public class PotrebCreditCalculator implements CreditCalculator {

    private static BigDecimal CREDIT_PERCENT = new BigDecimal(20);

    @Override
    public BigDecimal calculate(Integer year, BigDecimal sum) {
        System.out.println("Calculate Potreb Credit");
        return calculatePercents(year, sum);
    }

    private BigDecimal calculatePercents(Integer year, BigDecimal sum) {
        BigDecimal yearPercent = calculateOneYearPercents(sum);
        return yearPercent.multiply(new BigDecimal(year));
    }

    private BigDecimal calculateOneYearPercents(BigDecimal sum) {
        BigDecimal coef = CREDIT_PERCENT.divide(new BigDecimal(100), 2);
        return sum.multiply(coef);
    }
}
