public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addList(new Wolf("Wolf"))
                .addList(new Hare("Hare"))
                .addList(new Duck("Donald Duck"))
                        .addList(new Bat("BatMan"))
                                .addList(new whiteBear("Balu"));
        zoo.setRadio(new Radio());
        for (var item: zoo.getListAnimal() ) {
            System.out.println(item);
        }

        for (var item: zoo.getSayabl()) {
            System.out.println(item.say());
        }
        System.out.println();
        System.out.println("Умеют ходить");
        for (var item: zoo.walkables()) {
            System.out.printf("%s - %d \n", item.toString(), item.walkSpeed());
        }
        System.out.println();
        System.out.println("Умеют летать");
        for (var item: zoo.flyables()) {
            System.out.printf("%s  - %d \n", item.toString(), item.flySpeed());
        }

        System.out.println("Победить по скорости ходьбы: ");
        System.out.println("Winner " + zoo.winnerWalk());

        System.out.println("Победить по скорости полета: ");
        System.out.println("Winner: " + zoo.winnerFly());

        System.out.println("Умеют плавать:");
        for (var item: zoo.swimables()) {
            System.out.printf("%s  -  %d\n", item.toString(), item.swimSpeed());
        }

        System.out.println();
        System.out.println("Победить по скорости плаванья: ");
        System.out.println("Winner: " + zoo.winnerSwim());


    }
}