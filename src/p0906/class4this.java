package p0906;

/*
 * this
 * 
 * - 객체 자신을 참조하는 참조형 클래스 변수 또는 키워드
 * 
 * this.member_var
 * this.method()
 * 
 * 
 * this()
 * 
 * - 생성자에서 또 다른 생성자 호출
 * - 생성자 첫 줄에서 호출
 * 
 */

public class class4this {

  public static void main(String[] args) {
    
    MyClass4 c_1 = new MyClass4();
    System.out.println(c_1.GetA() + ", " + c_1.GetB());
    
    
  }

}

class MyClass4 {
  
  public int a;
  public float b;
  
  public MyClass4() {
    this(3.14f); // 첫 줄에서 다른 생성자 호출
    this.a = 12;
  }
  
  public MyClass4(float y) {
    this.b = y;
  }
  
  public int GetA() {
    return this.a;
  }
  
  public float GetB() {
    return this.b;
  }
}