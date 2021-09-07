package p0907;

/*
 * 참조 변수를 이용한 형 변환과 호출
 * - 캐스트 연산자 사용()
 * 
 * 1. 하위 클래스에서 상위 클래스로 형 변환할 수 있으며 접근지정자에 따라 접근 결정
 * 2. 생성된 하위 클래스에서 상위 클래스 형 변환을 통해 하위 클래스의 멤버에 접근 불가
 * 3. 상위 클래스의 메소드가 하위 클래스에 오버라이딩 된 경우, 상위 클래스 참조변수에서 오버라이딩된 메소드를 호출하면 하위 클래스의 메소드 실행
 * 
 */

public class casting {

  public static void main(String[] args) {
    E1 e1 = new E1();
    //E1 e2 = new D1();
    E1 e3 = new F1();
    
    D1 d1 = (D1)e1; 
    
    e1.Print(); // E1 Print
    e3.Print(); // F1 Print
    d1.Print(); // E1 Print
  }

}

class D1 {
  public D1() {
    //System.out.println("Constructor D1");
  }
  protected void Print() {
    System.out.println("D1 Print");
  }
}

class E1 extends D1 {
  public E1() {
    //System.out.println("Constructor E1");
  }
  protected void Print() {
    System.out.println("E1 Print");
  }
}

class F1 extends E1 {
  public F1() {
    //System.out.println("Constructor F1");
  }
  protected void Print() {
    System.out.println("F1 Print");
  }
}