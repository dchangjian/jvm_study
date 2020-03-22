package classloader4;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ServiceLoader;

public class MyTest27 {
    public static void main(String[] args) throws Exception{
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());

        System.out.println(Connection.class.getClassLoader());

        Class.forName("com.mysql.jdbc.Driver");

        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);

        for(Driver driver : serviceLoader) {
            System.out.println(driver);
            System.out.println(driver.getClass().getClassLoader());
        }

        System.out.println(DriverManager.class.getClassLoader());

    }


}
