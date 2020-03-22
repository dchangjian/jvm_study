package classloader;

public class MyClassLoader4 {

    public static void main(String[] args) {

        //MyTest4 myTest4 = new MyTest4();

        MyTest4[] arrs = new MyTest4[2];
        System.out.println(arrs.getClass());
        System.out.println(args.getClass().getSuperclass());
        System.out.println("=============");

        int[] intArr = new int[1];
        System.out.println(intArr.getClass());
        System.out.println(intArr.getClass().getSuperclass());

        System.out.println("=============");
        char[] charArr = new char[1];
        System.out.println(charArr.getClass());

        System.out.println("=============");
        boolean[] boolArr = new boolean[1];
        System.out.println(boolArr.getClass());

        System.out.println("=============");
        short[] shortArr = new short[1];
        System.out.println(shortArr.getClass());

        System.out.println("=============");
        String[] stringArr = new String[1];
        System.out.println(stringArr.getClass());
    }
}

class MyTest4 {

    static {
        System.out.println("MyTest4 static block");
    }
}
