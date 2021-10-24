package chen;

import java.lang.reflect.Field;

public class reflectDemo2 {

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        for (Field field : personClass.getFields()) {
            System.out.println(field);
        }
        Field a = personClass.getField("a");
        Person person = new Person();
        Object value=a.get(person);
        System.out.println(value);
        a.set(person,"张三");
        System.out.println(person);
        for (Field declaredField : personClass.getDeclaredFields()) {
            System.out.println(declaredField);
        }
        Field d = personClass.getDeclaredField("name");
        d.setAccessible(true);
        Object o = d.get(person);
        System.out.println(o);
        d.set(person,"abc");
        System.out.println(person);


    }
}
