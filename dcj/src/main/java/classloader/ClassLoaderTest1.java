package classloader;

/**
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化
 *
 * -XX:+TraceClassLoading
 */
public class ClassLoaderTest1 {

    public static void main(String[] args) {
        System.out.println(Child.str2);
    }

}

class Parent {

    public static String str = "hello world";

    static {
        System.out.println("parent static block");
    }
}

class Child extends Parent {

    public static String str2 = "welcome";

    static {
        System.out.println("child static block");
    }
}
