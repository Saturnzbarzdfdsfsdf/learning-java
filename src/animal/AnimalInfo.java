package animal;

public class AnimalInfo {
    public static void main(String[] args) {

        Dog dog = new Dog("Hatiko ", true, true,true);
        Cat cat = new Cat(" Garfild ", false, true,true);

        dog.dogInfo();
        cat.catInfo();
    }
}
