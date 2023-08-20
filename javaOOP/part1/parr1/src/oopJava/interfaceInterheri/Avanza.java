package oopJava.interfaceInterheri;

public class Avanza implements car{

  public void drive() {
    System.out.println("drive avanza");
  }

  public int getTier() {
    return 4;
  }
  public String getBrand() {
    return "toyota";
  }  
  public boolean isMaintence() {
    return false;
  }

  public boolean isBig() {
    return true;
  }
}
