package com.tutorial.pengenalanpart1;

import java.io.DataInput;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class methodException {
  public static void main(String[] args) {
    
    Scanner inputScanner = new Scanner(System.in);

    int[] arrayData = {0,1,2,3,4};

    System.out.print("data ke = ");
    int inputUser = inputScanner.nextInt();

    System.out.println("EXCEPTION BIASA ");
    try {
      System.err.printf("index ke- %d datanya adalah %d \n",inputUser, arrayData[inputUser]);

    } catch (Exception e) {
      System.err.println(e);
    }
    
    // eexception dengan method
    System.out.println("EXCEPTION DI DALAM FUNGSI ");
    int data = ambilData(arrayData, inputUser);
    System.out.println(data);
    
    
    // Exception by method 
    System.out.println("EXCEPTION DENGAN METHOD ");
    int data2 = 0;
    try {
      data2 = ambilData2(arrayData, inputUser);
    } catch (Exception e) {
      System.err.println(e);
    } 
    System.out.println(data2);
    
    
    System.out.println("akhir dari program \n");


  }

  
  // menaruh eception ke dalam fungsi
  private static int ambilData2(int[] dataArray, int indexArray) throws Exception{
    int hasil = dataArray[indexArray];

    return hasil;
  }

  private static int ambilData(int[] dataArray, int indexArray) {
    int hasil = 0;
    try {
      hasil = dataArray[indexArray];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    return hasil;
  }
  
}
