package classloader3;

import classloader2.MyClassLoader;

public class MyTest21 {

    public static void main(String[] args) throws Exception {

        MyClassLoader loader1 = new MyClassLoader("C:\\Users\\Administrator\\Desktop\\classes\\");


        Class<?> clazz = loader1.loadClass("classloader3.MySample");

        //如果注释掉该行，那么并不会实例化MySample对象，MySample的构造方法不会被调用,因此不会实例化MyCat对象，不会加载MyCat.class
        clazz.newInstance();

    }
}
