package p0907;

/*
 * �߻�Ŭ���� vs [�������̽�]
 * 
 * 1. ������
 *   - ���� Ŭ�����θ� ��� ����   
 *   - �������� ������ �Լ� ���� ����
 *   
 * 2. ������
 *   - �߻� Ŭ���� : �Ϲ� ��� + �߻� �޼ҵ�
 *     �������̽� : �߻� �޼ҵ� + ���
 *   - �߻� Ŭ���� : �߻� �޼ҵ� �Ϻ� ���� ����
 *     �������̽� : �߻� �޼ҵ� ��� �����ؾ� ��(������)
 *   - ���� ��� ����
 *   - �������̽��� �������̽��� ���� ��� ����
 * 
 *   interface �������̽���(~able) {...}
 *   class Ŭ������ extends Ŭ������ implements �������̽���1, �������̽���2,.. { }
 * 
 */

public class interfaceA {
  public static void main(String[] args) {
    //InterfacableC inf = new ClassInf();
    ClassInf2 inf = new ClassInf2();
    inf.PrintA();
    inf.PrintB();
    //inf.PrintC();

  }

}

interface InterfacableA {
  int a = 10;
  void PrintA();
}

interface InterfacableB {
  int b = 100;
  void PrintB();
}

interface InterfacableC extends InterfacableA, InterfacableB {
  int c = 1000;
  void PrintC();
}

class ClassInf implements InterfacableC {

  @Override
  public void PrintC() {
    System.out.println(c);
  }

  @Override
  public void PrintA() {
    System.out.println(a);
  }

  @Override
  public void PrintB() {
    System.out.println(b);
  }
}

class ClassInf2 implements InterfacableA, InterfacableB {

  @Override
  public void PrintB() {
    System.out.println(b);
  }

  @Override
  public void PrintA() {
    System.out.println(a);
  }
  
}
