package p0908;

/*
 * String & StringBuffer
 * 
 * - ������ : ���ڿ��� �ٷ�� ��ü
 *
 * - ������ 
 *   1. String -> ���� ���ڿ�
 *   2. StringBuffer -> ���� ���ڿ�
 *   
 */

public class string {
  
  public static void main(String[] args) {
    
    // String
    String str1 = new String("ABC");
    String str2 = "abc";
    
    System.out.println(str1);
    System.out.println(str2);
    
    System.out.println(str1 += str2); // ABCabc
    System.out.println(str2.concat(str2)); //abcabc
    
    System.out.println(String.valueOf(3.14f)); // 3.14
    
    char[] strArray = {'a', 'b', 'c', 'd', 'e'};
    System.out.println(String.valueOf(strArray) + "�� ���� : " + String.valueOf(strArray).length()); // abcde�� ���� : 5
    
    // StringBuffer
    
    StringBuffer str3 = new StringBuffer("abcdefg"); 
    String str4 = "hijk"; // append(String/StringBuffer str) : ���ڿ��� ���� �߰�
    System.out.println(str3.append(str4) + "�� ���� : " + str3.append(str2).length());
    StringBuffer str5 = new StringBuffer(100);
    System.out.println(str5.append("abcdefghijklmn")); 
    
    // StringBuffer ��ü�� ����, ���� �޼ҵ� �̿��� ���ϸ� �����ϴ� ����
    
    StringBuffer file = new StringBuffer();
    System.out.println(file.append("test.txt"));
    
    file.delete(0, file.length() - 4); // delete(int start, int end : start�� ° ���� end-1 ��° ���� ���ڿ� ����
    System.out.println(file.insert(0, "success")); // insert(int offset, String str) : offset��°�� ���ڿ��� ����
    
  }

}
