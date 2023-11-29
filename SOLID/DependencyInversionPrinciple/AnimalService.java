import java.util.List;

public class AnimalService {
    public static  void printAnimals(List<? extends Animal> animals) {
    for (Animal animal : animals) {
        System.out.println(animal.toString());
        }
    }
   
        
}
