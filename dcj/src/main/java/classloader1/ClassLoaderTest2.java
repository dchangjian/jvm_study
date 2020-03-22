package classloader1;

public class ClassLoaderTest2 {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        while(classLoader != null) {
            System.out.println(classLoader);
            classLoader = classLoader.getParent();
        }
    }
}
