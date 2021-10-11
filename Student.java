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
    return this.feesPaid;
  }

  public int getFeesRemaining() {
    return this.feesTotal - this.feesPaid;
  }

  public void setGrade(int newGrade) {
    this.grade = newGrade;
  }

  public void resetFeesPaid() {
    this.feesPaid = 0;
  }

  public void updateFeesTotal() {
    this.feesTotal = this.getFeesRemaining();
  }

  public void payFees(int payment) {
    if (payment > this.feesTotal) {
      this.feesPaid = this.feesTotal;
      System.out.println("Fees fully paid.  Refund total: " + (payment - this.feesTotal));
    }
    this.feesPaid += payment;
  }

  public String toString() {
    return "Student #1: " + this.name + " has paid " + this.feesPaid + " of their " + this.feesTotal + " total fees";
  }

  public static void main(String[] args) {
    
  }
}
