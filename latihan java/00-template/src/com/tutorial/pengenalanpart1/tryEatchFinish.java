package com.tutorial.pengenalanpart1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class tryEatchFinish {
  public static void main(String[] args) {
    
   while(true) {
    int[] arrayNumber = {0,1,2,3,4};
    Scanner userInput = new Scanner(System.in);
    System.out.print("masukan index array=");
    int indexInput = userInput.nextInt();

    /*cath tipe
     * exteption = biasa
     * IOException = sedang
     * ArrayIndexOutOfBoundsException = array
     */

    
    // try{
    //   System.out.printf("array pada index- %d adalah %d",indexInput,arrayNumber[indexInput]);

    // }catch (ArrayIndexOutOfBoundsException e) {
    //   System.err.println("error");;
    // }

    // // runtime error ketika tidak ada file nya


    FileInputStream fileInput = null;

    // try {

    //   fileInput = new FileInputStream("input.txt");
    // } catch (IOException e) {
    //   System.err.println("\n salah e rek");
    // }

    // cara kedua (menggabungkan 2 buah try)
    // try {
      // System.out.printf("array pada index- %d adalah %d",indexInput,arrayNumber[indexInput]);
    //   fileInput = new FileInputStream("input.txt");

    // } catch (ArrayIndexOutOfBoundsException e) {
    //   System.err.println("\n index yang anda msukan tidak sesuai");
    // } catch (IOException e) {
    //   System.err.println("\n file tidak ditemukan");
    // }
    
    // menambahkan finally
    // try {
    //   System.out.printf("array pada index- %d adalah %d",indexInput,arrayNumber[indexInput]);
    //   fileInput = new FileInputStream("input.txt");

    // } catch (ArrayIndexOutOfBoundsException e) {
    //   System.err.println("\n index yang anda msukan tidak sesuai");
    // } catch (IOException e) {
    //   System.err.println("\n file tidak ditemukan");
    // } finally {
    //   System.out.println("selesai rek");
    // }

    System.out.println("akhir dari program");

  }

  }
  
}
