package p0908;

import java.util.Vector;

/*
 * Vector Class
 * - ������ �迭�� ������ ����
 * - �������� ������ ����
 * - ���� + �޼ҵ�
 * - �⺻���� wrapper Ŭ������ ��ȯ�Ͽ� ����
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
    
    System.out.println("����� ��ü ���� : " + v.size());
    
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
