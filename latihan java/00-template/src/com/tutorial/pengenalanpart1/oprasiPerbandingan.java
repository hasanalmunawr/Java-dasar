package com.tutorial.pengenalanpart1;

public class oprasiPerbandingan {
  public static void main(String[] args) {
    
    // operasi perbandingan angka
    int value1 = 10;
    int value2 = 10;

    System.out.println(value1 > value2);
    System.out.println(value1 < value2);
    System.out.println(value1 >= value2);
    System.out.println(value1 <= value2);
    System.out.println(value1 == value2);
    System.out.println(value1 != value2);

    // operasi boolean

    // operator &&
    // + && + = +
    // + && - = -
    // - && + = -
    // - && - = -
    
    //  && || !

    var absen = 78;
    var uas = 8;

    var nilaiAbsen = absen >= 75;
    var nilaiUas = uas >= 75;

    var hasil = nilaiAbsen && nilaiUas;

    System.out.println(hasil);
  }
  
}
