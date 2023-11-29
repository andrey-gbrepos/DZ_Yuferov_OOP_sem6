import java.util.List;

public class Main {
    public static void main(String[] args) {
         
        AnimalService animalService = new AnimalService();
        List<Animal> animalList = List.of(new Dog(), new Bird(), new Fish());
        List<Dog> dogList = List.of(new Dog(), new Dog());
        List<Bird> birdList = List.of(new Bird(), new Bird());

// Допустимые вызовы метода printAnimals
        AnimalService.printAnimals(animalList);
        AnimalService.printAnimals(dogList);
        dogList.get(0).animalMove();
        AnimalService.printAnimals(birdList);
        birdList.get(0).animalMove();
    }
}
