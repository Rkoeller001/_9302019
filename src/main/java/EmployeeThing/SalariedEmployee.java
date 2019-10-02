package EmployeeThing;

import java.time.LocalDate;

public abstract class SalariedEmployee extends Employee {
    public double yearlySalary;
    public LocalDate hiredate;
    public Personalty personality;

    public SalariedEmployee(String name, float hoursWorked, double yearlySalary, LocalDate hiredate, String personality) {
        super(name, hoursWorked);
        this.yearlySalary = yearlySalary;
        this.hiredate = hiredate;
        this.personality = personality;

    }
    @Override
    public double getPaymentAmount(){
        return yearlySalary;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "sex=" + sex +
                ", yearlySalary=" + yearlySalary +
                ", hiredate=" + hiredate +
                ", personality=" + personality +
                '}';
    }
}
