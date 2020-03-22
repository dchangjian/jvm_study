package classloader3;

import classloader2.MyClassLoader;

import java.lang.reflect.Method;

public class MyTest20 {

    public static void main(String[] args) throws Exception {

        MyClassLoader loader1 = new MyClassLoader("C:\\Users\\Administrator\\Desktop\\classes\\");
        MyClassLoader loader2 = new MyClassLoader("C:\\Users\\Administrator\\Desktop\\classes\\");

        Class<?> clazz1 = loader1.loadClass("classloader3.MyCat");
        Class<?> class2 = loader2.loadClass("classloader3.MyCat");

        System.out.println(clazz1 == class2);

        Object myCat = clazz1.newInstance();
        Object myCat2 = class2.newInstance();

        //这行可能抛异常
        Method method = clazz1.getMethod("setCat", Object.class);
        method.invoke(myCat, myCat2);

    }
}
