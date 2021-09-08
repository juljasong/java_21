package p0908;


/*
 * wrapper 클래스 : 기본 데이터형을 객체로 다룰 수 있도록 함
 * 
 * 기본 데이터형 + 메소드
 * 
 */

public class wrapper {
  
  public static void main(String[] args) {
    
    /*
     * Integer
     */
    
    Integer int1 = new Integer(123);
    int num1 = int1.intValue();
    System.out.println("int1 : " + num1);
    
    String str1 = int1.toString();
    System.out.println("str1 : " + str1);
    
    num1 = Integer.parseInt(str1);
    System.out.println("str1 : " + num1);
    
    Integer int2 = Integer.valueOf("100");
    System.out.println("int2 : " + int2.intValue());
    
    
    /*
     * Autoboxing
     * 1. wrapper 객체와 값 사이의 변환을 자동으로 처리
     * 2. 기존 wrapper 클래스의 메소드를 간략하게 사용할 수 있음
     * 
     */
    
    Integer int3 = 12; // new Integer(12)
    int num2 = 3;
    int total = num2 + int3; // int3.intValue()
    System.out.println("autoboxing : " + int3);
    System.out.println("SUM : " + total);
    
    int3++;
    System.out.println("++ autoboxing : " + int3);
    System.out.println("return : " + Add(100));
    
    
  }

  public static int Add(Integer a) {
    int intA = 10;
    a += intA;
    return a;
  }
}
