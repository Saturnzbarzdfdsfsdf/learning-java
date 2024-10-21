package animal;


public class Beast extends Animal {

    public Beast(String name, boolean swim, boolean jump, boolean run) {
        this.name = name;
        this.swim = swim;
        this.jump = jump;
        this.run = run;

    }

    public void beastInfo() {
        System.out.println("Beast: " + name + "Can run: " + run + " Can swim: " + swim + "Can jump: " + jump);
    }

}
