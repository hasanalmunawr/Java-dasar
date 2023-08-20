package myClass;

public class Buyyer extends User { 
  private int no;
  private String addres;

  public String showTypeUser() {
    return "the Buyyer";
  }

  // METHOD
  // constractor
  public Buyyer(String name, int age, String gender, int no, String addres) {
    super(name, age, gender);
    this.no = no;
    this.addres = addres;
  }

  // mandatary method
  public void PrintUserInfo() {
    super.PrintUserInfo();
    System.out.println(", No = " + this.no + "Addres = " + this.addres);
  }

  // setter method
  public void setNo(int no) {
    this.no = no;
  }
  public void setAddres(String addres) {
    this.addres = addres;
  }

  // getter method
  public int getNO() {
    return this.no;
  }
  public String getAddres() {
    return this.addres;
  }
  
}
