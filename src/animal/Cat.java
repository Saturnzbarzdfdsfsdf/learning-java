package animal;

public class Cat extends Beast {
    public Cat(String name) {
        super(name, 200, 2, 0);
    }

    public boolean swim(int distance) {
        System.out.println(name + "Кот не умеет плавать");
        return false; // Коты не умеют плавать
    }


    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Котик " + name + " сможет это пробежать.");
            return true; // Возвращаем true, если котик сможет пробежать
        } else {
            System.out.println("Котик " + name + " слишком слаб для такой дистанции.");
            return false; // Возвращаем false, если котик не сможет пробежать
        }
    }

    public boolean jump(int distance) {
        if (distance <= maxJumpHeight) {
            System.out.println("Котик " + name + " сможет прыгнуть на такую высоту.");
            return true; // Возвращаем true, если котик сможет прыгнуть
        } else {
            System.out.println("Это слишком высоко для котика: " + name);
            return false; // Возвращаем false, если котик не сможет прыгнуть
        }
    }

    public void catInfo() {
        System.out.println(" Beast: " + name + "Max run: " + maxRunDistance + " Max swim: " + maxSwimDistance + " Max jump: " + maxJumpHeight);
    }


}