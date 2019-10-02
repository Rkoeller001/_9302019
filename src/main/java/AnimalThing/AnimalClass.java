package AnimalThing;

public abstract class AnimalClass {
    private String name;
    private String run;

    public AnimalClass(String name,String run){
        this.run = run;
        this.name = name;
    }
    public String AnimalName(AnimalClass[] animal){
        //This method should loop through and print out each animal's name


        return name;
    }
    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnimalClass{" +
                "name='" + name + '\'' +
                ", run=" + run +
                '}';
    }
}
