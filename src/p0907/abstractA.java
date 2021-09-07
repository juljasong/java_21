package p0907;

/*
 * 추상클래스
 * - 하위에서 구현할 메소드의 원형을 가진 상위 클래스
 * - 상위 클래스로서만 존재
 * - 자체를 객체로 생성 불가 
 * 
 * abstract class 클래스명 {
 *   일반 멤버 변수;
 *   메소드;
 *   생성자;
 *   abstract 반환형 메소드명();
 * }
 * 
 * - extends 키워드 이용하여 추상 클래스 상속
 * - 추상 메소드를 하위에서 모두 구현할 필요 X
 * 
 */

public class abstractA {

  public static void main(String[] args) {
    abstractClass ca = new ClassA();
    ca.Print();
    ca.Print1();
    System.out.println(ca.a);
    
    abstractClass cb = new ClassB();
    cb.Print();
    cb.Print1();
    System.out.println(cb.a);
    
    //abstractClass ac = new abstractClass();
  }

}

abstract class abstractClass {
  
  public int a = 7;
  public void Print() {
    System.out.println("Abstract Class");
  }
  abstract void Print1();

}

class ClassA extends abstractClass {
  void Print1() {
    System.out.println("Class A");
  }
}

class ClassB extends abstractClass {
  void Print1() {
    System.out.println("Class B");
  }
}