package com.tutorial.pengenalanpart1;

import javax.management.NotCompliantMBeanException;

public class arrayMatrix {
  
  public static void main(String[] args) {
    
    // studi kasus dengan metode aljabar linear
    // menambahkan 2 buah array 2D metode matrix

    // array matrix
    int[][] matrixA = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };

    int[][] matrixB = {
      {11,12,13,},
      {14,15,16},
      {17,18,19}
    };

    // matrix for kali
    int[][] matrixC = {
      {1,2}, //<-ini baris
      {3,4},
      // {6,7}

  //   | ini kolom
    };

    int[][] matrixD = {
      {11,12},
      {13,14},
      // {15,16}
    };


    // print array 2D
    printArray(matrixA);
    printArray(matrixB);
    
    // colab 2 array
    int[][] hasilTambah = nambahArray(matrixA, matrixB);
    printArray(hasilTambah);
    
    // // kali 2 array
    System.out.println("versi kelas terbuka \n");
    printArray(matrixC);
    printArray(matrixD);
    int[][] hasilKali = kaliArray(matrixC, matrixD);
    printArray(hasilKali);
    
    // kali versi dari komen
    // System.out.print("versi clean\n");
    // printArray(matrixC);
    // printArray(matrixD);
    // int[][] hasilKali2 = kaliArray2(matrixC, matrixD);
    // printArray(hasilKali2);

    // gabut versi kurang nya

    
  }

  // method untuk mengurangi 2 buah array matrix
  // private static int[][] kurangArray(int[][] matrix1, int[][] matrix2) {
  //   int baris1 = matrix1.length;
  //   int kolom1 = matrix1[0].length;

  //   int baris2 = matrix2.length;
  //   int kolom2 = matrix2[0].length;

  //   int[][] hasilKurang = new int[baris1][kolom2];

  //   for (int i = 0; i < baris1; i++) {
  //     for (int j = 0; j < kolom1; j++) {
  //       hasilKurang[i] = matrix1[i][j] - matrix2[i][j];
  //     }

  //   }
  //   return hasilKurang;

  // } masih butuh perbaikan

  // method for kali 2 array 2D matrix
  private static int[][] kaliArray(int[][] matrix1, int[][] matrix2) {
    int baris1 = matrix1.length;
    int kolom1 = matrix1[0].length;
  
    int baris2 = matrix2.length;
    int kolom2 = matrix2[0].length;

    int[][] hasilArray = new int[baris1][kolom2];
    int buffer;

    if (kolom1 == baris2) {

      for (int i = 0; i < baris1; i++) {
        for (int j = 0; j < kolom2; j++) {
          buffer = 0;
          for (int k = 0; k < kolom1; k++) {
            buffer += matrix1[i][k] * matrix2[k][j];
          }
          hasilArray[i][j] = buffer;
        }
      }
    } else {
      System.out.println("ora isooooooo");
    }
      /* misal a + b maka baris akan mengikuti oleh a dan
       kolom akan mengikuti b */
    // looping for procces
    return hasilArray;


  }

  // kali versi kode lebih clean dari komentar
  private static int[][] kaliArray2(int[][] matrix1, int[][] matrix2) {
    int baris1 = matrix1.length;
    int kolom2 = matrix2[0].length;

    int[][] hasilkaliV2 = new int[baris1][kolom2];
    int hasilPerElemenMatrix;

    for (int i = 0; i < baris1; i++) {
      for (int j = 0; j < kolom2; j++) {
        hasilPerElemenMatrix = 0;
        for (int k = 0; k < kolom2; k++) {
          hasilPerElemenMatrix += matrix1[i][k] * matrix2[k][j];

        }
        hasilkaliV2[i][j] = hasilPerElemenMatrix;
      }

    }
    return hasilkaliV2;
  }

  // method for add 2 array 2D
  private static int[][] nambahArray(int[][] matrix1, int[][] matrix2) {
    int baris1 = matrix1.length;
    int kolom1 = matrix1[0].length;

    int baris2 = matrix2.length;
    int kolom2 = matrix2[0].length;

    int[][] hasilArray = new int[baris1][kolom1];

    // looping for colab matrixA and matrixB
    
    if (baris1 == baris2 && kolom1 == kolom2 ) {

        for (int i = 0; i < baris1; i++) {
          for (int j = 0; j < kolom1; j++) {
           hasilArray[i][j] = matrix1[i][j] + matrix2[i][j]; 

          }
        }

    } else {
        System.out.println("baris dan kolom pada matrix tidak sama");
    }

      return hasilArray;

  }

  // method for print array 2D
  private static void printArray(int[][] dataArray) {
    int baris = dataArray.length;
    int kolom = dataArray[0].length;

    // looping
    for (int i = 0; i < baris; i++) {
      System.out.print("[ ");
      for (int j = 0; j < kolom; j++) {
        System.out.print(dataArray[i] [j]);
        if (j < (kolom - 1)) {
          System.out.print(", ");
        } else {
          System.out.print(" ]");
        }

      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }
}
