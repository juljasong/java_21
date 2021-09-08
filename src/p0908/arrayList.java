package p0908;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList
 * - Vector 클래스의 업그레이드 된 클래스
 * - 유동적인 데이터 저장
 * - 배열 + 메소드
 * - 기본형은 그대로 사용 가능하지만 제네릭스 사용
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
    ints.set(0, 100); // index 0의 값을 100으로 대체
    
    Collections.sort(ints);
    System.out.println(ints); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    
    System.out.println(ints.get(4)); // 5
    System.out.println(ints.indexOf(100)); // 9
    
    System.out.println("사이즈 : " + ints.size());
    
    ints.clear();
    System.out.println(ints);
    System.out.println("사이즈 : " + ints.size());
    
    
    
  }

}
