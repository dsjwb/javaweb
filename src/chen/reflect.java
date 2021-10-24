package chen;

public class reflect {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("chen.Person");
        System.out.println(aClass);
        Class<Person> personClass = Person.class;
        Person p=new Person();
        Class cp=p.getClass();
        System.out.println(aClass==personClass);
        System.out.println(aClass==cp);


    }
}
