public class Cat extends Animal{

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println("Cat ran " + length + " meters!");
        } else {
            System.out.println("Cat can't run that far!");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Cat can't swim!");
    }
}
