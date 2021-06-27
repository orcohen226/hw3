public abstract class ZooObserver {
    ZooObserver observer;

    public abstract void update(String info);
    }

class FeedAnimal extends ZooObserver {
    public void update(String info) {
        System.out.println("[" + observer + "]" + " The animals are being fed");
    }
}

class WatchAnimal extends ZooObserver {
    public void update(String info) {
        System.out.println("[" + observer + "]" + " The animals are being watched");
    }
}

class AddAnimal extends ZooObserver {
    public void update(String info) {
        System.out.println("[" + observer + "]" + " has been added to the zoo");
    }
}

