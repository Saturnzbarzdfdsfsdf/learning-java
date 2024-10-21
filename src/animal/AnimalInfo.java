package animal;

public class AnimalInfo {
    public static void main(String[] args) {

        Dog dog = new Dog("Hatiko ");
        Cat cat = new Cat("Garfild ");


        cat.catInfo();
        cat.run(400);
        cat.jump(222);
        cat.swim(3);

        dog.dogInfo();
        dog.run(400);
        dog.jump(222);
        dog.swim(3);
    }
}
