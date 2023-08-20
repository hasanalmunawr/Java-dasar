package latihan.LatihanbyChorme.myClass.barangJual;

public class Hp extends Barang {

  private String warna;
  private int ram;

  public String tampilkanJenisBarang() {
    return "ini hp";
  }

  public Hp(String nama, int harga, int stock, String warna, int ram) {
    super(nama, harga, stock);
    this.warna = warna;
    this.ram = ram;
  }

  public void cekInfoBarang() {
    super.cekInfoBarang();
    System.out.println("hp berwarna = "+ this.warna+" memiliki variant ram = "+ this.ram);
  }

  // setter
  public void setWarna(String warna) {
    this.warna = warna;
  }
  public void setRam(int ram) {
    this.ram = ram;
  }

  // getter
  public String getWarna() {
    return this.warna;
  }
  public int getRam() {
    return this.ram;
  }
  
}
