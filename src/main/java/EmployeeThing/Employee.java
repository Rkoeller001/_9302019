package EmployeeThing;

public abstract class Employee extends Person implements Ipay {
    private float hoursWorked;

    public Employee(String name, float hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }


    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public String toString(){
        return "Employee name is  : " + getName();
    }
// abstract class is a concept, if someone extends class make yourself abstract
//abstract method
    public abstract void calculatePay();
    //concrete method
    public void printProfile(){
        System.out.println(hoursWorked * 50);
    }


}

