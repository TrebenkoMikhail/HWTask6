public class HW6 {

    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();

        for (Animal participant : participants) {
            participant.run(300);
            participant.swim(300);
        }
        System.out.println("Количество созданных животных " + Animal.getCount());
        System.out.println("Количество созданных котов " + Cat.getCount());
        System.out.println("Количество созданных собак " + Dog.getCount());
    }

    private static Animal[] prepareParticipants() {
        return new Animal[]{
                new Dog(400, 30),
                new Dog(100, 3),
                new Cat(400, 2),
                new Cat(200, 10)
        };
    }
}
