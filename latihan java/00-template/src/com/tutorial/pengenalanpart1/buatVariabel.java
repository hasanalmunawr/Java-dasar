package com.tutorial.pengenalanpart1;

public class buatVariabel {
  public static void main(String[] args) {
    
    // variable di java hanya bisa di masukan satu type data saja

    final String nama ;
    nama = "hasan almunawar";
    int umur = 19;
    String asal = "jambi";


    System.out.println(nama);
    System.out.println(umur);
    System.out.println(asal);

    // mebuat variable dengan lebih mudah dengan 'var'

    var names = "dudung";
    var ageee = 13;
    var fromHome = "useee";

    System.out.println(names);
    System.out.println(ageee);
    System.out.println(fromHome);

    // type data bukan primitif 

    Integer angka = 12;
    Long angka2 = null;
    Boolean stag = true;
    Short iniShort; //null
    iniShort = 90;

    System.out.println(angka2);

    // mengkonfersi menjadi data bukan primitif 
    int angkaInt = 12;
    Integer newAngka = angkaInt;

    System.out.println(newAngka);

    int secondAngka = newAngka;

    System.out.println(secondAngka);

  }
  
}
