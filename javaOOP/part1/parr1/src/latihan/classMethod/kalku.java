package latihan.classMethod;

import java.util.Scanner;

public class kalku {
  public static void main(String[] args) {
    
    var number = new mathod();
    Scanner inputUser = new Scanner(System.in);

    // input oleh user
    System.out.print("masukan angka pertama yang mau ditambahkan = ");
    number.angkaKedua = inputUser.nextInt();
    System.out.print("masukan angka kedua yang mau ditambahkan = ");
    number.angkaPertama = inputUser.nextInt();

   System.out.println(number.operasiTambah(number.angkaPertama, number.angkaKedua));
  }

  
}
