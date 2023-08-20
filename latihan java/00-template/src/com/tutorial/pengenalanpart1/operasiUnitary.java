package com.tutorial.pengenalanpart1;

public class operasiUnitary {

  public static void main(String[] args) {
    
    // operasi unary = operasi yang dilakukan pada satu tabel
    // unary + dan -
    int a = 5;
    System.out.printf("unary '+' %d menjadi %d \n",a,+a);
    System.out.printf("unary '-' %d menjadi %d \n",a,-a); //merubah angka menjadi positif atau negatif

    // unary degrement dan increment
    int b = 10;
    b++; //menambah angka dengan 1
    b++; //menambah angka dengan 1
    System.out.printf("nilai dengan '++' menjadi %d \n",b);
    
    int c = 10;
    c--; //mengurangi angka dengan 1
    System.out.printf("nilai dengan '--' menjadi %d \n",c);

    int d = 5;
    int e = 5;
    // e++; //hasilnya akan tetap lima karena variabel akan di tampilkan terlebh dahulu sebelum di ekssekusi
    // ++d;
    System.out.printf("nilai mengunakan ++d/prefix menjadi %d \n",++d);
    System.out.printf("nilai mengunakan e++/postfix menjadi %d \n",e++); 
    System.out.printf("nilai mengunakan e++/postfix menjadi %d \n",e++); 
    
    // unary boolean dengan ! untuk negasi
    //  ! = kebalikan nya
    boolean hasan = true;
    
    System.out.println("nilai boolean  bersifat " + hasan );
    System.out.println("nilai boolean bersifat " + !hasan);



  }
  
}
