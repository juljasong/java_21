package p0908;

import java.util.LinkedList;

/*
 * LinkedList - �������� �߰�, ����, ������ ���� �߻��ϴ� �����͸� �ٷ�� ���� �ڷᱸ�� Ŭ����
 * 
 * add(First/Last), get(First/Last), remove(First/Last), clear, set, size, indexOf
 */

public class linkedList {

  public static void main(String[] args) {

    class Student {
      String name;

      public Student(String str) {
        this.name = str;
      }
    }

    LinkedList<Student> students = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      students.add(new Student("�л�" + i));
    }

    for (int i = 0; i < students.size(); i++) {
      System.out.println(i + " : " + students.get(i).name);
    }

    // �˻�
    System.out.println("========�˻�========");
    String search = "�л�1";

    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).name.equals(search)) {
        System.out.println("�ش� �л��� �����մϴ�.");
        break;
      }
    }

    // ����
    System.out.println("========����========");
    students.remove(9);
    for (int i = 0; i < students.size(); i++) {
      System.out.println(i + " : " + students.get(i).name);
    }
    
    // ����
    System.out.println("========����========");
    students.add(9, new Student("�л�9"));
    for (int i = 0; i < students.size(); i++) {
      System.out.println(i + " : " + students.get(i).name);
    }
    

  }

}
