package latihan.LatihanbyChorme.myClass;

abstract class Orang {
  private String nama,kota;
  private int umur;

  public abstract String showTypeUser();
  
  // constraktor
  public Orang(String nama, String kota, int umur) {
    this.nama = nama;
    this.kota = kota;
    this.umur = umur;
  }

  public void PrintUser() {
    System.out.println("Nama = "+this.nama+ " Kota = "+this.kota+" Umur = "+this.umur);

  }

  // setter
  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setKota(String kota) {
    this.kota = kota;
  }
  public void setUmur(int umur) {
    this.umur = umur;
  }

  // getter
  public String getNama() {
    return this.nama;
  }
  public String getKota(){
    return this.kota;
  }
  public int getUmur() {
    return this.umur;
  }



  
}
