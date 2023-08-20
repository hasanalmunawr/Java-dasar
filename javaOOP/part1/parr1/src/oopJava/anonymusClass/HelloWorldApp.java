package oopJava.anonymusClass;

import oopJava.person;
import static oopJava.anonymusClass.staticMatery.Application.PROCESSORS;;

public class HelloWorldApp {

  public static void main(String[] args) {
    
    HelloWorld english = new HelloWorld() { //ANONYMOUS CLASS
      public void sayHello(){
        System.out.println("hello");
      }
      public void sayHello(String name) {
        System.out.println("hello " + name);
      }

      // by contek
      // public String palindrom(String kalimat) {
      //   StringBuilder wadah = new StringBuilder();
      //   for (int i = kalimat.length() - 1; i >= 0; i--) {
      //     wadah.append(kalimat.charAt(i));
      //   }
      //   if (wadah.toString().equals(kalimat)) {
      //     return wadah.toString();
      //   } else {
        //   return "bukan palindrom";
        // }
      // } //KOD

      
      
    };
    System.out.println(PROCESSORS); //mengambil core leptop
    
    HelloWorld indonesia = new HelloWorld() { //ANONYMOUS CLASS
      public void sayHello(){
        System.out.println("halo");
      }
      public void sayHello(String nama) {
        System.out.println("halo " + nama);
      }
      
      // tes
      // public String palindrom(String nama) {
      //   StringBuilder wadah = new StringBuilder();
      //   for (int i = nama.length() - 1; i >= 0; i--) {
      //     wadah.append(nama.charAt(i));
      //     if (wadah.toString().equals(nama)) {
      //       return wadah.toString();
      //     } else {
      //       System.out.println("bukan palindrom");
      //     }
      //   }
      // }


    };

    // panggil
    english.sayHello();
    english.sayHello("jhon");

    indonesia.sayHello();
    indonesia.sayHello("parjo");
  }
  
}
