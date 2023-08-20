package oopJava.abstrakClass.abstrakMethod;

public class Cat extends Animals {

  int ukuran;

  // public Cat(String hewan) {
  //   super(hewan);
  // }

  public Cat(String hewan, int ukuran) {
    super(hewan);
    this.ukuran = ukuran;

  }

  public String getHewan() {
    return hewan;
  }

  public int getUkuran() {
    return ukuran;
  }

  public void run() { //setiap turunan animals wajib membuat method "run"
    System.out.println("cat" + hewan + "siapa itu"+ukuran);
  }
  
}
