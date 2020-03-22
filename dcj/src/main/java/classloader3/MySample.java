package classloader3;

public class MySample {

    public MySample() {
        System.out.println("MySample classLoader is" + this.getClass().getClassLoader());

        new MyCat();
    }
}
