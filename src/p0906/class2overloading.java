package p0906;

/*
 *  �����ε�
 *  
 *  - �ߺ��Ǵ� �޼ҵ� ���� Ŭ���� �ȿ��� ������ �� �ֵ��� ��
 *  - ���� �Լ������� �پ��� ���� �޾� ó��
 *  - �Լ��� �ϳ��� ����ϸ� ��
 */

public class class2overloading {
  
  public static void main(String[] args) {
    
    OverLoad load = new OverLoad();
    
    System.out.println(load.Add(4, 9));
    System.out.println(load.Add("Hello, ", "world"));
    
  }
  
}

class OverLoad {
  
  public int Add(int a, int b) {
    return a + b;
  }
  
  public String Add(String str_a, String str_b) {
    return str_a.concat(str_b);
  }
}
