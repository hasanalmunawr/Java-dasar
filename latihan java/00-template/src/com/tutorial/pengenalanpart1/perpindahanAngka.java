package com.tutorial.pengenalanpart1;

public class perpindahanAngka {
  public static void main(String[] args) {
    
    // mengkonfersi secara otomatis (byte->short->int->long->float->double)
    // byte iniByte = 100;
    // short iniShort = iniByte;
    // int iniInt = iniByte;
    // long iniLong = iniByte;
    // float iniFloat = iniByte;
    // double iniDouble = iniByte;

    // System.out.println(iniShort);

    // mengkonfersi secara manual dengan lawan arus
    int iniDouble = 100;
    float iniFloat = (float) iniDouble;

    System.out.println(iniFloat);


  }
  
}
