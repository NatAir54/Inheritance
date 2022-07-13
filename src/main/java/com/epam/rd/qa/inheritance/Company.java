package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;



public class Company {

    private final Employee[] employees;

    public Company(Employee[] employees) {
        if(employees == null || employees.length==0) throw new IllegalArgumentException();
        else this.employees=employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {

    if (companyBonus==null  || companyBonus.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException();

            for (int i = 0; i <employees.length; i++) {
            employees[i].setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay() {

        BigDecimal myTotal =  new BigDecimal(0);
        for (int i = 0; i < employees.length; i++) {
            myTotal = myTotal.add(employees[i].toPay());
        }
        return myTotal;
    }

    public String nameMaxSalary() {

    if(employees == null || employees.length==0) throw new IllegalArgumentException();

        BigDecimal maxSalary =  new BigDecimal(0);
        String myName = "Alex";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].toPay().compareTo(maxSalary) > 0) {
                maxSalary = employees[i].toPay();
                myName = employees[i].getName();
            }
        }
        return myName;
    }
}
