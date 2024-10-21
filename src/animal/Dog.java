package animal;


public class Dog extends Beast {

    public Dog(String name, boolean swim, boolean jump, boolean run) {
        super(name, swim, jump, run);
    }

    public void dogInfo() {
        System.out.println(" Dog: " + name + " Can run: " + run + " Can swim: " + swim + " Can jump: " + jump);
    }

}
