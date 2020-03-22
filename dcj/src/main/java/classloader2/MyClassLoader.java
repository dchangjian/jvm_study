package classloader2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class MyClassLoader extends ClassLoader {

    private String basePath;

    private String extension = ".class";

    public MyClassLoader() {
        super(); //将系统类加载器作为该类加载器的父类加载器
    }

    public MyClassLoader(String basePath) {
        this.basePath = basePath;
    }


    public MyClassLoader(ClassLoader parent) {
        super(parent); //将传入的类加载器作为该类加载器的父类加载器
    }

    @Override
    protected Class<?> findClass(String name) {
        System.out.println("MyClassLoader findClass invoked");
        byte[] bytes;
        try {
            bytes = loadClassData(name);
            return this.defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] loadClassData(String className) throws IOException {

        className = basePath + className.replace(".", File.separator) + extension;

        FileInputStream fis = new FileInputStream(new File(className));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[1000];
        int len;

        while (-1 != (len = fis.read(buffer, 0, buffer.length))) {
            baos.write(buffer, 0, len);
        }

        baos.close();
        fis.close();

        return baos.toByteArray();

    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        MyClassLoader myClassLoader = new MyClassLoader("C:\\Users\\Administrator\\Desktop\\classes\\");
        Class<?> clazz = myClassLoader.loadClass("classloader1.ClassLoaderTest");
        System.out.println(clazz.hashCode());

        //再定义一个自定义的类加载器
        myClassLoader = new MyClassLoader("C:\\Users\\Administrator\\Desktop\\classes\\");
        clazz = myClassLoader.loadClass("classloader1.ClassLoaderTest");
        System.out.println(clazz.hashCode());

        System.gc();

    }
}
