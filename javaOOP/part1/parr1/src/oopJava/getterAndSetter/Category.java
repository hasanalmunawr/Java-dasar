package oopJava.getterAndSetter;

public class Category {

  private String id;
  private boolean expensif; //2 field


  // membuat getter dan setter
  public String GetId() {
    return id;
  }
  
  public void SetId(String id) {
    if (id != null) {
      this.id = id;
    }
  }

  public boolean isExpensif() {
    return this.expensif;
  }

  public void setExpensif(boolean expensif) {
    this.expensif = expensif;
  }
}

