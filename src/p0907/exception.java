package p0907;

/*
 * 예외 처리 : 프로그램 실행 도중 발생하는 오류를 처리하기 위한 부분
 * 
 * 에러 : 수정 불가
 * 오류 : 수정 가능, 알려주는 역할
 * 
 * 키워드 : try catch finally throws
 * 
 */

public class exception {
  
  public static void main(String[] args) {
    
    int a = 10;
    int result;
    
    try {
      // 에러가 발생할 수 있는 코드
      //result = a/0;
      System.out.println("Success!");
    } catch (ArithmeticException e) { // 0으로 나눌 때
      // 에러가 발생했을 때 실행할 코드
      System.out.println("Failed..");
    } finally { 
      // 예외 처리와 상관 없이 항상 실행해야 하는 문장\
      System.out.println("Finally..");
    }
    
    int arrayInt[] = {0, 1, 2, 3, 4};
    
    try {
      for(int i = 0 ; i < arrayInt.length + 1 ; i ++) {
        System.out.println(arrayInt[i]);
      }
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    
    
  }

}
