package classloader;

import java.util.UUID;

public class ClassLoaderTest3 {

    public static void main(String[] args) {

        System.out.println(MyParent3.str);
    }
}


class MyParent3 {

    static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent3 static block");
    }
}
