package p0908;


/*
 * wrapper Ŭ���� : �⺻ ���������� ��ü�� �ٷ� �� �ֵ��� ��
 * 
 * �⺻ �������� + �޼ҵ�
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
     * 1. wrapper ��ü�� �� ������ ��ȯ�� �ڵ����� ó��
     * 2. ���� wrapper Ŭ������ �޼ҵ带 �����ϰ� ����� �� ����
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
