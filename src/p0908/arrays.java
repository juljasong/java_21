package p0908;

import java.util.Arrays;

/*
 * Arrays
 * 
 * �迭�� ����, �˻�, Ư���� ������ ����, ��, ���ڿ� ��ȯ
 * -> 
 */

public class arrays {
  
  public static void main(String[] args) {
    
    int[] ints = {1, 4, 7, 2, 6, 3, 5};
    System.out.println("���� �� : " + Arrays.toString(ints));
    
    Arrays.sort(ints);
    System.out.println("���� �� : " + Arrays.toString(ints));
    
    System.out.println(Arrays.binarySearch(ints, 5)); // ���� O -> Index(4)
    System.out.println(Arrays.binarySearch(ints, 9)); // ���� X -> -8
    
    Arrays.fill(ints, 1, 3, 12);
    System.out.println("ġȯ ��� : " + Arrays.toString(ints)); // ġȯ ��� : [1, 12, 12, 4, 5, 6, 7]

  }

}
