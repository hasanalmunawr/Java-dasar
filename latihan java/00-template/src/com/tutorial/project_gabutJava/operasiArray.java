package com.tutorial.project_gabutJava;

import java.util.Arrays;

public class operasiArray {

  public static void main(String[] args) {
    
    int[] arrayAngka1 = {1,2,3,4,5};

    // merubah array ke dalam string
    System.out.println(Arrays.toString(arrayAngka1)+ "\n");

    // mengcopy array
    int[] arrayAngka2 = new int[5];
    printArray(arrayAngka1);
    printArray(arrayAngka2);
    System.out.println("\n");
    
    // mengcopy dengan loop
    for (int i = 0; i < arrayAngka1.length; i++ ) {
      arrayAngka2[i] = arrayAngka1[i];
    }
    printArray(arrayAngka1);
    System.out.println(arrayAngka1);
    printArray(arrayAngka2);
    System.out.println(arrayAngka2);
    System.out.println("\n");
    
    
    // mengcopy dengan cara lebih mudah dan praktis
    int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,5);
    int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,3,5);
    printArray(arrayAngka3);
    System.out.println(arrayAngka3);
    printArray(arrayAngka4);
    System.out.println(arrayAngka4);
    System.out.println("\n");
    
    // mengcopy array dengan lebih cepat menggunakan clone
    int[] arrayAngka5 = arrayAngka1.clone();
    printArray(arrayAngka5);
    System.out.println(arrayAngka5);
    System.out.println("\n");
    
    // fill array
    int[] arrayAngka6 = new int[10];
    printArray(arrayAngka6);
    Arrays.fill(arrayAngka6, 5);
    printArray(arrayAngka6);
    System.out.println("\n");
    
    // komperasi array
    int[] arrayAngka7 = {1,2,3,4,15};
    int[] arrayAngka8 = {1,2,3,4,5};
    
    System.out.println(Arrays.equals(arrayAngka7,arrayAngka8)); //output nya akan menghasilkan true and false
    
    if (Arrays.equals(arrayAngka7,arrayAngka8)) {
      System.out.println("array ini isinya sama");
    } else {
      System.out.println("array ini isinya berbeda");
    }
    System.out.println("\n");
    
    // mengecek posisi index yang berbeda menggunkan mistamceh
    System.out.println("posisi salahnya ada di index-" + Arrays.mismatch(arrayAngka7,arrayAngka8));
    System.out.println("\n");


    // mengecek array yang lebih besar  menggunakan compare
    System.out.println(Arrays.compare(arrayAngka7,arrayAngka8));
    System.out.println("\n");

    // sort atau mengurutkan pada array
    int[] arrayAngka9 = {1,4,7,2,6,5,9,5,2,3};
    printArray(arrayAngka9);
    Arrays.sort(arrayAngka9);
    printArray(arrayAngka9);

    // research array
    int angka = 7;
    int posisi = Arrays.binarySearch(arrayAngka9,angka);
    System.out.println("angka " + angka+ " ada di posisi " + posisi);



    /*homework about array
     * make array use sort but kebalik
     * menggabungka 2 buah aray
     * operasi tambah pada 2 buah array
     */


  }

  private static void printArray(int[] dataArray) {
    System.out.println(Arrays.toString(dataArray));
  }
  
}
