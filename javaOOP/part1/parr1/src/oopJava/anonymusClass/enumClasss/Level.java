package oopJava.anonymusClass.enumClasss;

public enum Level {
  STANDART("Standart Level",12309), //kebisaan enum huruf besar biar afdol:v
  PREMENIUM("Premenium Level",15901),
  VIP("Vip Level",134480);

  private String description;
  private int count;

  Level(String descrip,int count) {
    this.description = descrip;
    this.count = count;
  }
  public String getDescription() {
    return description;
  }
}
