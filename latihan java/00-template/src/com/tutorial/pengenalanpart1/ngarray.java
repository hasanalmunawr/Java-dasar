package com.tutorial.pengenalanpart1;

import java.util.Arrays;
import java.util.function.LongPredicate;

public class ngarray  {
  public static void main(String[] args) {
    
    // membuat array pada java

    String[] namaHasan ;
    namaHasan = new String[3];

    namaHasan[0] = "hasan";
    namaHasan[1] = "almunawar";
    namaHasan[2] = "basri";

    System.out.println(namaHasan[0]);
    System.out.println(namaHasan[1]);
    System.out.println(namaHasan[2]);
    
    // cara mengganti data array
    
    namaHasan[2] = "guantengggggggggggg";
    System.out.println(namaHasan[2]);

    // membuat array dengan lebih ringkas (array initializer)

    int[] arrayInt = new int[]{ //opsi pertama
      12,23,34,56,78
    };
    System.out.printf("arrayInt pada index ke3 berisi %d \n",arrayInt[3]);

    long[] arrayLong = { //opsi kedua
      1,2,3,4,5
    };
    arrayLong[2] = 6;
    System.out.printf("arrayLong pada indexke2 berubah menjadi %d \n",arrayLong[2]);
    
    // example menggunakan string 
    String[] kumpulanNama = {
      "dudung","otong","dadang"
    };
    System.out.printf("data pada index ke 0 = \n", kumpulanNama[0]);
    System.out.printf("panjang/jumlah yang ada di array = \n", kumpulanNama.length);

    // cara menghapus data di array (kita mau menghapus si dudung)
    kumpulanNama[2] = null;
    System.out.printf("setelah di hapus menjadi = \n", kumpulanNama[2]);


    // operasi di array
    // namaArray[index] -> mengambil data di array / namaHasan[3]
    // namaArray[index] = value -> mengubah data array / namaHasan[1] = "munawir"
    // array.length -> mengambil panjang array / namaHasan.length

    // membuat array di dalam array
    String[][] listBaju = {
      {"hasan","l"},
      {"budi","xl"},
      {"anton","xxl"}
    };

    System.out.printf("nama =" + listBaju[0][0] + "\nukuran =" + listBaju[0][1]);
    System.out.printf("\nnama =" + listBaju[2][0] + "\nukuran =" + listBaju[2][1]);
    
    listBaju[0][1] = "xxxlll";
    System.out.printf("\nnama =" + listBaju[0][0] + "\nukuran =" + listBaju[0][1]);

    System.out.println("\n");
    System.out.println(listBaju.length);
    System.out.println(listBaju[0].length);

    // array multi dimensi by kelas terbuka
    System.out.println("\n KELAS TERBUKAAAA \n");
    int [][] arrayAngka = {
      {1,2,3}, 
      {4,5,6},
      {32,12}
   
    };
    int[][] arrayDimensi = new int[5][4];

    int[][][] arrayDimensi3 = new int[3][2][7];
    /*int[] namaArray = {
      {{1-7},{7-14}},

      dst
    } */

    // printArray2D(arrayAngka);
    // printArray2D(arrayDimensi);
    pemisah();
    

    loopingArray2D(arrayAngka);
    loopingArray2D(arrayDimensi);
    pemisah();

    forEach(arrayAngka);
    forEach(arrayDimensi);

    // tugas membuat array 3 dimensi
    printArray2D(arrayDimensi3);


    };

    public static void printArray3D(int[][][] dataArray) {
      for (int i = 0; i < dataArray.length; i++) 
      System.out.println(Arrays.deepToString(dataArray[i]));

      
    }

    private static void forEach(int[][] dataArray) {
      for(int[] baris: dataArray) {
        for (int isi: baris) {
          System.out.print(isi + ", ");
        }
        System.out.println(" ");
      }
    }

    private static void loopingArray2D(int[][] dataArray) {
      for (int i = 0; i < dataArray.length; i++) {
        for (int j = 0; j < dataArray[i].length; j++) {
          System.out.print(dataArray[i][j] + ",");
        }
        System.out.print("\n");
      }
      
    }



    private static void printArray2D(int[][][] dataArray) {
      for (int i = 0; i < dataArray.length; i++)
      System.out.println(Arrays.toString(dataArray[i]));

    }

    private static void pemisah() {
      System.out.print(" ------------------------ \n");
    }
  }
  

