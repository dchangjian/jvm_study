package classloader4;

public class MyPerson1 implements Person {

    public MyPerson1() {
        System.out.println("MyPerson1 is loaderd by:" + getClass().getClassLoader());
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getSex() {
        return 0;
    }
}
