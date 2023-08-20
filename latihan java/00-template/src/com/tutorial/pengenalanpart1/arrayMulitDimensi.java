package com.tutorial.pengenalanpart1;

import java.util.Arrays;

public class arrayMulitDimensi {
  public static void main(String[] args) {
    
    int[][] namaArray = {
      {1,2,3,4},
      {6,7,5}
    };

    System.out.println(namaArray);
    System.out.println(Arrays.toString(namaArray));
    System.out.println(namaArray[0]);
    System.out.println(namaArray[1]);

    System.out.print("\n");
    // array di dalam array
    char[] char1 = {'a','b','c'};
    char[] char2 = {'d','e'};

    char[][] gabungChar = {
      char1,
      char2
    };

    System.out.println(gabungChar);
    System.out.println(Arrays.toString(gabungChar));
    System.out.println(Integer.toHexString(System.identityHashCode(char1)) );
    System.out.println(Integer.toHexString(System.identityHashCode(char2)) );
    // System.out.println(System.identityHashCode(char2));

      printArray(gabungChar);

    int[] nomber = {1,2,3};
    String[] name = {"san","po"};

    String[][] gabunf = {
      name,
      // nomber
    };

    
  }
  private static void printArray(char[][] dataArray) {
    for (char[] prie: dataArray) {
      for (char ngere: prie) {
        System.out.println(ngere);
      }
    }
  }
  
}
