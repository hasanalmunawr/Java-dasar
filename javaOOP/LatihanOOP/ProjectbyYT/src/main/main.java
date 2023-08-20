package main;

import java.security.Key;

import myClass.Buyyer;
import myClass.Seller;
import myClass.Transaksi;
import myClass.Items.Keyboard;
import myClass.Items.Mouse;

public class main {
  public static void main(String[] args) {
    
    Keyboard key1 = new Keyboard("rexus keyboard", 20, "100.000", "rgb", 65);
    Keyboard key2 = new Keyboard("fantex keyboard", 13, "45.000", "white", 70);
    
    key1.cekInfoBarang();
    // key2.cekInfoBarang();

    Mouse mos1 = new Mouse("rexus Mouse", "90.000", 5, "Rexus", false);
    Mouse mos2 = new Mouse("fantex Mouse", "100.000", 4, "brum", true);

    mos1.cekInfoBarang();
    mos2.cekInfoBarang();

    // penjual
    Seller sell1 = new Seller("dadang", 20, "mele", 2);
    sell1.PrintUserInfo();

    // pembeli
    Buyyer buy1 = new Buyyer("hasan", 19, "mele",984513, "sarolangun");
    buy1.PrintUserInfo();

    // proses transaksi
    Transaksi tran1 = new Transaksi(sell1, buy1, mos2);
    Transaksi tran2 = new Transaksi(sell1, buy1, key2);

  }
  
}
