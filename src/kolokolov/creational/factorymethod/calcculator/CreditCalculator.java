package kolokolov.creational.factorymethod.calcculator;

import java.math.BigDecimal;

/**
 * Единый интерфейс для всех калькуляторов
 */
public interface CreditCalculator {

    /**
     * Считаем столько отдавать денег, если взять определенную сумму на определенный период
     *
     * @param year колличество лет, на которые берется кредит
     * @param sum  сумма, которая берется в кредит
     * @return сумму к выплате (включая проценты)
     */
    BigDecimal calculate(Integer year, BigDecimal sum);
}
