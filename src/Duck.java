public class Duck extends Herbivores implements Walkable, Flyable, Swimable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "krya-krya-krya";
    }

    @Override
    public String toString() {
        return String.format("Duck: %s",super.toString());
    }

    @Override
    public int flySpeed() {
        return 50;
    }

    @Override
    public int walkSpeed() {
        return 5;
    }

    @Override
    public int swimSpeed() {
        return 10;
    }
}
