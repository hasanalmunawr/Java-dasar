package com.tutorial.latihanJava;

import java.util.Scanner;

public class arrayTerbesar {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("PROGRAM JAVA MENCARI NILAI TERBESAR DI ARRAY");

    int[] arr = new int[100];
    int arrCount, i, maxNum;

    System.out.print("input jumlah elemen array = ");
    arrCount = input.nextInt();

    System.out.print("input " + arrCount + " angka (dipisah dengan enter)");

    // simpan setiap angka yang di imput ke dalam array
    for (i = 0; i < arrCount; i++) {
      arr[i] = input.nextInt();
    }
    System.out.println();

    maxNum = arr[0];
    // proses mencari nilai terbesar
    for (i = 0; i < arrCount; i++) {
      if (arr[i] > maxNum) {
        maxNum = arr[i];
      }
    }
    System.out.println("angka terbesar adalah " + maxNum);
    
  }
}
