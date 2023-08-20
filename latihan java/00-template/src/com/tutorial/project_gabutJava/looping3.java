package com.tutorial.project_gabutJava;

import java.util.Scanner;

public class looping3 {
  public static void main(String[] args) {

    Scanner InputUser = new Scanner(System.in );
    
    // membuat segitiga menggunakan looping

    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5 ; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.println("\n");

    // 
    for(int i = 0; i < 5;i++) {
      for ( int j = 0; j < 5;j++) {
        System.out.print("* ");
        if(i==j) {
          break;
        }
      }
      System.out.print("\n");
    }
    // System.out.println("\n");
    // 
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5 ; j++) {
        System.out.print("* ");
        if ((i+j)==4) {

           break;

        }
      }
      System.out.print("\n");
    }

    System.out.println("\n");

    // PR membuat ketupat dengan menggunakan rumus di atas 
    System.out.println("masukan rows nya: ");
    int rows = InputUser.nextInt();

    
    for(int i=0; i<rows;i++) {
      // print spasi
      for(int j= rows; j< i; j--) {
        System.out.print(" ");
      // potong garis
      for (int k =1; k <=(i*2)-1;k++) {
        System.out.print("* ");
      }
      System.out.print("");
        
      }
      for (int l = rows-1; l>=1;i-- ){
        System.out.print(" ");
      }
      // print pola
      for (int m = 0; m <=(i*2)-1;m++)
      System.out.print("* ");
    }
    System.out.print("");
    
  }
  // Scanner.close();
  
}
