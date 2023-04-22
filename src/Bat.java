public class Bat extends Predator implements Flyable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public int flySpeed() {
        return 150;
    }

    @Override
    public String say() {
        return "pi-pi-pi";
    }

    @Override
    public String toString() {
        return String.format("But: %s",super.toString());
    }
}
