package animal;

//run, swim, jump
public abstract class Animal {

    protected  String name;
    protected  boolean run;
    protected  boolean jump;
    protected  boolean swim;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void  animalInfo() {
        System.out.println("Animal: " + name);
    }
}


