package com.tutorial.pengenalanpart1;

public class ifStatment {

  public static void main(String[] args) {
    int akun;
    String pasword;

    var nilai1 = 72;
    var nilai2 = 71;

    if (nilai1>=90 && nilai2 >=90) {
      System.out.println("anda lulus dengan nilai A");
    } else if (nilai1>=80 && nilai2 >=80) {
      System.out.println("anda mendapatkan nilai B");
    } else if (nilai1>=75 && nilai2 >=75) {
      System.out.println("anda lulus mendapatkan nilai C ");
    } else if (nilai1>=75 || nilai2 >=75) {
      System.out.println("anda lulus dengan nilai D");
    } else {
      System.out.println("maaf anda belum lulus");
    }


    // if nested atau bersarang
    akun = 8226903;
    pasword = "badiro12";

    if (akun == 8226903) {
      var login = pasword == "badiro12" ? "anda telah login" : "kata sandi salah";
      System.out.println(login);
    }else {
      System.out.println("akun tidak di temukan");
    }


  }
  
}
