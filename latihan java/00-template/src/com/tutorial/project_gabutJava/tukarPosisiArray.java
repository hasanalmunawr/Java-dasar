package com.tutorial.project_gabutJava;

import java.util.Arrays;
import java.util.Scanner;
public class tukarPosisiArray {
  public static void main(String[] args) {
    
    // studi kasus
    /*input = 123456 output = 54321 */
    String[] NamaHasan = {"h","a","s","a","n"};
    String[] kosong ={};

    Scanner inputArray = new Scanner(System.in);

    // System.out.print("masukan array yang mau di balik = ");
    // var naypo = inputArray.nextLine();

  

    
    String[] hasilTuker = progessTukar(NamaHasan);
    printArray(hasilTuker);

  }

  // method for switch array 
  private static String[] progessTukar(String[] dataArray) {
      String[] bufferArray = new String[dataArray.length];
      for (int i = 0; i < dataArray.length; i++) {
        bufferArray[i] = dataArray[(dataArray.length - 1) - i];
      }
      
    return bufferArray;
  }
  
  // method looping array
  private static void printArray(String[] dataArray) {
    for (var value: dataArray ){
      System.out.print(value);
    }
  }
}
