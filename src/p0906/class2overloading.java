package p0906;

/*
 *  오버로딩
 *  
 *  - 중복되는 메소드 명을 클래스 안에서 정의할 수 있도록 함
 *  - 같은 함수명으로 다양한 값을 받아 처리
 *  - 함수명 하나만 기억하면 됨
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
