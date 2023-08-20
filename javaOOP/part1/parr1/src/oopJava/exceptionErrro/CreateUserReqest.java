package oopJava.exceptionErrro;

public class CreateUserReqest {

  @NotBlanks
  private String Nama;
  @NotBlanks
  private String Paswword;

  // public CreateUserReqest(String nama, String paswword) {
  //   this.Nama = nama;
  //   this.Paswword = paswword;
  // }

  public void setNama(String Nama) {
    this.Nama = Nama;
  }
  public void setPaswword(String paswword) {
    this.Paswword = paswword;
  }
  public String getNama() {
    return Nama;
  }
  public String getPasword() {
    return Paswword;
  }
  
}
