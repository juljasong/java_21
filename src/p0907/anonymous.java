package p0907;

/*
 * 익명 클래스 : 클래스명이 없는 클래스
 * - 일반 내부 클래스 : 외부클래스명$내부클래스명.class
 * - 익명 클래스 : 외부클래스명$1.class
 * 
 * - 선언과 생성이 동시에 이루어짐
 * - 일회성
 * 
 * Ex)
 * 1. 인터페이스를 상속한 클래스 사용의 일반적인 형식
 * 2. 인터페이스를 상속한 익명 클래스를 이용한 형식
 * 3. 익명 클래스를 메소드의 매개변수로 사용하는 예 
 * 
 */

interface Testable {
  public void Print();
}

class InterfaceClass implements Testable {

  @Override
  public void Print() {
    System.out.println("InterfaceClass Print");
  }
  
}

class Class1 {
  public void Print() {
    System.out.println("Class1 Print");
  }
}

class Class2 {
  void SetClass(Class1 c1) {
    c1.Print();
  }
}

public class anonymous {
  
  public static void main(String[] args) {
    
    Class2 c2 = new Class2();
    c2.SetClass(new Class1());
    
    c2.SetClass(new Class1() {
      public void Print() {
        System.out.println("Class1 Print(2)");
      }
    });
    
    /*
    InterfaceClass inter = new InterfaceClass();
    inter.Print(); // 일반적인 클래스 호출
    
    Class1 c1 = new Class1();
    c1.Print();
   
    
    InterfaceClass test = new InterfaceClass() {
      public void Print() {
        System.out.println("test...");
      }
    };
    test.Print();
    
    
    Class1 c2 = new Class1() {
      public void Print() {
        System.out.println("test2...");
      }
    };
    c2.Print();
    
    
    Testable test2 = new Testable() {
      
      @Override
      public void Print() {
        System.out.println("test3...");
        
      }
    };
    test2.Print();
    */
    
  }

}


