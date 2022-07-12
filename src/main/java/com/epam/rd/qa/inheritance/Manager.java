package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Manager extends Employee{

    private final int clientAmount;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);

        if (clientAmount<0) throw new IllegalArgumentException();
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if(bonus==null || bonus.compareTo(BigDecimal.ZERO)<= 0) throw new IllegalArgumentException();

        if(this.clientAmount < 100) super.setBonus(bonus);

        BigDecimal val = new BigDecimal(0);

        if(this.clientAmount > 100) val = new BigDecimal(500);
        if(this.clientAmount > 150) val = new BigDecimal(1000);
        super.setBonus(bonus.add(val));

    }
}
