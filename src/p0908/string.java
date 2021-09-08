package p0908;

/*
 * String & StringBuffer
 * 
 * - 공통점 : 문자열을 다루는 객체
 *
 * - 차이점 
 *   1. String -> 고정 문자열
 *   2. StringBuffer -> 유동 문자열
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
    System.out.println(String.valueOf(strArray) + "의 길이 : " + String.valueOf(strArray).length()); // abcde의 길이 : 5
    
    // StringBuffer
    
    StringBuffer str3 = new StringBuffer("abcdefg"); 
    String str4 = "hijk"; // append(String/StringBuffer str) : 문자열을 끝에 추가
    System.out.println(str3.append(str4) + "의 길이 : " + str3.append(str2).length());
    StringBuffer str5 = new StringBuffer(100);
    System.out.println(str5.append("abcdefghijklmn")); 
    
    // StringBuffer 객체의 삽입, 삭제 메소드 이용한 파일명 변경하는 예제
    
    StringBuffer file = new StringBuffer();
    System.out.println(file.append("test.txt"));
    
    file.delete(0, file.length() - 4); // delete(int start, int end : start번 째 부터 end-1 번째 까지 문자열 삭제
    System.out.println(file.insert(0, "success")); // insert(int offset, String str) : offset번째에 문자열을 삽입
    
  }

}
