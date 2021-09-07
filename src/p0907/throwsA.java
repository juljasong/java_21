package p0907;

/*
 * throws : 모든 예외 처리를 try ~ catch 안에 넣어 처리하기에는 무리가 있음
 * -> JVM 도는 예외 처리 클래스 지정
 * 
 * 반환형 메소드() throws Exception { ... }
 * 
 */

public class throwsA {
  
  public static void main(String[] args) throws Exception {
    int a = 10;
    int result;
    
    result = a/0;
  }

}
