package oopJava.anonymusClass.enumClasss;

public class Costumer {
  private String name;
  private Level level;

  public Costumer(String name, Level level) {
    this.name = name;
    this.level = level;
  }

  public String getNama() {
    return name.toUpperCase();
  }
  // public void setName(String name) {
  //   this.name = name;
  // }
  
  public Level getLevel() {
    return this.level;
  }
  // public void setLevel(Level level) {
  //   this.level = level;
  // }

  
}

