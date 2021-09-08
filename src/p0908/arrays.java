package p0908;

import java.util.Arrays;

/*
 * Arrays
 * 
 * 배열을 정렬, 검색, 특정한 값으로 설정, 비교, 문자열 변환
 * -> 
 */

public class arrays {
  
  public static void main(String[] args) {
    
    int[] ints = {1, 4, 7, 2, 6, 3, 5};
    System.out.println("정렬 전 : " + Arrays.toString(ints));
    
    Arrays.sort(ints);
    System.out.println("정렬 후 : " + Arrays.toString(ints));
    
    System.out.println(Arrays.binarySearch(ints, 5)); // 존재 O -> Index(4)
    System.out.println(Arrays.binarySearch(ints, 9)); // 존재 X -> -8
    
    Arrays.fill(ints, 1, 3, 12);
    System.out.println("치환 결과 : " + Arrays.toString(ints)); // 치환 결과 : [1, 12, 12, 4, 5, 6, 7]

  }

}
