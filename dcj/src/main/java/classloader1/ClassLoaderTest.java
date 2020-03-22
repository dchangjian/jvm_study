package classloader1;

import java.util.HashMap;
import java.util.*;

public class ClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clazz1 = classLoader.loadClass("classloader1.C");

        System.out.println("-----------------------------");

        Class<?> clazz = Class.forName("classloader1.C");

        System.out.println(clazz1 == clazz);

        Map<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("A", 2);
        map.put("A", 3);
        System.out.println(map.get("A"));

        System.out.println("===============================");

        System.out.println(tryMethod());

    }


    static int tryMethod() {

        try{
            System.out.println("try block");
            return 1 / 0;
        }
        catch(Exception e) {
            System.out.println("exception block");
            return 2;
        }
    }
}


class C {
    static {
        System.out.println("class C static block");
    }
}

