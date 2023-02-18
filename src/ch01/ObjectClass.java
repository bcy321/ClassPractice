package ch01;
/*
* object 클래스 - 모든 클래스의 최상위 클래스
* java.lang 패키지(프로그래밍 시 import 하지 않아도 자동으로 import 됨)
* 많이 사용하는 기본 클래스들이 속한 패키지 (Integer,String,System)
* 모든 클래스는 object 클래스를 상속 받는다.
* 모든 클래스의 최상위 클래스
* 모든 클래스는 object 에서 상속받고, object 클래스의 메서드 중 일부는 재정의해서 사용할 수 있음
* 컴파일러가 extends Object 를 추가함
* /////////////////////////////////////
* toString
* 객체의 정보를 String 으로 바꾸어서 사용
* String 이나 Integer 클래스는 이미 재정의 되어 있음
*
* equals()
* 두 인스턴스의 주소 값을 비교하여 true/false 를 반환
* 재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 구현함
* 인스턴스가 다르더라도 논리적으로 동일한 경우 true 를 반환 하도록 재정의 할 수 있음
*
* hashCode()
* hashCode()는 인스턴스의 저장 주소를 반환
* 힙메모리에 인스턴스가 저장되는 방식이 hash 방식
* hash : 정보를 저장 검색하는 자료구조
* 자료의 특정 값(키 값)에 대한 저장 위치를 반환해주는 해시 함수를 사용
*
* clone()
* 객체의 원본을 복제하는데 사용하는 메서드
* 생성과정의 복잡한 과정을 반복하지 않고 복제 할 수 있음
*
* */

class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ',' + author;
    }
}
public class ObjectClass {
    public static void main(String[] args) {
        Book book = new Book("데미안", "허르만 허세");
        System.out.println(book);

        String str = new String("test");
        System.out.println(str);
    }
}
