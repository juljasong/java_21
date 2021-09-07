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
      System.out.println("Out Class1 : " + a); // 외부 클래스 변수 사용 가능
    }
  }
   
  void Print() {
    InnerClass inner = new InnerClass();
    inner.Print();
  }
}