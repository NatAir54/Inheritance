package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class SalesPerson extends Employee {

    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);

        if (percent < 0) throw new IllegalArgumentException();
        this.percent = percent;
    }

    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException();

        BigDecimal val1 = new BigDecimal(2);
        BigDecimal val2 = new BigDecimal(3);
        BigDecimal val3 = new BigDecimal(1);

        if (this.percent>100) super.setBonus(bonus.multiply(val1));
        if (this.percent>200) super.setBonus(bonus.multiply(val2));
        if (this.percent<=100) super.setBonus(bonus.multiply(val3));
    }
}
