package AnimalThing;

public  class Dog extends Canine {
    public Dog(String speak, int run) {
        super(speak, "start moving");
    }

    @Override
    public void makeNoise() {
        System.out.println("bark bark bark");
    }
}
