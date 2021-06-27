public class ZooObserver {
    String name;

    public ZooObserver(String name){
        this.name = name;
    }

    public void update(String actualInfo){
    }
}

class FeedAnimal extends ZooObserver {

    public FeedAnimal(String name){
        super(name);
    }

    public static void update(ZooObserver observer) {
        System.out.println("[" + observer.name + "]" + " The animals are being fed");
    }
}

class WatchAnimal extends ZooObserver {
    public WatchAnimal(String name){
        super(name);
    }

    public static void update(ZooObserver observer) {
        System.out.println("[" + observer.name + "]" + " The animals are being watched");
    }
}

class AddAnimal extends ZooObserver {
    public AddAnimal(String name){
        super(name);
    }
    public static void update(ZooObserver observer, String animalName) {
        System.out.println("[" + observer.name + "] " + animalName + " has been added to the zoo!");
    }
}

