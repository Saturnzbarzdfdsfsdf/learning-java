package animal;


public class Beast extends Animal {

    public Beast(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void beastInfo() {
        System.out.println("Beast: " + name + "Max run: " + maxRunDistance + " Max swim: " + maxSwimDistance + "Max jump: " + maxJumpHeight);
    }

}
