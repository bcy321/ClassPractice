package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
* class 클래스
* 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
* class 클래스는 컴파일 된 클래스 파일을 로드하여 객체를 동적으로 로드하고, 정보를 가져오는 메서드가 제공됨
* Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함
*     Class c = Class.forName("java.lang.String");
* 클래스 이름으로 직접 Class 클래스 가져오기
*     Class c = String.class;
* 생성된 인스턴스에서 Class 클래스 가져오기
* String s = new String();
* Class c = s.getClass();
* //////////////////////////////////////////////////////
* 동적 로딩
* 컴파일 시에 데이터 타입이 binding 되는 것이 아닌 , 실행 중에 데이터 타입을 binding 하는 방법
* 프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에 원하는 클래스 로딩하여 binding 할 수 있다는 장점
* 컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램의 심각한 장애가 발생가능
* ////////////////////////////////////////////////////////
* Class의 newInstance() 메서드로 인스턴스 생성
* new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스를 생성
*
*
*
* */
public class UsingClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        Constructor[] constructors = c.getConstructors();
        for (Constructor con : constructors){
            System.out.println(con);
        }
        Method[] methods = c.getMethods();
        for (Method m : methods){
            System.out.println(m);
        }



    }
}
