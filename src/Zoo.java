import java.util.ArrayList;

public class Zoo {
    int happiness = 2;
    int hungry = 3;
    ArrayList<AnimalFactory> animals;
//    private ArrayList<ZooObserver> observers;

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

//    public void addObserver(ZooObserver observer) {
//        observers.add(observer);
//    }
//
//    public void removeObserver(ZooObserver observer) {
//        observers.remove(observer);
//    }
//
//    public void notifyObserver( info) {
//        for (ZooObserver observer : observers) {
//            observer.update(info);
//        }
//    }

    public void addAnimal(){

    }


    public void feedAnimals(){
        if (this.hungry > 1) {
            this.hungry -= 1;
//            notifyObserver(new FeedAnimal);
        }
    }

    public void watchAnimals(){
        if (this.happiness < 5){
            this.happiness += 1;
            if (this.hungry < 5){
                this.hungry += 1;
            }
        }
    }

    public void showAnimalsInfo(){
        System.out.println("The zoo contains total of "+ animals.size() + " animals:");
        // we need to back to here and make the print of the animal and the size
//        for (int i = 0; i < animals.size(); i++){
//            System.out.println(animals.get(i) + "");
//        }

        System.out.println("Happiness level: " + this.happiness);
        if (this.happiness < 3){
            System.out.println("The animals are not happy, you should watch them...");
        }else{
            System.out.println("The animals are very happy, keep working hard…");
        }

        System.out.println("Hunger level: " + this.hungry);
        if (this.hungry > 3){
            System.out.println("The animals are hungry, you should feed them…");
        }
    }



}
