package com.tutorial.project_gabutJava;

import java.util.Scanner;

public class kalkuFuncton {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int nilai1,nilai2,choice,nanya = 0;
    
    while (true) {
      // header
      System.out.println("KALKULATOR SEDERHANA BY JAVA");
      System.out.println("----------------------------");
      System.out.println("1.penjumlahan");
      System.out.println("2.pengurangan");
      System.out.println("3.perkalian");
      System.out.println("4.pembagian");
      System.out.println("5.sisa bagi");

      // pilihan operasi
      System.out.println("pilih jenis operasi: ");
      choice = input.nextInt();
      // input data

      System.out.println("masukan angka pertama: ");
      nilai1 = input.nextInt();

      System.out.println("masukan angka kedua: ");
      nilai2 = input.nextInt();

      // masih bocor
      switch(choice) {
        case 1:
        System.out.println("hasil= " + pertambahn(nilai1, nilai2));
        case 2:
        System.out.println("hasil= " + pengurangan(nilai1, nilai2));
        case 3:
        System.out.println("hasil= " + perkalian(nilai1, nilai2));
        case 4:
        System.out.println("hasil= " + pembagian(nilai1, nilai2));
        case 5:
        System.out.println("hasil= " + modulus(nilai1, nilai2));
      }

      System.out.println("mau Lanjut?\n 0.stop \n 1.lanjut");
      nanya = input.nextInt();

      //percabangan lanjut atau tidak
      if (nanya == 1) {
        continue;
      } else if(nanya == 0) {
        break;
      } else  {
        System.out.println("apoko");
      }
      


    }
      

  }

  // method Operasi
  static int pertambahn(int angka1, int angka2) {
    return angka1 + angka2;
  }
  static int pengurangan(int angka1, int angka2) {
    return angka1 - angka2;
  }
  static int perkalian(int angka1, int angka2) {
    return angka1 * angka2;
  }
  static int pembagian(int angka1, int angka2) {
    return angka1 / angka2;
  }
  static int modulus(int angka1, int angka2) {
    return angka1 % angka2;
  }
  
}
