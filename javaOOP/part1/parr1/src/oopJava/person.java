package oopJava;

public class person {
  
    
    // cara membuat object
    String name;
    String addres;
    int age;
    final String country = "indonesia";

    person(String name, String addres) {
      this.name = name;
      this.addres = addres;
    }

    person(String paraName) {
      this(paraName, null);
    }

    person() {
      this(null);
    }
  
  void sayHello(String paraname) {
    System.out.println("hello " + paraname + "my name is " + name);
  }
  
    
}
