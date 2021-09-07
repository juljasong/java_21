package p0907;

/*
 * ��� : ��ü�� ��ü�� ������Ű�� ���������� ����� �ڵ带 ������
 * 
 * - �θ� Ŭ���� = ���� Ŭ���� = parent class = super class
 * - �ڽ� Ŭ���� = ���� Ŭ���� = child class = sub class
 * - ���� �� Ŭ���� ���� ����� �� ����
 * - �ֻ��� Ŭ���� : Object
 * 
 * class Ŭ������(sub) extends ���Ŭ������(super) {}
 * 
 * ��� ���
 * 1. ���� Ŭ������ ������ private ����� ���� Ŭ�������� ����� �� ����
 * 2. ���� Ŭ������ ������ public ����� ���� Ŭ�������� ����� �� ������, �ܺο����� �������� ����� �� ����
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
  } // private �Ӽ��� Ŭ���� �ȿ��� ��� ����
}

class B extends A {
  void PrintC() {
    // ��private
    // PrintA(); 
    // System.out.println(a);
    PrintB();
  }
}
