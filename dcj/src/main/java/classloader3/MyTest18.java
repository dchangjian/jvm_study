package classloader3;

import classloader2.MyClassLoader;

/**
 * 关于命名空间总要概念：
 * 每个类加载器都有自己的命名空间，命名空间是由该类加载器及其所有的父类加载器所加载的类组成。
 * 子加载器所加载的类可以访问父加载器加载的类。
 * 父加载器所加载的类不能访问父加载器加载的类。
 *
 */
public class MyTest18 {

    public static void main(String[] args) throws Exception{

        MyClassLoader loader1 = new MyClassLoader("C:\\Users\\Administrator\\Desktop\\classes\\");
        Class<?> clazz = loader1.loadClass("classloader3.MySample");

        Object o = clazz.newInstance();
    }
}
