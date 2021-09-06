package p0906;

public class array {
  
  /*
   * 배열 : 같은 변수명 + 같은 데이터형 + 다수의 변수 
   */
  
  public static void main(String[] args) {
    /*
    // 일차원 배열
    int array[] = {1, 2, 3}; // 선언과 동시에 초기화
    
    int a = 0;
    while(a < array.length) {
      System.out.print(array[a++] + " ");
    }
     
    System.out.println();
    
    int ints[] = new int[10];
    
    for (int i = 0 ; i < 10 ; i++) {
      ints[i] = i;
    }
    
    for (int i = 0 ; i < ints.length ; i++) {
      System.out.print(i + " ");
    }
    */
    // 이차원 배열
    
    // int ints2[][] = new int[3][];
    // ints2[0] = new int[2];
    // ints2[1] = new int[3];
    // ints2[2] = new int[5];
    //
    // int z = 0;
    //
    // for(int i = 0 ; i < ints2.length ; i++) {
    // for (int j = 0 ; j < ints2[i].length ; j++) {
    // ints2[i][j] = ++z;
    // }
    // }
    
    int ints2[][] = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10}};
    
    for(int i = 0 ; i < ints2.length ; i++) {
      for (int j = 0 ; j < ints2[i].length ; j++) {
        System.out.print(ints2[i][j] + " ");
      }
    }
    
  }

}
