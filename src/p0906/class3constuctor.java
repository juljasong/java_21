package p0906;

/*
 * ������
 * 
 * - ��ü�� ������ �� �� �� ȣ��Ǵ� �޼ҵ�
 * - �ڵ����� ȣ��Ǵ� �޼ҵ�
 * - �������� ���� Ŭ������� �Լ����� ����
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