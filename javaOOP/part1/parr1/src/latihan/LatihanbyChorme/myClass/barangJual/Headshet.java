package latihan.LatihanbyChorme.myClass.barangJual;

import oopJava.person;

public class Headshet extends Barang {
  private boolean blutut;
  private String warna;

  public String tampilkanJenisBarang() {
    return "ini headshet";
  }
  public Headshet(String nama, int harga, int stock,boolean blutut, String warna) {
    super(nama, harga, stock);
    this.warna = warna;
    this.blutut = blutut;
  }
  

  public void cekInfoBarang() {
    super.cekInfoBarang();
    System.out.println("headshet berwarna = "+this.warna+" type headshet blutut = "+this.blutut);
  }

  // setter
  public void setWarna(String warna) {
    this.warna = warna;
  }
  public void setBlutut(boolean blutut) {
    this.blutut = blutut;
  }

  // getter
  public String getWarna() {
    return this.warna;
  }
  public boolean getBlutut() {
    return this.blutut;
  }

}
