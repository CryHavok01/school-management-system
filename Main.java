import java.util.ArrayList;
import java.util.List;

public class Main {
  
  public static void main(String[] args) {
    Teacher krabaple = new  Teacher(1, "Edna Krabaple", 15000);
    Teacher frizzle = new Teacher(2, "Ms. Frizzle", 20000);
    Teacher jones = new Teacher(3, "Dr. Jones", 25000);
    List<Teacher> teachersList = new ArrayList<Teacher>();
    teachersList.add(krabaple);
    teachersList.add(frizzle);
    teachersList.add(jones);

    Student jay = new Student(1, "Jay Mewes", 4);
    Student bob = new Student(2, "Silent Bob", 3);
    Student steve = new Student(3, "Steve Rogers", 9);
    List<Student> studentsList = new ArrayList<Student>();
    studentsList.add(jay);
    studentsList.add(bob);
    studentsList.add(steve);

    School springfieldElementary = new School(teachersList, studentsList);

    jay.payFees(15000);
    bob.payFees(5000);

    System.out.println(jay.getFeesPaid());
    System.out.println(springfieldElementary.payCycle());
    System.out.println(jay.getFeesPaid());

    steve.payFees(40000);
  }
}