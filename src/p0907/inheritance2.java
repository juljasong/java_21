package p0907;

import p0906.inheritance3;

/*
 * ��� ���
 * 3. protected�� ���� ����� ���� ��Ű�� �� ���� public ���ó��, 
 *    �ٸ� ��Ű���� ���� ���� ����� ���� Ŭ���� �ȿ����� ����� �� �ܺ� ��� �Ұ�
 *    
 * 4. ���� Ŭ�������� default ������� ���� ��Ű�� ������ public ���ó�� ����� �� ������,
 *    ��Ű���� �ٸ� ��� ���� Ŭ�������� ���� Ŭ���� default ����� ����� �� ����, �ܺο����� ��� �Ұ�
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