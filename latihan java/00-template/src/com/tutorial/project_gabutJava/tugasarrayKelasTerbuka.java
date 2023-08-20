package com.tutorial.project_gabutJava;

import java.util.Arrays;

public class tugasarrayKelasTerbuka {
  public static void main(String[] args) {
    
    int[] arrayAngka1 = {1,4,2,6,9};
    int[] arrayAngka2 = {21,54,1,28,65};
    /*tugas
     * menggabungkan 2 buah array FINISH........
     * manambahkan 2 buah array FINISH........
     * menukar posisi array
     */
    System.out.println(" DATA ARRAY");
    printArray(arrayAngka1);
    printArray(arrayAngka2);

    System.out.println("\n HASIL MENGGABUNGKAN 2 BUAH DATA ARRAY");
    arrayGabungan(arrayAngka1, arrayAngka2);

    System.out.println("\n HASIL PERTAMBAHAN 2 BUAH ARRAY");
    int[] hasil = arrayTambah(arrayAngka1,arrayAngka2);
    printArray(hasil);

    System.out.println("\n REVERSE  MENGGNAKAN NEW ARRAY");
    reverse(hasil);

    System.out.println("\n REVERSE-2 MENGGUNAKAN VARIABLE");
    reverse2(arrayAngka2);
    printArray(arrayAngka2);
  }


  private static void arrayGabungan(int[] dataArray1, int[] dataArray2) {
    int[]  arrayHasil = new int[dataArray1.length + dataArray2.length];

    for ( int i = 0; i < dataArray1.length; i++) {
      arrayHasil[i] = dataArray1[i];
    }
    for (int i = 0; i < dataArray2.length; i++) {
      arrayHasil[i + dataArray1.length] = dataArray2[i];
    }
    System.out.println(Arrays.toString(arrayHasil));
  }

  private static int[] arrayTambah(int[] dataArray1, int[] dataArray2) {
    int[] arrayHasil = new int[dataArray1.length];
    for (int i = 0; i < dataArray1.length; i++) {
      arrayHasil[i] = dataArray1[i] + dataArray2[i];
    }
    return arrayHasil;
  }

  // use new array
  private static void reverse(int[] dataArray) {
    Arrays.sort(dataArray);
    int[] hasil = new int[dataArray.length];
    for (int i = 0; i < dataArray.length; i++) {
      hasil[i] = dataArray[(dataArray.length - 1) - i];

    }
    System.out.println(Arrays.toString(hasil));
  }

  // use new variable
  private static void reverse2(int[] dataArray) {
    Arrays.sort(dataArray);
    int buffer;
    for (int i = 0; i < dataArray.length / 2; i++) {
      buffer = dataArray[i];
      dataArray[i] = dataArray[(dataArray.length - 1) -i];
      dataArray[(dataArray.length - 1) -i] = buffer;

    }
    
   
    
  }


  private static void printArray(int[] dataArray) {
    System.out.println(Arrays.toString(dataArray));
  }
}
