package com.tutorial.pengenalanpart1;

public class whileLoop {
  public static void main(String[] args) {
    
    // perulangan dengan while
    // var counter = 56;

    // while (counter <= 10) {
    //   System.out.println("ke-"+ counter);
    //   counter++;
    // }

    // perulangan eks dulu menggunakan do while
    // do {
    //   System.out.println("ini ke-" + counter);
    //   counter++;
    // } while (counter <= 5);
    
    // break dan continue
    // menggunakan break
    // while (true) {
    //   System.out.println("ini ke-" + counter);
    //   counter++;

    //   if (counter >= 20) {
    //     break;
    //   }

    // }

    // menggunakan continue
    // for (int counter = 1; counter <= 50; counter++) {
    //   if (counter % 2 == 0) {
    //     continue;
    //   }
    //   System.out.println("ganjil ke"+ counter);
    // }


    // latihan studi kasus membuat segitiga dengan for
    // for (var bintang = 1 ; bintang <=10; bintang++) {
    //   for (var belah = 1; belah <= bintang; belah ++) {
    //     System.out.print(" *");
    //   }
    //   System.out.println(" ");
    // }
    
    // for(var j = 10; j >= 1; j--) {
    //   for (var i = 10; i >= 1; i--) {
    //     System.out.print(" *");         // salah
    //   }
    //   System.out.println(" ");
    // }

    var a = 5;
    for ( var b = 1; b <= a; b++) {
      for (var c = 1; c <= b; c++ ) {
        System.out.print(" *");

      }
      System.out.println( );
    }

  }
  
}
