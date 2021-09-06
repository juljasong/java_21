package p0906;

/*
 * static
 * 
 * ���������� static �������� ���������;
 * ���������� static ������ �޼ҵ��();
 * 
 * - static ��������� �޼ҵ��� ������ : ��ü�� �����Ǳ� ������ ��������� �޼ҵ� ��� ����
 * - static ��� ������ Ư¡ : ��� ������ �����Ǵ� ��� ��ü���� ���������� ���
 * 
 * static ��� ��Ģ
 * a. static �޼ҵ� �ȿ��� ��� ������ ����� �� ��� ������ �׻� static���� ����� �͸��� ����� �� �ִ�.
 * b. static �޼ҵ�� ���� Ŭ���� ���� static �޼ҵ� ���� ȣ���� �� �ִ�.
 * c. static �޼ҵ� �ȿ����� this�� ����� �� ����. (��ü ���� �����̱� ����)
 * d. static �޼ҵ�� �������̵��� �� �� ����. 
 * 
 */

public class class5static {
  public static void main(String[] args) {
    A.Print();
    
    System.out.println(A.MyClass5(13));
  }

}

class A {
  
  public static int a;
  public float b;
  
  public static int MyClass5(int i) {
    a = i;
    return a;
  }

  public static void Print() {
    System.out.println("Hello World");
  }
}