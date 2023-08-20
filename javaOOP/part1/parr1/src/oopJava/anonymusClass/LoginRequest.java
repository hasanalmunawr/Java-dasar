package oopJava.anonymusClass;

public record LoginRequest(String username, String pasword) { //langsung constraktor
  // data tidak bisa di rubah, di set final
  // record tidak bisa ekstend, cuma boleh emplement , di khusus kan menyimpa data
  // compact constraktor
  public LoginRequest {
    System.out.println("membuat object login reqeust");
  }

  public LoginRequest(String username) {
    this(username, " "); //wajib manggil constraktor utama
  }

  public LoginRequest() {
    this(" ", " "); //otot,atis akan menjadi field
  }

  public void setUsername(String username) {
  }

}
