package p0907;

/*
 * �������̵� : �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� �ٽ� �������ϴ� ��
 * 
 * * �Լ���, �Ű�����, �������� ���ƾ� ��
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