package kolokolov.creational.factorymethod.calcculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Калькулятор иппотечных кредитов
 */
public class MortgageCreditCalculator implements CreditCalculator {

    private static BigDecimal CREDIT_PERCENT = new BigDecimal(8.78).setScale(2, RoundingMode.HALF_UP);

    @Override
    public BigDecimal calculate(Integer year, BigDecimal sum) {
        System.out.println("Calculate Mortgage Credit");
        return sum.add(calculatePercents(year, sum));
    }

    private BigDecimal calculatePercents(Integer year, BigDecimal sum) {
        BigDecimal yearPercent = calculateOneYearPercents(sum);
        System.out.println("Percents per year:" + yearPercent);
        return yearPercent.multiply(new BigDecimal(year));
    }

    private BigDecimal calculateOneYearPercents(BigDecimal sum) {
        BigDecimal coef = CREDIT_PERCENT.divide(new BigDecimal(100), BigDecimal.ROUND_HALF_UP);
        System.out.println("Yearly coef: " + coef);
        return sum.multiply(coef);
    }
}
