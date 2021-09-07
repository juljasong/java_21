package p0907;

/*
 * final
 * 
 * 1. 클래스와 메소드에 붙는 경우
 *   - 상속과 오버라이딩 불가
 *   - 클래스와 메소드의 맨 앞쪽에 위치
 *   
 * 2. 변수에 붙는 경우
 * 
 */

public class finalA {
  // 2.
  static final int intA = 10;
  
  public static void main(String[] args) {
    
    //intA = 12;
  
  }
  
}


// 1.

final class H {
  public void PrintH( ) {
    System.out.println("Hello world H");
  }
}

// class I extends H {} // Error (상속 불가)

class J {
  final void PrintJ() {
    System.out.println("Hello world J");
  }
}

class K extends J {
  public void PrintK() { // PrintK XXX
    System.out.println("Hello world K");
  }
}

