package latihan.LatihanbyChorme.myClass;

import latihan.LatihanbyChorme.myClass.barangJual.Barang;

public class Transaksi {

  public Transaksi(Penjual penjual, Pembeli pembeli, Barang barang) {
    System.out.println("Penjual = "+ penjual.getNama()+"Pembeli = "+ pembeli.getNama()+" Barang yang di beli = "+barang.getNamaBarang());

    int stockBaru = barang.getStock() - 1;

    barang.setStock(stockBaru);

  }
  
}
