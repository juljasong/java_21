package p0907;

/*
 * throws : ��� ���� ó���� try ~ catch �ȿ� �־� ó���ϱ⿡�� ������ ����
 * -> JVM ���� ���� ó�� Ŭ���� ����
 * 
 * ��ȯ�� �޼ҵ�() throws Exception { ... }
 * 
 */

public class throwsA {
  
  public static void main(String[] args) throws Exception {
    int a = 10;
    int result;
    
    result = a/0;
  }

}
