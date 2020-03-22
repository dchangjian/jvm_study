package classloader3;

import java.sql.Driver;
import java.util.ServiceLoader;

public class MyTest26 {

    public static void main(String[] args) {


        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);

        for (Driver driver : serviceLoader) {
            System.out.println("driver:" + driver.getClass() + ", loader: " + driver.getClass().getClassLoader());
        }
    }
}
