package EmployeeThing;

public abstract class Entrepreneur extends Person {
    private double investment;
    private double revenue;


    public Entrepreneur(String name, double investment, double revenue ) {
        super(name);
        this.investment = investment;
        this.revenue = revenue;
    }

    @Override
    public String toString(){
        return "Entrepreneur's name is : " + this.getName();
    }

    public double calculateProfit(){
        return revenue - investment;
    }
}
