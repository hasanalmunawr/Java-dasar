package oopJava.interfaceInterheri;

public interface car extends hasBrand, isMaintence {

  void drive(); //hanya bisa di lakukan oleh interface bukan class

  int getTier();

  default boolean isBig() { // jika di rubah default maka harus di deklarasikan
    return false; //boleh di ulang di turunan nya , boleh juga tidak
  } //tidak wajib mgnoveride
  
  
}
