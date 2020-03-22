package classloader4;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class PersonManager {


    private static Map<String, Person> registerMap = new HashMap<>();

    static {
        register0();
    }

    private static void register0() {
        ServiceLoader<Person> serviceLoader = ServiceLoader.load(Person.class);
        for (Person person : serviceLoader) {
            registerMap.put(person.getClass().getName() + "-" + person.getClass().hashCode() + "-" + person.hashCode(), person);
        }
    }

    public static void register(Person person) {
        if (person == null) {
            throw new NullPointerException();
        } else {
            registerMap.put(person.getClass().getName() + "-" + person.getClass().hashCode() + "-" + person.hashCode(), person);
        }
    }

    public static void print() {

        System.out.println("PersonManager print as fllows:===============");
        for (Map.Entry<String, Person> set : registerMap.entrySet()) {
            System.out.println(set.getKey() + ":" + set.getValue().getClass().getClassLoader());
        }

        System.out.println("PersonManager print end =================");
    }

}
