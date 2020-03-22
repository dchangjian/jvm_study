package classloader;

public class MyClassLoader5 {
    public static void main(String[] args) {
        new C();
    }
}


class C {

    static Object staticObject = new Object(){
        {
            System.out.println("staticObject object constructed");
        }
    };

    static {
        System.out.println("static block invoked");
    }


    C() {
        instanceObject = new Object();
        System.out.println("constructor method block: " + instanceObject);
    }


    private Object instanceObject;

    {
        System.out.println("constructor code block: " + instanceObject);
    }
}




