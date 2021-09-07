package p0907;

/*
 * ���� Ŭ����(inner class) : Ŭ���� �ȿ� Ŭ������ �����ϴ� ��
 * - ���� Ŭ������ �ܺ� Ŭ������ ��� �ڿ� ��� ����
 *
 * 1. new�� ����
 * 2. ���� Ŭ������ �ܺ� Ŭ������ ��� �ڿ� ���
 * 3. �ܺ� Ŭ������ ���� ���� Ŭ���� ���
 * 4. ���� ���� �ν��Ͻ� ���� Ŭ����, ���� ���� Ŭ����, ���� ���� Ŭ������ ���� �� ����
 * 
 */

public class inner {
  
  public static void main(String[] args) {
    OutClass1 out1 = new OutClass1();
    out1.innerC.Print1();
    
    OutClass2 out2 = new OutClass2();
    OutClass2.InnerClass2 inner = out2.new InnerClass2();
    inner.Print2();
  }

}

class OutClass1 {
  int a = 3;
  
  class InnerClass1 {
    void Print1() {
      System.out.println("Out Class1 : " + a); // �ܺ� Ŭ���� ���� ��� ����
    }
  }
  InnerClass1 innerC = new InnerClass1(); // �ν��Ͻ� Ŭ����
}

class OutClass2 {
  int a = 6;
  
  class InnerClass2 {
    void Print2() {
      System.out.println("Out Class2 : " + a); 
    }
  }
}