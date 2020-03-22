package classloader4;

import classloader2.MyClassLoader;

public class MyPersonTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        MyClassLoader loader1 = new MyClassLoader("C:\\Users\\Administrator\\Desktop\\classes\\");

// 获取
ClassLoader cl = Thread.currentThread().getContextClassLoader();

try{
    Thread.currentThread().setContextClassLoader(loader1);
    //do something
}
finally {
    // 还原
    Thread.currentThread().setContextClassLoader(cl);
}

        PersonManager.print();

        Thread.currentThread().setContextClassLoader(cl);
    }
}
