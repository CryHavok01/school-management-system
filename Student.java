import jdk.nashorn.internal.objects.annotations.Getter;

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

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getGrade() {
    return this.grade;
  }

  public int getFeesPaid() {
    return this.feesPaid
  }

  public int getFeesRemaining() {
    return this.feesTotal - this.feesPaid;
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
