public abstract class Animal {
    String food;
    String show;
    String name;

    public String getFood() {
        return "";
    }

    public String getShow() {
        return "";
    }

    public String getName() {
        return "";
    }
}

class Monkey extends Animal {
    static int monkeyCounter = 0;
    static String food = "The monkey is eating a banana...";
    static String show = "The monkey is hanging on trees...";
    static String name = "Monkey";

    public Monkey() {
        monkeyCounter++;
    }

    public String getFood() {
        return food;
    }

    public String getShow(){
        return show;
    }

    public String getName(){
        return name;
    }
}

class Unicorn extends Animal {
    static int unicornCounter = 0;
    static String food = "The unicorn is eating rainbow cakes...";
    static String show = "The unicorn is flying...";
    static String name = "Unicorn";

    public Unicorn(){
        unicornCounter++;
    }

    public String getFood() {
        return food;
    }

    public String getShow(){
        return show;
    }

    public String getName(){
        return name;
    }
}

class Zebra extends Animal {
    static int zebraCounter = 0;
    static String food = "The zebra is eating grass...";
    static String show = "The zebra is running...";
    static String name = "Zebra";

    public Zebra(){
        zebraCounter++;
    }

    public String getFood() {
        return food;
    }

    public String getShow(){
        return show;
    }

    public String getName(){
        return name;
    }
}
