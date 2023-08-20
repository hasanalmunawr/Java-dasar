package com.tutorial.pengenalanpart1;

public class forLanjutan {
  public static void main(String[] args) {
    
    
      // tanpa for each 
      String[] nama = {
        "hasan","dudung","dadang",
        "toto","opi","aan"
      };
      
      for (var i = 0; i < nama.length; i++) {
      System.out.println(nama[i]);
    }
    System.out.println("\n");

      // dengan for each lebih menjadi pendek dan mudah
      for (var value: nama) { //secara muda nya sperti for i in variabel
        System.out.println(value);
      }
  }
}
