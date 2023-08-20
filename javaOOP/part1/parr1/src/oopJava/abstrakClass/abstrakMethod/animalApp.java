package oopJava.abstrakClass.abstrakMethod;

import oopJava.exceptionErrro.Fancy;

@Fancy(name = "AnimapAPP", tags = {"aplication", "java"})
public class animalApp {
  public static void main(String[] args) {
    
    var animal = new Cat("popo",134);
      // animal.hewan = "meong";
      // animal.run();
    System.out.println(animal.getHewan());
    System.out.println(animal.getUkuran());
    animal.run();
  }
  
}
