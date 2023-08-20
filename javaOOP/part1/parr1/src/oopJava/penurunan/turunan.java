package oopJava.penurunan;

 class turunan extends manajer{ //kelas child

  turunan() {
    super(null);
  }

  public static void main(String[] args) {
    
    var manager = new manajer("hayla");
    manager.name = "hasan";
    manager.sayHello("kayla");

    var turunan1 = new vicePresident("num");
    turunan1.name = "deva";
    turunan1.sayHello("almu");

  }

  
}
