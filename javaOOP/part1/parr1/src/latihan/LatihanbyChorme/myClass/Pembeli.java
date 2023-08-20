package latihan.LatihanbyChorme.myClass;

public class Pembeli extends Orang {

  private int no;
  private String alamat;

  public String showTypeUser() {
    return "ini pembeli";
  }

  public Pembeli(String nama, String kota, int umur, int no, String alamat) {
    super(nama, kota, umur);
    this.no = no;
    this.alamat = alamat;
  }

  public void PrintUser() {
    super.PrintUser();
    System.out.println("no pembeli = "+this.no+" alamat pembeli = "+this.alamat);
  }

  public void setNo(int no) {
    this.no = no;
  }
  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public int getNo() {
    return this.no;
  }
  public String getAlamat() {
    return this.alamat;
  }
  
}
