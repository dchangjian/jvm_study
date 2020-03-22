package classloader3;

import classloader2.MyClassLoader;

public class MyTest17 {

    public static void main(String[] args) throws Exception {

        MyClassLoader loader1  = new MyClassLoader();
        Class<?> clazz = loader1.loadClass("classloader3.MySample");

        Object o = clazz.newInstance();
       // System.out.println(o);
    }
}
