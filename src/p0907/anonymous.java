package p0907;

/*
 * �͸� Ŭ���� : Ŭ�������� ���� Ŭ����
 * - �Ϲ� ���� Ŭ���� : �ܺ�Ŭ������$����Ŭ������.class
 * - �͸� Ŭ���� : �ܺ�Ŭ������$1.class
 * 
 * - ����� ������ ���ÿ� �̷����
 * - ��ȸ��
 * 
 * Ex)
 * 1. �������̽��� ����� Ŭ���� ����� �Ϲ����� ����
 * 2. �������̽��� ����� �͸� Ŭ������ �̿��� ����
 * 3. �͸� Ŭ������ �޼ҵ��� �Ű������� ����ϴ� �� 
 * 
 */

interface Testable {
  public void Print();
}

class InterfaceClass implements Testable {

  @Override
  public void Print() {
    System.out.println("InterfaceClass Print");
  }
  
}

class Class1 {
  public void Print() {
    System.out.println("Class1 Print");
  }
}

class Class2 {
  void SetClass(Class1 c1) {
    c1.Print();
  }
}

public class anonymous {
  
  public static void main(String[] args) {
    
    Class2 c2 = new Class2();
    c2.SetClass(new Class1());
    
    c2.SetClass(new Class1() {
      public void Print() {
        System.out.println("Class1 Print(2)");
      }
    });
    
    /*
    InterfaceClass inter = new InterfaceClass();
    inter.Print(); // �Ϲ����� Ŭ���� ȣ��
    
    Class1 c1 = new Class1();
    c1.Print();
   
    
    InterfaceClass test = new InterfaceClass() {
      public void Print() {
        System.out.println("test...");
      }
    };
    test.Print();
    
    
    Class1 c2 = new Class1() {
      public void Print() {
        System.out.println("test2...");
      }
    };
    c2.Print();
    
    
    Testable test2 = new Testable() {
      
      @Override
      public void Print() {
        System.out.println("test3...");
        
      }
    };
    test2.Print();
    */
    
  }

}


