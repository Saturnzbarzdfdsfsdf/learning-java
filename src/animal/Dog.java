package animal;


public class Dog extends Beast {

    public Dog(String name) {
        super(name, 600, 5, 10);
    }

    public boolean swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Песик " + name + " сможет это проплыть.");
            return true; // Возвращаем true, если котик сможет пробежать
        } else {
            System.out.println("Песик " + name + " слишком слаб для такой дистанции.");
            return false; // Возвращаем false, если котик не сможет пробежать
        }
    }


    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Песик " + name + " сможет это пробежать.");
            return true; // Возвращаем true, если котик сможет пробежать
        } else {
            System.out.println("Песик " + name + " слишком слаб для такой дистанции.");
            return false; // Возвращаем false, если котик не сможет пробежать
        }
    }

    public boolean jump(int distance) {
        if (distance <= maxJumpHeight) {
            System.out.println("Песик " + name + " сможет прыгнуть на такую высоту.");
            return true; // Возвращаем true, если котик сможет прыгнуть
        } else {
            System.out.println("Это слишком высоко для песика: " + name);
            return false; // Возвращаем false, если котик не сможет прыгнуть
        }
    }

    public void dogInfo() {
        System.out.println(" Beast: " + name + " Max run: " + maxRunDistance + " Max swim: " + maxSwimDistance + " Max jump: " + maxJumpHeight);
    }

}
