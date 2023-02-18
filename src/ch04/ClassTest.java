package ch04;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c1 = Class.forName("ch04.Person");
        Person person = (Person)c1.newInstance();
        person.setName("Lee");
        System.out.println(person);
    }
}
