package classloader4;

public class MyPerson implements Person {

    static {
        PersonManager.register(new MyPerson());
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getSex() {
        return 1;
    }
}
