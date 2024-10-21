package animal;

public class Cat extends Beast {
    public Cat(String name, boolean swim, boolean jump, boolean run) {
        super(name, swim, jump, run);
    }

    public void catInfo() {
        System.out.println(" Dog: " + name + " Can run: " + run + " Can swim: " + swim + " Can jump: " + jump);
    }

}