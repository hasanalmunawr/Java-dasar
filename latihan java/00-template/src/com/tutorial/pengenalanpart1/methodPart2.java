package com.tutorial.pengenalanpart1;

import javax.naming.spi.DirStateFactory.Result;
import java.lang.String;
import java.util.Scanner;

public class methodPart2 {
  public static void main(String[] args) {
    
    sayHello();
    sayHello("hasan");
    sayHello("hasan", "almunawar");
    sayHello("hasan", "basri", "agus");

    System.out.println(factorial(5));   
    System.out.println(factorialRecursive(5)); 
    // loop(10000);
    // rekursif(1);
    
    Scanner InputUser = new Scanner(System.in);
    System.out.println("masukan nilai fibonnaci");
    int nilai = InputUser.nextInt();

    int nilaiFobinacci = fibonnacci(nilai, "atas");
    System.out.println("nilai fibo nya " + nilaiFobinacci);



    
  }

  static void sayHello() {
    System.out.println("hallo teman teman");

  }

  static void sayHello(String nama) {
    System.out.println("halo " + nama);
  }

  static void sayHello(String firstName, String lastName) {
    System.out.println("halo " + firstName + lastName);
  }

  static void sayHello(String pertama, String kedua, String ketiga) {
    System.out.println("halo" + pertama + kedua + ketiga);
  }
  

  // recursive method di java

  /**studi kasus
   * membuat faktorial loop
   */
  // tanpa menggunakan method recursive
   static int factorial(int value) {
    var result = 1;
    for (int angka = 1; angka <= value; angka++ ) {
      result *= angka;
    }
    return result;
   }

  //  menggunakan recursive method
   private static int factorialRecursive(int value) {
    if (value == 1) {
      return 1;
    } else {
      return value * factorialRecursive( value - 1);
    }
   }

  //  tes error stuckOverFlow
  // static void loop(int value) {
  //   if ( value == 0) {
  //     System.out.println("program anda selesai");

  //   }else {
  //     System.out.println("loop-" + value);
  //     loop( value - 1);
  //   }
  // }

  // rekursif method dari kelas terbuka
  //  static void rekursif(int angkaBaseng) {
  //   System.out.println("angkanya adalah" + angkaBaseng);
  //   if (angkaBaseng == 20) {
  //     return;
  //   }
  //   angkaBaseng++;
  //   rekursif(angkaBaseng);
  // }


  // rekursfi bercabang by kelas terbuka
  public static int fibonnacci(int n, String daun) {
    System.out.println("daun" + daun);
    System.out.println("fibonacci ke" + n);
    if (n ==1 || n == 0) {
      return n;
    }else {

      return fibonnacci(n-1,"kiri") + fibonnacci(n-2,"kanan");
    }
    // tidak efektif untuk angka besar besar, akan membuat memori komputer berat
    
  }
}
