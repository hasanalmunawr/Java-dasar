package oopJava.penurunan;

import oopJava.penurunan.company.emplymen;

class employiApp extends employi{
  employiApp() {
    super(null);

  }
  public static void main(String[] args) {
    
    employi Employi = new employi("kiyol");
    Employi.sayHello("hasin");

    Employi = new manajer("joko");
    Employi.sayHello("udin");

    Employi = new vicePresident("lipo");
    Employi.sayHello("naruto");

    cekHello(new employi("dudung"));
    cekHello(new manajer("hihang"));
    cekHello(new vicePresident("depol"));

    manggil(new vicePresident("huni"));

    company Company = new company();
    Company.setCompany("Hasan patners");

    company.emplymen Emplomen= Company.new emplymen();
    Emplomen.setNama("hasan");

    System.out.println(Emplomen.getCompany());
    System.out.println(Emplomen.getname());

    company compa2 = new company();
    compa2.setCompany("bli bli");

    company.emplymen emplo2 = compa2.new emplymen();
    emplo2.setNama("software engginerr");

    System.out.println(emplo2.getnama());
    System.out.println(emplo2.getname());


  }

  static void manggil(employi Employi) {
    if (Employi instanceof vicePresident) {
      System.out.println("hello "+ Employi.name);

    }
  }

  // merubah type object
  static void cekHello(employi Employi) {
    if (Employi instanceof vicePresident) { // ga wajib ,biar aman
      vicePresident vicePresident = (vicePresident) Employi;// konversi 
      System.out.println("hello VP " + vicePresident.name);
    } else if (Employi instanceof manajer) {
      manajer manajer = (manajer) Employi;
      System.out.println("hello manajer " + manajer.name);
    } else {
      System.out.println("hello " + Employi.name);
    }
  }
  
}
