public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal","hUGE", 400);
        doAnimalStuff(animal,"slow");
       Dog dog = new Dog("dog animal","Small", 100,"large","bend");
        doAnimalStuff(dog,"speed");

    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("---------------");
    }
}
