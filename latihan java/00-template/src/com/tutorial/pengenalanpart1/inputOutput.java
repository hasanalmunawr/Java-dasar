package com.tutorial.pengenalanpart1;

import java.util.Scanner;

public class inputOutput {
  public static void main(String[] args) {
    
    Scanner UserInput = new Scanner(System.in);
    int panjang,lebar,nanya ;

    while (true) {
      System.out.print("masukan panjang e: " );
      panjang = UserInput.nextInt();

      System.out.print("masukan lebar nya: ");
      lebar = UserInput.nextInt();



      // int panjang = 10;
      // int lebar = 5;

      var luar = panjang * lebar;
      System.out.println(luar);

      System.out.print("apakah mau lanjut? \n1.mau\n 2.stop \n");
      nanya = UserInput.nextInt();

      if (nanya != 1){
        System.out.println("terima kasih");
        break;
      }


    }
  }
  
}
