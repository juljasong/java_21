package p0906;

/*
 * 생성자
 * 
 * - 객체가 생성될 때 한 번 호출되는 메소드
 * - 자동으로 호출되는 메소드
 * - 리턴형이 없고 클래스명과 함수명이 같음
 * - public
 * 
 */
public class class3constuctor {
  
  public static void main(String[] args) {
    
    MyClass c_1 = new MyClass();
    System.out.println(c_1.Get());
    
    MyClass c_2 = new MyClass(100);
    System.out.println(c_2.Get());
    
  }

}

class MyClass {
  
  private int a;
  public float b = 3.14f;
  
  public MyClass() {
    a = 12;
  }
 
  public MyClass(int x) {
    a = x;
  }
  
  public int Get () {
    return a;
  }
}