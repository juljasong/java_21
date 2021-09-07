package p0907;

/*
 * 상속 : 객체와 객체를 연관시키고 계층구조를 만들어 코드를 재사용함
 * 
 * - 부모 클래스 = 상위 클래스 = parent class = super class
 * - 자식 클래스 = 하위 클래스 = child class = sub class
 * - 오직 한 클래스 만을 상속할 수 있음
 * - 최상위 클래스 : Object
 * 
 * class 클래스명(sub) extends 상속클래스명(super) {}
 * 
 * 멤버 상속
 * 1. 상위 클래스에 지정된 private 멤버는 하위 클래스에서 사용할 수 없음
 * 2. 상위 클래스에 지정된 public 멤버는 하위 클래스에서 사용할 수 있으며, 외부에서도 언제든지 사용할 수 있음
 * 
 */

public class inheritance1 {
  
  public static void main(String[] args) {
    
    B b = new B();
    b.PrintB();
    b.PrintC();
  }

}

class A {
  private int a = 11;
  private void PrintA() {
    System.out.println("A class " + a);
  }
  
  public void PrintB() {
    PrintA();
  } // private 속성은 클래스 안에서 사용 가능
}

class B extends A {
  void PrintC() {
    // ▽private
    // PrintA(); 
    // System.out.println(a);
    PrintB();
  }
}
