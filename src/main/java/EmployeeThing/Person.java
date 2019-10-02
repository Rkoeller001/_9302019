package EmployeeThing;

public abstract class Person {
    public Object calculatePay;
    private String name;
    protected char sex;
    private String pronoun;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    //abstract method signature stub
    public abstract  void printProfile();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }
}

