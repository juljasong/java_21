package p0907;

/*
 * ���� ó�� : ���α׷� ���� ���� �߻��ϴ� ������ ó���ϱ� ���� �κ�
 * 
 * ���� : ���� �Ұ�
 * ���� : ���� ����, �˷��ִ� ����
 * 
 * Ű���� : try catch finally throws
 * 
 */

public class exception {
  
  public static void main(String[] args) {
    
    int a = 10;
    int result;
    
    try {
      // ������ �߻��� �� �ִ� �ڵ�
      //result = a/0;
      System.out.println("Success!");
    } catch (ArithmeticException e) { // 0���� ���� ��
      // ������ �߻����� �� ������ �ڵ�
      System.out.println("Failed..");
    } finally { 
      // ���� ó���� ��� ���� �׻� �����ؾ� �ϴ� ����\
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
