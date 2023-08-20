package oopJava.anonymusClass.staticMatery;

public class byInnerClass { //outer class tidak bisa menggunakan static
  private String nama;

  public void setNama(String nama) {
    this.nama = nama;
  }
  public String getNama() {
    return this.nama;
  }
  
  public static class dalamnya { //hanya inner class yang bisa menggunakan static
    private String nama;
  
    public void setNama(String nama) {
      this.nama = nama;
    }
    public String getNama() {
      return this.nama;
    }
    
  }
}
