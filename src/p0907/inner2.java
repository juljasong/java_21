package p0907;


public class inner2 {
  
  public static void main(String[] args) {
    OutClassA out = new OutClassA();
    out.Print();
  }

}

class OutClassA {
  int a = 3;
  
  class InnerClass {
    void Print() {
      System.out.println("Out Class1 : " + a); // �ܺ� Ŭ���� ���� ��� ����
    }
  }
   
  void Print() {
    InnerClass inner = new InnerClass();
    inner.Print();
  }
}