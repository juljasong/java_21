package p0907;

/*
 * �߻�Ŭ����
 * - �������� ������ �޼ҵ��� ������ ���� ���� Ŭ����
 * - ���� Ŭ�����μ��� ����
 * - ��ü�� ��ü�� ���� �Ұ� 
 * 
 * abstract class Ŭ������ {
 *   �Ϲ� ��� ����;
 *   �޼ҵ�;
 *   ������;
 *   abstract ��ȯ�� �޼ҵ��();
 * }
 * 
 * - extends Ű���� �̿��Ͽ� �߻� Ŭ���� ���
 * - �߻� �޼ҵ带 �������� ��� ������ �ʿ� X
 * 
 */

public class abstractA {

  public static void main(String[] args) {
    abstractClass ca = new ClassA();
    ca.Print();
    ca.Print1();
    System.out.println(ca.a);
    
    abstractClass cb = new ClassB();
    cb.Print();
    cb.Print1();
    System.out.println(cb.a);
    
    //abstractClass ac = new abstractClass();
  }

}

abstract class abstractClass {
  
  public int a = 7;
  public void Print() {
    System.out.println("Abstract Class");
  }
  abstract void Print1();

}

class ClassA extends abstractClass {
  void Print1() {
    System.out.println("Class A");
  }
}

class ClassB extends abstractClass {
  void Print1() {
    System.out.println("Class B");
  }
}