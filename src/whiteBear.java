public class whiteBear extends Predator implements Walkable,Sayable,Swimable{
    public whiteBear(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "r-r-r-r";
    }

    @Override
    public int swimSpeed() {
        return 25;
    }

    @Override
    public int walkSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("White Bear: %s",super.toString());
    }

}
