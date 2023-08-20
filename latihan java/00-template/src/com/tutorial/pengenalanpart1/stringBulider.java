package com.tutorial.pengenalanpart1;

import javax.sound.midi.Soundbank;

public class stringBulider {
  public static void main(String[] args) {
    
    StringBuilder builder = new StringBuilder("hello");
    printString(builder);

    // append
    builder.append(" everybody");
    printString(builder);

    builder.append(" people jogjaa");
    printString(builder);

    // insert
    builder.insert(29," city");
    printString(builder);

    // delete
    builder.delete(6, 15);
    printString(builder);

    // rubah charg
    // builder.setCharAt(17, "J");
    // printString(builder);

    // replace
    builder.replace(14, 20, "jambi");
    printString(builder);
  }
  


  private static void printString(StringBuilder dataBuilder) {

    System.out.println("data = " + dataBuilder);
    System.out.println("panjang = " + dataBuilder.length());
    System.out.println("kapasitas = " + dataBuilder.capacity());

    int addresBulider = System.identityHashCode(dataBuilder);
    System.out.println("addres = " + Integer.toHexString(addresBulider));
    System.out.println("\n");


  }
}
