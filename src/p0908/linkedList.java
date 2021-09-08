package p0908;

import java.util.LinkedList;

/*
 * LinkedList - 데이터의 추가, 삭제, 삽입이 자주 발생하는 데이터를 다루기 위한 자료구조 클래스
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
      students.add(new Student("학생" + i));
    }

    for (int i = 0; i < students.size(); i++) {
      System.out.println(i + " : " + students.get(i).name);
    }

    // 검색
    System.out.println("========검색========");
    String search = "학생1";

    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).name.equals(search)) {
        System.out.println("해당 학생이 존재합니다.");
        break;
      }
    }

    // 삭제
    System.out.println("========삭제========");
    students.remove(9);
    for (int i = 0; i < students.size(); i++) {
      System.out.println(i + " : " + students.get(i).name);
    }
    
    // 삽입
    System.out.println("========삽입========");
    students.add(9, new Student("학생9"));
    for (int i = 0; i < students.size(); i++) {
      System.out.println(i + " : " + students.get(i).name);
    }
    

  }

}
