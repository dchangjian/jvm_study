package classloader3;

public class MyCat {

    public MyCat() {
        System.out.println("MyCat is loaded by :" + this.getClass().getClassLoader());

        //这一行是重点
        System.out.println("from myCat:" + MySample.class.getClassLoader());
    }

}
