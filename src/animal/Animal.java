package animal;

//run, swim, jump
public abstract class Animal {

    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Animal: " + name);
    }
}

