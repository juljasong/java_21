package p0907;

/*
 * 오버라이딩 : 부모 클래스의 메소드를 자식 클래스에서 다시 재정의하는 것
 * 
 * * 함수명, 매개변수, 리턴형이 같아야 함
 * 
 */

public class overriding {

  public static void main(String[] args) {
    
    F f = new F();
    System.out.println(f.Set(11));
    
    G g = new G();
    System.out.println(g.Set(11));
    
  }

}

class F {
  protected int f;
  public int Set(int b) {
    this.f = b;
    return this.f;
  }
}

class G extends F {
  public int Set(int b) {
     f = b + 1;
    return f;
  }
}