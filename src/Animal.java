public class Animal {
    static int totalAnimals = 0;

    Animal(){
        totalAnimals++;
    }

    public void run(int length) {
        System.out.println("Animal ran " + length + " meters!");
    }

    public void swim(int length) {
        System.out.println("Animal swam " + length + " meters!");
    }
}
