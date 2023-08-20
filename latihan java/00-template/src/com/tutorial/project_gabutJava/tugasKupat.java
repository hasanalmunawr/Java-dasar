package com.tutorial.project_gabutJava;

import java.util.Scanner;

public class tugasKupat {
  public static void main(String[] args) {

    Scanner inputUser = new Scanner(System.in);

    System.out.print("masukan mau berapa besar ketupatnya = ");
    int besar = inputUser.nextInt();

    int tengah = besar / 2;
    int luas = besar * 2;

    for (int i = 0; i < besar; i++) {
      for (int j = 0; j < besar; j++) {
        if ((i+j) > 12) {
          break;
        }else if ((j >= tengah) && (j-i) > tengah) {
          break;
        }else if ((j <= tengah) && (i+j) < tengah) {
          System.out.print("  ");
          continue;
        }else if ((i >= tengah) && (i-j) > tengah) {
          System.out.print("  ");
          continue;
        }
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
  
}
