package p0906;

/*
 * static
 * 
 * 접근제어자 static 데이터형 멤버변수명;
 * 접근제어자 static 리턴형 메소드명();
 * 
 * - static 멤버변수와 메소드의 공통점 : 객체가 생성되기 이전에 멤버변수와 메소드 사용 가능
 * - static 멤버 변수의 특징 : 멤버 변수는 생성되는 모든 객체에서 전역변수로 사용
 * 
 * static 사용 규칙
 * a. static 메소드 안에서 멤버 변수를 사용할 때 멤버 변수는 항상 static으로 선언된 것만을 사용할 수 있다.
 * b. static 메소드는 같은 클래스 안의 static 메소드 만을 호출할 수 있다.
 * c. static 메소드 안에서는 this를 사용할 수 없다. (객체 생성 이전이기 때문)
 * d. static 메소드는 오버라이딩을 할 수 없다. 
 * 
 */

public class class5static {
  public static void main(String[] args) {
    A.Print();
    
    System.out.println(A.MyClass5(13));
  }

}

class A {
  
  public static int a;
  public float b;
  
  public static int MyClass5(int i) {
    a = i;
    return a;
  }

  public static void Print() {
    System.out.println("Hello World");
  }
}