package classloader3;

public class MyTest22 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());

        System.out.println(Object.class.getClassLoader());

        String[] arr = new String[1];
        Integer[] intArr = new Integer[1];

        System.out.println(arr.getClass());
        System.out.println(intArr.getClass());
    }
}
