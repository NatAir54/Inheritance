package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final BigDecimal salary;
    private BigDecimal bonus;

    public String getName(){ return name; }
    public BigDecimal getSalary(){ return salary; }



    public Employee(String name, BigDecimal salary) {
        if(name==null || salary==null ||  name.trim().equals("") || salary.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException();
        }
            this.name = name;
            this.salary = salary;
    }
    public void setBonus(BigDecimal bonus) {
        if (bonus==null || bonus.compareTo(BigDecimal.ZERO)<=0  || salary==null) throw new IllegalArgumentException();
        this.bonus = bonus;
    }
    public BigDecimal toPay() {

        if (name==null || bonus==null || salary==null) throw new IllegalArgumentException();
        if (bonus.compareTo(BigDecimal.ZERO) <= 0 || salary.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException();

        return salary.add(bonus);
   }
}
