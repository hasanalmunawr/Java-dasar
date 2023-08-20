package latihan.LatihanbyChorme.myClass.barangJual;

public abstract class Barang {
  private String namaBarang;
  private int harga;
  private int stockBarang;

  public abstract String tampilkanJenisBarang();

  public Barang() {}

  public Barang(String namaBarang) {
    this.namaBarang = namaBarang;
  }
  public Barang(String namaBarang, int harga) {
    this.namaBarang = namaBarang;
    this.harga = harga;
  }
  public Barang(String namaBarang, int harga, int stock) {
    this.namaBarang = namaBarang;
    this.harga = harga;
    this.stockBarang = stock;
  }

  public void tambahStock() {
    stockBarang =+ 1;
    System.out.println("berhasil menambah stock menjadi = "+stockBarang);
  }
  public void menambahStock(int stk) {
    stockBarang += stk;
    System.out.println("berhasil menambahkan barang menjadi = "+ stockBarang);

  }
  
  public void kurangStock() {
    stockBarang -= 1;
    System.out.println("berkurang stock menjadi = "+stockBarang);
  }
  public void mengurangStock(int stk) {
    stockBarang -= stk;
    System.out.println("mengurang barang menjadi = "+ stockBarang);
  }
  
  public boolean cekStock(boolean status) {
    if (status) {
      if (stockBarang > 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public void cekInfoBarang() {
    System.out.println("name barang = " + this.namaBarang + "\nharga barang = Rp." +this.harga);
  }

  // setter
  public void setNamaBarang(String nama) {
    this.namaBarang = nama;
  }
  public void setHarga(int harga) {
    this.harga = harga;
  }
  public void setStock(int stock) {
    this.stockBarang = stock;
  }

  // getter
  public String getNamaBarang() {
    return this.namaBarang;
  }
  public int getHarga() {
    return this.harga;
  }
  public int getStock() {
    return this.stockBarang;
  }
}
