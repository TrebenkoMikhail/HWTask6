public class Cat extends Animal {

    private static int count;

    public Cat(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
        count++;
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.maxRunDistance) {
            System.out.printf("Кот пробежал %d метров%n ", distance);
            return true;
        }
        System.out.println("Кот не смог пробежать");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return false;
    }

    public static int getCount() {
        return count;
    }
}

