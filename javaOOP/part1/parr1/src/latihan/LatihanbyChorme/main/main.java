package latihan.LatihanbyChorme.main;

import latihan.LatihanbyChorme.myClass.Pembeli;
import latihan.LatihanbyChorme.myClass.Penjual;
import latihan.LatihanbyChorme.myClass.Transaksi;
import latihan.LatihanbyChorme.myClass.barangJual.Barang;
import latihan.LatihanbyChorme.myClass.barangJual.Hp;

public class main {
  public static void main(String[] args) {
    
    // tess
    Pembeli pbl1 = new Pembeli("hasan", "jambi", 19, 1234578, "desa bukit murau");
    Penjual pjl = new Penjual("dudung", "jogja", 20, 9);
    pbl1.PrintUser();
    pjl.PrintUser();

    Hp hp1 = new Hp("xiaomi", 1000, 9, "silver", 16);
    hp1.cekInfoBarang();

    Transaksi trs1 = new Transaksi(pjl, pbl1, hp1);

      
    


  } 
}
