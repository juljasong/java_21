package p0907;

/*
 * 추상클래스 vs [인터페이스]
 * 
 * 1. 공통점
 *   - 상위 클래스로만 사용 가능   
 *   - 하위에서 구현할 함수 원형 선언
 *   
 * 2. 차이점
 *   - 추상 클래스 : 일반 멤버 + 추상 메소드
 *     인터페이스 : 추상 메소드 + 상수
 *   - 추상 클래스 : 추상 메소드 일부 구현 가능
 *     인터페이스 : 추상 메소드 모두 구현해야 함(강제적)
 *   - 다중 상속 가능
 *   - 인터페이스가 인터페이스를 다중 상속 가능
 * 
 *   interface 인터페이스명(~able) {...}
 *   class 클래스명 extends 클래스명 implements 인터페이스명1, 인터페이스명2,.. { }
 * 
 */

public class interfaceA {
  public static void main(String[] args) {
    //InterfacableC inf = new ClassInf();
    ClassInf2 inf = new ClassInf2();
    inf.PrintA();
    inf.PrintB();
    //inf.PrintC();

  }

}

interface InterfacableA {
  int a = 10;
  void PrintA();
}

interface InterfacableB {
  int b = 100;
  void PrintB();
}

interface InterfacableC extends InterfacableA, InterfacableB {
  int c = 1000;
  void PrintC();
}

class ClassInf implements InterfacableC {

  @Override
  public void PrintC() {
    System.out.println(c);
  }

  @Override
  public void PrintA() {
    System.out.println(a);
  }

  @Override
  public void PrintB() {
    System.out.println(b);
  }
}

class ClassInf2 implements InterfacableA, InterfacableB {

  @Override
  public void PrintB() {
    System.out.println(b);
  }

  @Override
  public void PrintA() {
    System.out.println(a);
  }
  
}
