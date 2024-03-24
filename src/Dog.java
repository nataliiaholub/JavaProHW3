public class Dog extends Animal{

    static int totalDogs = 0;

    Dog(){
        super();
        totalDogs++;
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println("Dog ran " + length + " meters!");
        } else {
            System.out.println("Dog can't run that far!");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println("Dog swam " + length + " meters!");
        } else {
            System.out.println("Dog can't swim that far!");
        }
    }
}
