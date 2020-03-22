package classloader;

public class ClassTest6 {

    public static void main(String[] args) {
        new C1();
    }
}

class C1{

    C1() {
        System.out.println("hello");
    }

    {
        System.out.println("world");
    }
}
