package oopJava.penurunan;

public class manajer extends employi { //kelas parents

  String company;

  manajer(String name) { //jika tidak ada parameter nya makan akan jadi default
    super(name);
  }
  manajer(String name, String company) {
    super(name);
    this.company = company;
  }
  void sayHello(String name) {
    System.out.println("halo " + this.name+ " nama saya manajer " + name);
  }
  
}

