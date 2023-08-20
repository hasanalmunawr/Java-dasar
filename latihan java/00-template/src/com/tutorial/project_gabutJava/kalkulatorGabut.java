package com.tutorial.project_gabutJava;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class kalkulatorGabut {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int numbers1,numbers2,choice, Result = 0;

    // header
    System.out.println("Progra Kalkulator Sederhana ");
    System.out.println("1.penjumlahan");
    System.out.println("2.pengurangan");
    System.out.println("3.perkalian");
    System.out.println("4.pembagian");
    System.out.println("5.sisa bagi");
    System.out.println("-------------------");

    // input data
    System.out.print("masukan angka pertama: ");
    numbers1 = input.nextInt();

    System.out.print("masukan angka kedua: ");
    numbers2 = input.nextInt();

    // pilih operasi
    System.out.print("masukan operasi: ");
    choice = input.nextInt();

    // program dikelola
    switch (choice) {
      case 1 :Result = numbers1 + numbers2; break;
      case 2 :Result = numbers1 - numbers2; break;
      case 3 :Result = numbers1 * numbers2; break;
      case 4 :Result = numbers1 / numbers2; break;
      case 5 :Result = numbers1 % numbers2; break;
      
      default:
      System.out.println("Salah masukan, silahkan masukan dengan benar!");

    }

    System.out.println("hasil: " + Result);


  }

}
