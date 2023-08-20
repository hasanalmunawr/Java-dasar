package com.tutorial.pengenalanpart1;

public class ternatyOperator {
  public static void main(String[] args) {
    
    // menggunakan if else
    var nilai = 70;
    String ucapan;
    if (nilai >= 75) {
      ucapan = "selamat lulus kkm";
    } else {
      ucapan = "maaf anda di bawah kkm";
    };
    System.out.println(ucapan);
    
    
    // dengan menggunakan tenary operator
    var nile = 70;
    String said = nile >= 75 ? "selamat lulus" : "silahkan coba lagi" ; //only 2 statment

    System.out.println(said);
  }
  
}
