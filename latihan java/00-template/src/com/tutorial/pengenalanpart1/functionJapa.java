package com.tutorial.pengenalanpart1;

import javax.sql.rowset.spi.SyncFactory;

public class functionJapa {
public static void main(String[] args) {
  
  
  sayHelloWorld();
  menyapa("hasan", " ganteng");

  var a = 10;
  var b = 5;
  var c = Jumlah(a, b);
  System.out.println("hasil dari"+ a +"+" + b +"="+ c);
  System.out.println(Jumlah(200, 300));

  var kalku = hitung(12, "+", 23);
  System.out.println(kalku);
  System.out.println(hitung(12, "lah", 43));

  var namaKu = "hasan";
  int[] nileKu = {
    87,89,76,98,75
  } ;
  sayCongrast(namaKu, nileKu);
  sayCongrast("hasan", 23,34,90,90,90,90,90);
}

  // metdhod/function sederhana
  static void sayHelloWorld() {
    System.out.println("hallo dunia satu");
    System.out.println("hallo dunia dua");
  }
  
  // metdhod/function dengan parameter
  static void menyapa(String nama, String pujian) {
    System.out.println("hallo "+nama + ", kamu koo"+pujian);

  }
  
  // method/function dengan return
  // 'void' tidak mengembalikan value
  static int Jumlah(int value1,int value2) {
    var hasil = value1 + value2;
    return hasil;
  }
  
  // example 
  static int hitung(int value1, String operasi, int value2) {
    switch(operasi) {
      case "+":
       return value1 + value2;
      case "-":
        return value1 - value2;
      default:
      return 0;

    } 
  }

  // menthod variable argument

  // kode tanpa variable argument
  // static void sayCongrast(String nama, int[] values) {

  // kode dengan menggunakan variable argument
  static void sayCongrast(String nama, int...values) {

    int total = 0;
    for (var valu : values) {
      total += valu; 

    }
    int finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("selamat " + nama + " ,anda lulus");
    } else {
      System.out.println("maaf " + nama + " ,anda tidak lulus");
    }
  }

}
