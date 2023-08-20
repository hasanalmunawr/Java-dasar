package myClass.Items;

public abstract class Item {
  // property
  private String itemName;
  private String price;
  private int itemStock;

  public abstract String showTypeItem();

  // contractor
  public Item(){}

  public Item(String itemName) {
    this.itemName = itemName;
  }

  public Item(String itemName, String price) {
    this.itemName = itemName;
    this.price = price;
  }

  public Item(String itemName, String price, int itemStock) {
    this.itemName = itemName;
    this.price = price;
    this.itemStock = itemStock;
  }

  // mandatary method
  public void AddStock() {
    itemStock += 1;
    System.out.println("succes append new stock become = " + itemStock);
  }
  public void appendStock(int jmlstk) {
    itemStock += jmlstk;
    System.out.println("succes append new stock become = " + itemStock);
  }
  
  public void kurangStock() {
    itemStock -= 1;
    System.out.println("succes kurang new stock become = " + itemStock);
  }
  public void kurangStock(int jumlhstk) {
    itemStock -= jumlhstk;
    System.out.println("succes kurang new stock become = " + itemStock);
  }

  // ask about stock
  public boolean cekStock() {
    return itemStock > 0 ;
  }
  public boolean cekStock(boolean status) {
    if (status) {
      if (itemStock > 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public void cekInfoBarang() {
    System.out.println("name items =" + this.itemName + "\npriceItem =Rp." +this.price);
  }

  // setter
  public void setItemName(String name) {
    this.itemName = name;
  }
  public void setPrice(String price) {
    this.price = price;
  }
  public void setStock(int stock) {
    this.itemStock = stock;
  }

  // getter 
  public String getItemName() {
    return this.itemName;
  }
  public String getPrice() {
    return this.price;
  }
  public int getStock() {
    return this.itemStock;
  }

}
