package classloader;

public class ClassLoaderTest2 {

    public static void main(String[] args) {

        System.out.println(MyParent1.s);
        System.out.println(MyParent1.i);
    }
}

class MyParent1 {

     static final String str = "hello world";

     static final short s = 1;

     static final int i = -1;

    static {
        System.out.println("MyParent1 static block");
    }
}
