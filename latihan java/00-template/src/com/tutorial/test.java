package com.tutorial;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {

    // program membuat gambar dan hitung persegi
    Scanner InputUser = new Scanner(System.in);
    int inputPanjang, inputLebar;

    // proses ambil inputan
    System.out.print("masukan panjang yang di inginkan= ");
    inputPanjang = InputUser.nextInt();

    System.out.print("masukan lebar yang diinginkan= ");
    inputLebar = InputUser.nextInt();

    // proses gambar
    gambar(inputPanjang, inputLebar);

    // hitung luas dari gambar nya
    System.out.println("luas dari gambar di atas = " + hitungLuas(inputPanjang, inputLebar));

    // hitung keliling dari gambar
    System.out.println("keliling dari gambar di atas = " + hitungKeliling(inputPanjang, inputLebar));
  }

  private static void gambar(int panjang, int lebar) {
    for (int i = 0; i < panjang; i++) {
      for (int j = 0; j < lebar; j++) {
        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }

  private static int hitungLuas(int panjang, int lebar) {
    int hasilLuas = panjang * lebar;
    return  hasilLuas ;
  }

  private static int hitungKeliling(int panjang, int lebar) {
    int hasilKeliling = (panjang + lebar) * 2;
    return hasilKeliling;
  }
  
}
