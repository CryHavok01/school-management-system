import java.util.List;

public class School {
  private List<Teacher> teachers;
  private List<Student> students;
  private int totalMoneyEarned;
  private int totalMoneySpent;

  public School(List<Teacher> teachers, List<Student> students) {
    this.teachers = teachers;
    this.students = students;
    totalMoneyEarned = 0;
    totalMoneySpent = 0;
  }

  public List<Teacher> getTeachers() {
    return this.teachers;
  }
  public List<Student> getStudents() {
    return this.students;
  }
  public int getTotalMoneyEarned() {
    return this.totalMoneyEarned;
  }
  public int getTotalMoneySpent() {
    return this.totalMoneySpent;
  }

  public void setTotalMoneyEarned(int totalMoneyEarned) {
    this.totalMoneyEarned = totalMoneyEarned;
  }
  public void setTotalMoneySpent(int totalMoneySpent) {
    this.totalMoneySpent = totalMoneySpent;
  }

  public void addTeacher(Teacher newTeacher) {
    this.teachers.add(newTeacher);
  }
  public void addStudent(Student newStudent) {
    this.students.add(newStudent);
  }

  public static void main(String[] args) {
    
  }
}
