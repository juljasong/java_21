package p0906;


public class iteration {
  public static void main(String[] args) {

    // �ݺ���
    
    for(int i = 0 ; i < 3 ; i++) {
      if (i == 1) continue; // continue : i�� 1�� ��� �ݺ����� �� ������
      System.out.println(i);
    }
    
    int j = 0;
    while (j < 5) {
      if (j == 3) break; // break : j�� 3�� ��� �ݺ��� ��������
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

    // �� ���� ������
    int k = 0;
    do {
      System.out.println(k++);
    }while(k < 3);
    
    // ���ù�
    
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
