package com.tutorial.pengenalanpart1;

public class formatString {

  public static void main(String[] args) {
    
    String nama = "hasan";
    int umur = 19;

    // secara umum
    System.out.println("nama nya adalah " + nama+ " dan umur nya sekarang " + umur);

    /*MACAM MACAM STRING YANG SERING DI GUNAKAN PADA JAVA
     *  %d = interger
     *  %s = string
     *  %b = boolean
     */
    // menggunakan format string
    System.out.printf("nama nya itu %s dan umur nya itu %d", nama,umur);

    // memanggil format string berkali-kali
    // ex output(hasan adalam nama hasan, hasan adalah nama hasan yang pertama)
    System.out.printf(" \n%1$s adalah nama %1$s ,%1$s adalah nama pertama dari %1$s",nama);

    // flags
    int int1 = 5;
    int int2 = 9;
    int hasil = int1 + int2;

    System.out.printf("\n %d + %d = %d",int1,int2,hasil);
  }
  
}
