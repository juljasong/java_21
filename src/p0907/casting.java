package p0907;

/*
 * ���� ������ �̿��� �� ��ȯ�� ȣ��
 * - ĳ��Ʈ ������ ���()
 * 
 * 1. ���� Ŭ�������� ���� Ŭ������ �� ��ȯ�� �� ������ ���������ڿ� ���� ���� ����
 * 2. ������ ���� Ŭ�������� ���� Ŭ���� �� ��ȯ�� ���� ���� Ŭ������ ����� ���� �Ұ�
 * 3. ���� Ŭ������ �޼ҵ尡 ���� Ŭ������ �������̵� �� ���, ���� Ŭ���� ������������ �������̵��� �޼ҵ带 ȣ���ϸ� ���� Ŭ������ �޼ҵ� ����
 * 
 */

public class casting {

  public static void main(String[] args) {
    E1 e1 = new E1();
    //E1 e2 = new D1();
    E1 e3 = new F1();
    
    D1 d1 = (D1)e1; 
    
    e1.Print(); // E1 Print
    e3.Print(); // F1 Print
    d1.Print(); // E1 Print
  }

}

class D1 {
  public D1() {
    //System.out.println("Constructor D1");
  }
  protected void Print() {
    System.out.println("D1 Print");
  }
}

class E1 extends D1 {
  public E1() {
    //System.out.println("Constructor E1");
  }
  protected void Print() {
    System.out.println("E1 Print");
  }
}

class F1 extends E1 {
  public F1() {
    //System.out.println("Constructor F1");
  }
  protected void Print() {
    System.out.println("F1 Print");
  }
}