package p0906;

/*
 * this
 * 
 * - ��ü �ڽ��� �����ϴ� ������ Ŭ���� ���� �Ǵ� Ű����
 * 
 * this.member_var
 * this.method()
 * 
 * 
 * this()
 * 
 * - �����ڿ��� �� �ٸ� ������ ȣ��
 * - ������ ù �ٿ��� ȣ��
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
    this(3.14f); // ù �ٿ��� �ٸ� ������ ȣ��
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