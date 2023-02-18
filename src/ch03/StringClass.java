package ch03;
/*
* String 클래스
* String 선언하기
* 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀에 있는 주소를 참조하는 두가지 방법;
* 힙 메모리는 생성될 때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
* String a = new String("a"); 힘메모리
* String a = "a" 상수 풀
*
* StringBuilder, StringBuffer 활용하기
* 내부적으로 가변적인 char[]를 멤버 변수로 가짐
* 문자열을 여러번 연결하거나 변경할때 사용하면 유용함
* 새로운 인스턴스를 생성하지 않고 char[] 을 변경함
* StringBuffer 멀티 쓰레드 프로그래밍에서 동기화(Synchronization)을 보장
* StringBuilder 단일 쓰레드 프로그램에서는 권장
*
* */
public class StringClass {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

//        System.out.println(System.identityHashCode(java));
//        java = java.concat(android);
//        System.out.println(System.identityHashCode(java));
//        System.out.println(java);

        StringBuilder builder = new StringBuilder(java);
        builder.append(android);
        String test = builder.toString();
        System.out.println(test);

    }
}
