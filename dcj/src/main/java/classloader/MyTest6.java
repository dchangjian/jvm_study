package classloader;

public class MyTest6 {

    public static void main(String[] args) {
        System.out.println(Singleton.count1);
        System.out.println(Singleton.count2);
    }
}

class Singleton {

    static int count1;

    static Singleton singleton = new Singleton();

    private Singleton() {
        count1++;
        count2++;
    }

    static int count2 = 0;
}
