package com.tutorial.pengenalanpart1;

public class operasiAritmatika {
  public static void main(String[] args) {
    
    // operasi aritmatika pada java


    int angka1 = 10;
    int angka2 = 2;

    int hasil;

    // 1.tambah
    hasil = angka1 + angka2;
    System.out.println(angka1 + "+"+ angka2 +"="+ hasil);

    // 2.kurang
    hasil = angka1 - angka2;
    System.out.printf("%d - %d = %d \n",angka1,angka2,hasil);

    // 3.kali
    hasil = angka1 * angka2;
    System.out.printf("%d * %d = %d \n", angka1,angka2,hasil);
    
    // 4.bagi
    // float hasil2 = (float) hasil;
    // hasil = (float) angka1 / angka2;

    float hasilNew = (float) angka1 / angka2;
    System.out.printf("%d / %d = %.2f \n", angka1, angka2, hasilNew);
    // float hasilKedua = hasil;
    // System.out.printf("%d / %d = %d \n", angka1,angka2,hasilNew);
    float a = 88;
    int b = 3;
    float c = a / b;
    System.out.printf("%f / %d = %f \n",a,b,c);
    
    // 5.modulus
    hasil = angka1 % angka2;
    System.out.printf("%d %% %d = %d \n", angka1,angka2,hasil);

    // pr di sini bagaimana cara mengskor data dari int ke float //selsai

    // perubahaan data dengan menkonfersi data 
    int age = 18;
    Integer ageObject = age; 
    int ageAgain = ageObject; //jika tipenya sama maka akan otomatis

    System.out.println(age);
    System.out.println(ageObject);
    System.out.println(ageAgain);

    short iniShort = ageObject.shortValue();
    long iniLong = ageObject.longValue();
    float iniFloat = ageObject.floatValue();

    System.out.printf("ini data short %d \n", iniShort);
    System.out.printf("ini data long %d \n", iniLong);
    System.out.printf("ini data float %f \n", iniFloat);



    // augmented assigment / operasi ke diri sendiri
    // a = a+10 -> a += 10
    // a = a-10 -> a -= 10
    // a = a*10 -> a *= 10
    // a = a/10 -> a /= 10
    // a = a%10 -> a %= 10

    int e = 10;

    e += 10;
    System.out.println(e);
    e -= 1;
    System.out.println(e);
    e *= 1;
    System.out.println(e);
    e /= 1;
    System.out.println(e);
    e %= 1;
    System.out.println(e);
    

  }
  
}
