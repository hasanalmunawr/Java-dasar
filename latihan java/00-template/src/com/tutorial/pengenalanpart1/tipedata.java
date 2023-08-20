package com.tutorial.pengenalanpart1;

public class tipedata {
  public static void main(String[] args) {
    
  
    // bilangan bulat
    byte iniByte = 100;
    short iniShort = 100;
    int iniInt = 2147483647;
    long iniLong = 1000000;
    long iniLong2 = 1000000L;

    // bilangan pecahan
    float campurSatu = 12.2f;
    double campurDua = 12.434;

    // literals
    int decimalLint = 24;
    int hexInt = 0xfffff; //pecahan 16(menambahkan 0x di awal)/ hex pada warna
    int binInt = 0b01010101; // bilangan biner (menambahkan 0b di setiap awal)

    // menggunakan underscrore
    long blance = 1_000_000;
    int sum = 6_000;

    System.out.println("=====interger=====");
    System.out.println("nilai = " + iniInt);
    System.out.println("nilai max = " + Integer.MAX_VALUE);
    System.out.println("nilai min = " + Integer.MIN_VALUE);
    System.out.println("nilai bytr = " + Integer.BYTES);
    System.out.println("nilai bit = " + Integer.SIZE);
    
    System.out.println("=====byte=====");
    System.out.println("nilai = " + iniByte);
    System.out.println("nilai max = " + Byte.MAX_VALUE);
    System.out.println("nilai min = " + Byte.MIN_VALUE);
    System.out.println("nilai bytr = " + Byte.BYTES);
    System.out.println("nilai bit = " + Byte.SIZE);
    
    System.out.println("=====short=====");
    System.out.println("nilai = " + iniShort);
    System.out.println("nilai max = " + Short.MAX_VALUE);
    System.out.println("nilai min = " + Short.MIN_VALUE);
    System.out.println("nilai bytr = " + Short.BYTES);
    System.out.println("nilai bit = " + Short.SIZE);
    
    System.out.println("=====long=====");
    System.out.println("nilai = " + iniLong);
    System.out.println("nilai max = " +Long.MAX_VALUE);
    System.out.println("nilai min = " +Long.MIN_VALUE);
    System.out.println("nilai bytr = " +Long.BYTES);
    System.out.println("nilai bit = " +Long.SIZE);
  }

  

  
  
}
