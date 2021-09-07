package p0907;

/*
 * static inner class
 * 
 */

public class staticInner {
  
  public static void main(String[] args) {
    OutClass.InnerClass.Print();
  }

}

class OutClass {
  static int a = 3;
  static class InnerClass {  
    
    static void Print() {
      System.out.println("static inner class");
      System.out.println("out class static a : " + a);
    }
    
  }
  
}