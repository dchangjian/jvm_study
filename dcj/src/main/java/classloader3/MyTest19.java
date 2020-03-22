package classloader3;

import classloader2.MyClassLoader;

public class MyTest19 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //根类加载器加载类的路径
        System.out.println(System.getProperty("sun.boot.class.path"));
        //扩展类加载器加载类的路径
        System.out.println(System.getProperty("java.ext.dirs"));
        //应用类加载器加载类的路径
        System.out.println(System.getProperty("java.class.path"));

        //MyClassLoader classLoader = new MyClassLoader("D:\\study\\study_code\\jvm\\dcj\\out\\production\\classes");


        //Class<?> clazz = classLoader.loadClass("classloader3.MySample");

        System.out.println(MyTest19.class.getClassLoader());


    }
}
