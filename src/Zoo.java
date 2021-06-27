import java.util.ArrayList;

public class Zoo {
    int happiness = 2;
    int hungry = 3;
    ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<ZooObserver> observers = new ArrayList<>();

    private static Zoo instance = null;
    private Zoo() { }
    public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
            System.out.println("Creating zoo...");
            return instance;
        }
        System.out.println("The zoo already exists...");
        return null;
    }

    public void addObserver(ZooObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ZooObserver observer) {
        observers.remove(observer);
    }

    public void addAnimal(Animal newAnimal){
        animals.add(newAnimal);

        /** Update the observers block*/
        System.out.println("Notifying observers:");
        for (ZooObserver observer : observers){
            AddAnimal.update(observer, newAnimal.getName());
        }
    }

    public void feedAnimals(){
        /** Change the animals state block*/
        if (this.hungry > 1) {
            this.hungry -= 1;

        }
        /** print the eating process block*/
        for (Animal animal : animals){
            System.out.println(animal.getFood());
        }

        /** Update the observers block*/
        System.out.println("Notifying observers:");
        for (ZooObserver observer : observers){
            FeedAnimal.update(observer);
        }
    }

    public void watchAnimals(){
        /** Change the animals state block*/
        if (this.happiness < 5) {
            this.happiness += 1;
        }
        if (this.hungry < 5) {
            this.hungry += 1;
        }

        /** print the show process block*/
        for (Animal animal : animals){
            System.out.println(animal.getShow());
        }

        /** Update the observers block*/
        System.out.println("Notifying observers:");
        for (ZooObserver observer : observers) {
            WatchAnimal.update(observer);
        }
    }

    public void showAnimalsInfo(){
        System.out.println("The zoo contains total of "+ animals.size() + " animals:");

        System.out.println("- Zebra: " + Zebra.zebraCounter);
        System.out.println("- Unicorn: " + Unicorn.unicornCounter);
        System.out.println("- Monkey: " + Monkey.monkeyCounter);

        System.out.println("Happiness level: " + this.happiness);
        if (this.happiness < 3){
            System.out.println("The animals are not happy, you should watch them...");
        }else{
            System.out.println("The animals are very happy, keep working hard...");
        }

        System.out.println("Hunger level: " + this.hungry);
        if (this.hungry > 3){
            System.out.println("The animals are hungry, you should feed them...");
        }
    }

}
