package AnimalThing;

public abstract class Feline extends AnimalClass {
    public Feline(String name, String run) {
        super(name, run);
    }

    public abstract void makeNoise();
}
