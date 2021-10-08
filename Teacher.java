public class Teacher {
  private int id;
  private String name;
  private int salary;

  public Teacher(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return this.salary;
  }

  public void setSalary(int newSalary) {
    this.salary = newSalary;
  }

  public void payRaise(int raiseAmt) {
    this.salary += raiseAmt;
  }

  public static void main(String[] args) {
    
  }
}
