package ch02;

public class EqualsTest {
    public static void main(String[] args) {
        Student s1 = new Student(100,"Lee");
        Student s2 = new Student(100,"Lee");
        Student s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());





    }
}
