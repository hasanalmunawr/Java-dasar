package myClass.Items;

public class Keyboard extends Item {
  private String backLight ;
  private int size;

  // overading method abstrak
  public String showTypeItem() {
    return "the keyboard";
  }

  // method
  public Keyboard(String itemName,int itemStock, String price, String backLight, int size) {
    super(itemName, price, itemStock);
    this.backLight = backLight;
    this.size = size;
  }

  // setter method
  public void setBackLight(String backLight) {
    this.backLight = backLight;
  }
  public void setSize(int size) {
    this.size = size;
  }

  // getter method
  public String getBackLight() {
    return this.backLight;
  }
  public int getSize() {
    return this.size;
  }

  @Override
  public void cekInfoBarang() {
    super.cekInfoBarang();;
    System.out.println("backLight =" + this.backLight + "\nsize keyboard =" + this.size + "\n");
  }
  
}
