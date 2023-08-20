package myClass;

import myClass.Items.Item;

public class Transaksi {
  public Transaksi(Seller seller, Buyyer buyyer, Item item) {
    System.out.println("Seller = " + seller.getName() + "buyyer = " + buyyer.getName() + "Item = " + item.getItemName());
    
    int newStock = item.getStock() - 1;
    
    item.setStock(newStock);
  }
  
}
