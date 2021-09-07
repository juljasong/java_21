package p0907;

/*
 * 내부 클래스(inner class) : 클래스 안에 클래스를 정의하는 것
 * - 내부 클래스는 외부 클래스의 모든 자원 사용 가능
 *
 * 1. new로 생성
 * 2. 내부 클래스는 외부 클래스의 모든 자원 사용
 * 3. 외부 클래스를 통해 내부 클래스 사용
 * 4. 선언에 따라 인스턴스 내부 클래스, 정적 내부 클래스, 지역 내부 클래스로 나눌 수 있음
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
      System.out.println("Out Class1 : " + a); // 외부 클래스 변수 사용 가능
    }
  }
  InnerClass1 innerC = new InnerClass1(); // 인스턴스 클래스
}

class OutClass2 {
  int a = 6;
  
  class InnerClass2 {
    void Print2() {
      System.out.println("Out Class2 : " + a); 
    }
  }
}