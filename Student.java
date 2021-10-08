public class Student {
  private int id;
  private String name;
  private int grade;
  private int feesTotal;
  private int feesPaid;

  public Student(int id, String name, int grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
    feesTotal = 30000;
    feesPaid = 0;
  }

  public void setGrade(int newGrade) {
    this.grade = newGrade;
  }

  public void payFees(int payment) {
    this.feesPaid += payment;
  }

  public static void main(String[] args) {
    
  }
}
