package EmployeeThing;

public class Personalty {
    public String thinkType;
    public String favColor;

    public Personalty(String thinkType, String favColor) {
        this.thinkType = thinkType;
        this.favColor = favColor;
    }

    @Override
    public String toString() {
        return "Personality{" +
                "thinkType='" + thinkType + '\'' +
                ", favColor='" + favColor + '\'' +
                '}';
    }
}

