package myClass.Items;

public class Mouse extends Item { 
  // PROPERTY
  private String color;
  private boolean whirles;

  //overide method abstrak 
  public String showTypeItem() {
    return "the Mouse";
  }

  public Mouse(String itemName, String price, int stockItem, String color, boolean whirles) {
    super(itemName, price, stockItem);
    this.color = color;
    this.whirles = whirles;
  }

  // setter method
  public void setcolor(String color) {
    this.color = color;
  }
  public void setWhirles(boolean whirles) {
    this.whirles = whirles;
  }

  // getter method
  public String getcolor() {
    return this.color;
  }
  public boolean getWhirles() {
    return this.whirles;
  }

  @Override
  public void  cekInfoBarang() {
    super.cekInfoBarang();
    System.out.println("color Mouse =" + this.color + "\ntipe whirles =" + this.whirles + "\n");
  }

  
}
