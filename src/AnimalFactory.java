public abstract class AnimalFactory {
    public abstract Animal createAnimal();
}

class MonkeyFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Monkey();
    }
}

class ZebraFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Zebra();
    }
}

class UnicornFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Unicorn();
    }
}


