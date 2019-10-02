package AnimalThing;

public class AnimalTest {


    public static void main(String[] args) {
        AnimalClass animal = new AnimalClass("fido","start moving");
        System.out.println(animal);
        AnimalClass animal2 = new AnimalClass("spark","start moving");
        System.out.println(animal2);

        AnimalClass[] animalClasses={animal,animal2};
    }

    public static AnimalClass[] getAnimalName(AnimalClass[] animal){
        for (AnimalClass animals : animal ) {

        }
        return animal;
    }
}
