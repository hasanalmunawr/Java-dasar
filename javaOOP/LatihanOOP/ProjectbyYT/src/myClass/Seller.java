package myClass;

public class Seller extends User{

  //Property
  private int longWork;

  public String showTypeUser() {
    return "the Seller";
  }
  
  //METHOD
  //method Constructor
  public Seller(String name, int age, String gender,int longWork) {
    super(name, age, gender);
    this.longWork = longWork;
  }

  //mandatary method
  public void PrintUserInfo() {
    super.PrintUserInfo();
    System.out.println(", For work Years = " + this.longWork + "Years \n");
  }

  // setter method
  public void setLongwWork(int longWork) {
    this.longWork = longWork;
  }

  // getter method
  public int getLongWork() {
    return this.longWork;
  }
}
