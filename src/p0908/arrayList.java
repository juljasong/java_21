package p0908;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList
 * - Vector Ŭ������ ���׷��̵� �� Ŭ����
 * - �������� ������ ����
 * - �迭 + �޼ҵ�
 * - �⺻���� �״�� ��� ���������� ���׸��� ���
 * 
 * add, clear, get, remove, set, size, indexOf, ...
 * 
 */

public class arrayList {
  
  public static void main(String[] args) {
    
    ArrayList<Integer> ints = new ArrayList<>();
    for (int i = 10 ; i > 0 ; i--) {
      ints.add(i);
    }
    
    System.out.println(ints); // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    ints.set(0, 100); // index 0�� ���� 100���� ��ü
    
    Collections.sort(ints);
    System.out.println(ints); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    
    System.out.println(ints.get(4)); // 5
    System.out.println(ints.indexOf(100)); // 9
    
    System.out.println("������ : " + ints.size());
    
    ints.clear();
    System.out.println(ints);
    System.out.println("������ : " + ints.size());
    
    
    
  }

}
