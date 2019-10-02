package AnimalThing;

public  class Cat extends Feline  {
    public Cat(String speak, int run) {
        super(speak, "start moving");
    }
    @Override
    public void makeNoise(){
        System.out.println("meow");
    }
}
