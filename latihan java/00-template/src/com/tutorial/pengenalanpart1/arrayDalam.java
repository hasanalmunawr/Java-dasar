package com.tutorial.pengenalanpart1;

import java.util.Arrays;

public class arrayDalam {

  public static void main(String[] args) {
    int aray1[] = {1,2,3,4,5};
    int array2[] = new int[5];

    System.out.println(aray1);
    System.out.println(array2);
    System.out.println("sebelom dijadikan ke penyimpana satu memori");
    array2 = aray1;
    System.out.println(aray1);
    System.out.println(array2);
    System.out.println("array1 = " + Arrays.toString(aray1));
    System.out.println("array2 = " + Arrays.toString(array2));
    
    aray1[0] = 120;    
    System.out.println("array1 = " + Arrays.toString(aray1));
    System.out.println("array2 = " + Arrays.toString(array2));
    
    array2[3] = 892;
    System.out.println("array1 = " + Arrays.toString(aray1));
    System.out.println("array2 = " + Arrays.toString(array2));


    // bisa di atasi dengan mengcpy array ny yaitu denga clone
    int array3[] = array2.clone();

    System.out.println(array3);
    System.out.println("array3 adalah" + Arrays.toString(array3));
  }
  
}
