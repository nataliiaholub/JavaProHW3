public class Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog();
        Cat catWhiskas = new Cat();

        dogBobik.run(350);
        dogBobik.swim(10);
        catWhiskas.run(250);
        catWhiskas.swim(5);

        System.out.println("Total animals: " + Animal.totalAnimals);
        System.out.println("Total dogs: " + Dog.totalDogs);
        System.out.println("Total cats: " + Cat.totalCats);
    }
}