package p0907;

/*
 * 상속 관계에서 생성자의 호출 순서
 * 
 * 1. 상위 클래스 생성자 -> 하위 클래스 생성자
 * 2. 생성자에 매개변수가 있는 경우 자동 호출 X -> super 키워드 사용
 * 
 * super : 하위 클래스에서 상위 클래스를 참조하여 접근할 때 사용
 * super.멤버변수명/메소드명(매개변수)
 * 
 * 1. 하위 클래스에서 상위 클래스의 메소드나 변수를 호출할 때
 * 2. 하위 클래스에서 상위 클래스의 생성자를 호출할 때 super(매개변수) 
 *    * 하위 클래스의 생성자 맨 첫 줄에 위치해야 함
 * 
 */

public class order {
  
  public static void main(String[] args) {
    C1 c1 = new C1();
  }

}

class A1 {
  public A1() {
    System.out.println("Constructor A1");
  }
  protected void Print() {
    System.out.println("A1 Print");
  }
}

class B1 extends A1 {
  public B1() {
    super.Print();
    System.out.println("Constructor B1");
  }
}

class C1 extends B1 {
  public C1() {
    super.Print();
    System.out.println("Constructor C1");
  }
}