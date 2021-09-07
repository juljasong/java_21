package p0907;

/*
 * ��� ���迡�� �������� ȣ�� ����
 * 
 * 1. ���� Ŭ���� ������ -> ���� Ŭ���� ������
 * 2. �����ڿ� �Ű������� �ִ� ��� �ڵ� ȣ�� X -> super Ű���� ���
 * 
 * super : ���� Ŭ�������� ���� Ŭ������ �����Ͽ� ������ �� ���
 * super.���������/�޼ҵ��(�Ű�����)
 * 
 * 1. ���� Ŭ�������� ���� Ŭ������ �޼ҵ峪 ������ ȣ���� ��
 * 2. ���� Ŭ�������� ���� Ŭ������ �����ڸ� ȣ���� �� super(�Ű�����) 
 *    * ���� Ŭ������ ������ �� ù �ٿ� ��ġ�ؾ� ��
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