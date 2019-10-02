package EmployeeThing;

import java.time.LocalDate;
import java.util.stream.LongStream;

public class EmployeeTest  {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("bob",30.0f,30000.00,LocalDate.of(1995,2,3),"sad") {
            @Override
            public void calculatePay() {
                System.out.println(salariedEmployee.getPaymentAmount());
            }
            Vendor vendor = new Vendor(30,2.00);
        };
        //person2 is a refrence variable
//        Person person = new Person("steven");
//        SalariedEmployee salariedEmployee = new SalariedEmployee("mike", 25.0f, 30.00, LocalDate.of(1995,2,15), new Personalty("leftbrain", "red"));
//        System.out.println(salariedEmployee);
//we dd up-casting
//        Person person2 = new Entrepreneur("dan",3000,20000,);
//        System.out.println(person2);

//        person2 = new Employee("dan",30.0f);
//        System.out.println(person2);
//        ((Employee)person2).calculatePay();

//        System.out.println(true);

    }

    public static void getPersonName(Person person){
        if (person instanceof Employee){
            System.out.println(person.getName() + "has a boss");
        }else if (person instanceof Entrepreneur){
            System.out.println(person.getName() + "is living their bets life");
        }else {
            System.out.println("you are a person with no job");
        }
    }
}
