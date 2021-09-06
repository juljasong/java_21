package p0906;


public class iteration {
  public static void main(String[] args) {

    // 반복문
    
    for(int i = 0 ; i < 3 ; i++) {
      if (i == 1) continue; // continue : i가 1인 경우 반복문의 맨 앞으로
      System.out.println(i);
    }
    
    int j = 0;
    while (j < 5) {
      if (j == 3) break; // break : j가 3인 경우 반복문 빠져나옴
      System.out.println(j++);
    }

    
    int x = 0;
    OUT : while(true)  {
      while (true) {
        if (x == 3) {
          System.out.println("BREAK");
          break OUT;
        } else {
          System.out.println(x++);
        }
      }
    }

    // 한 번은 실행함
    int k = 0;
    do {
      System.out.println(k++);
    }while(k < 3);
    
    // 선택문
    
    int a = 12;
    int b = 24;
    
    if (a == b) {
      System.out.println("Pass");
    } else if (a*2 == b) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
    
    switch(a) {
      case 1 : System.out.println("1"); break;
      case 12 : System.out.println("12"); break;
      default : System.out.println("00"); 
    }

    
  }

}
