package p0907;

/*
 * final
 * 
 * 1. Ŭ������ �޼ҵ忡 �ٴ� ���
 *   - ��Ӱ� �������̵� �Ұ�
 *   - Ŭ������ �޼ҵ��� �� ���ʿ� ��ġ
 *   
 * 2. ������ �ٴ� ���
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

// class I extends H {} // Error (��� �Ұ�)

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

