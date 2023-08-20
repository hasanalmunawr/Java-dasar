package oopJava;

public class personApp {
  public static void main(String[] args) {
    
    // membuat field
    var person1 = new person("hasan"); 
    // person1.name = "hasan almunawar";
    person1.addres = "jambi";
    person1.age = 19;
    // person1.country ="jambi"; tidak bisa di ganti karena sudah final

    // person person2 = new person();
    person person3;
    person3 = new person("jali jali");
    // person3.name = "joko";
    person3.sayHello("budi ");

    // menampilkan field
    System.out.println(person1.name);
    System.out.println(person1.addres);
    System.out.println(person1.age);
    System.out.println(person1.country);


    // memanggil method
    person1.sayHello("kayla ");




  }
  
}
