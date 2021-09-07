package p0907;

import p0906.inheritance3;

/*
 * 멤버 상속
 * 3. protected의 상위 멤버는 같은 패키지 일 때는 public 멤버처럼, 
 *    다른 패키지인 경우는 상위 멤버를 하위 클래스 안에서만 사용할 뿐 외부 사용 불가
 *    
 * 4. 상위 클래스에서 default 멤버들은 같은 패키지 내에서 public 멤버처럼 사용할 수 있지만,
 *    패키지가 다른 경우 하위 클래스에서 상위 클래스 default 멤버를 사용할 수 없고, 외부에서도 사용 불가
 */

public class inheritance2 {
  
  public static void main(String[] args) {
    
    // 3.
    C c = new C();
    c.c = 20;
    c.PrintA();
    
    D d = new D();
    d.c = 20;
    d.PrintA();
    d.PrintB();
    
    E e = new E();
    e.PrintE();

  }

}

// 3.
class C {
  protected int c = 11;
  protected void PrintA() {
    System.out.println("A class " + c);
  }
}

class D extends C {
  public void PrintB() {
    System.out.println("B class " + c);
  }
}

class E extends inheritance3 {
  public void PrintE() {
    System.out.println("E class " + z);
  }
}