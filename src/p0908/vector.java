package p0908;

import java.util.Vector;

/*
 * Vector Class
 * - 기존의 배열의 단점을 보완
 * - 유동적인 데이터 저장
 * - 베열 + 메소드
 * - 기본형은 wrapper 클래스로 변환하여 저장
 * 
 */

public class vector {
  
  public static void main(String[] args) {
    Vector v = new Vector();
    v.addElement(new Integer(99));
    v.addElement(new Float(3.14f));
    v.addElement("Hello World");
    System.out.println(v);
    System.out.println(v.elementAt(2));
    
    int a = (int)v.firstElement();
    System.out.println(a);
    
    System.out.println("저장된 객체 개수 : " + v.size());
    
    Vector<String> vString = new Vector<>();
    vString.add("Hello"); // 0
    vString.add("My"); // 1
    vString.add("name"); // 2
    vString.add("is..."); // 3 
    
    System.out.println(vString);
    
    System.out.println(vString.get(3));
    System.out.println(vString.indexOf("My"));
    System.out.println(vString.get(2));
    
  }

}
