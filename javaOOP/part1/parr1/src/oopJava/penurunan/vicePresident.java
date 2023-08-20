package oopJava.penurunan;

 class vicePresident extends manajer {

  vicePresident(String name) { 
    super(name, null); //harus di isi , jika tidak di isi dari parent nya maka akan error
  }

  // method ovverloading
  void sayHello(String name) { //semuanya harus sama
    System.out.println("halo " + this.name+ " nama saya is PI " + name);
  }
  
}
