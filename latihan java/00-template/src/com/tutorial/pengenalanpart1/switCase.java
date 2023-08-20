package com.tutorial.pengenalanpart1;

public class switCase {
  public static void main(String[] args) {
    
    // membuat switch di java

    var nilai = "A";

    switch (nilai) {

      case "A":
      System.out.println("bagus banget");
      break;

      case "B":
      System.out.println("bagus");
      break;

      case "C":
      System.out.println("cukup bagus");
      break;

      // default:
      // System.out.println("maaf anda tidak lulus");

    }

    // membuat lebih singkat 

    switch(nilai) {
      case "A" -> System.out.println("A");
      case "B","c" -> System.out.println("B dan C");
      // default -> System.out.println("maap banget nie yeee");
    }

    // tanpa menggunakan kata kunci yield -> java version 14+ dan wajib memeiliki default

    var angka = "b";
    String ucapan;

    switch (angka) {
      case "a" -> ucapan = "keren juga lu bro";
      case "b" -> ucapan = "oke lah";
      case "c" -> ucapan = "lumayan tong";
      default -> ucapan = "sorry to say broh";
    }

    System.out.println(ucapan);

    // dengan kata kunci yeild
    var namo = "a";
    String selamat = switch (namo) {
      case "a":
        yield "helo a";
      case "b","c":
        yield "akhirnyaa";
      default:
      yield "apa bro";
    };
    System.out.println(selamat);

    // tugas buatlah menu pilihan daftar makan siang dan malam

    var MakanSiang = "satu";
    var makanMalam = "empat";
    switch (MakanSiang) {
      case "satu":
      System.out.println("nasi goreng");
      break;
      case "dua":
      System.out.println("lontong");
      break;
      case "tiga":
      System.out.println("soto");
      break;
    }

    switch (makanMalam) {
      case "satu" -> System.out.println("bakso malang");
      case "dua","tiga" -> System.out.println("mie balap dan tekwan");
      case "empat" -> System.out.println("tahu tok tok");
    }
  }
  
}
