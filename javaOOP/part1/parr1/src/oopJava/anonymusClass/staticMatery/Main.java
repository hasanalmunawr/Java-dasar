package oopJava.anonymusClass.staticMatery;

import static java.nio.channels.AsynchronousChannelGroup.*;

public class Main {

  public static void main(String[] args) {
    // mengakses static
    // static field
    System.out.println(byField.Tema);
    System.out.println(byField.bagian);

    // static method
    System.out.println(
     byField.sum(1,1,2,3)
    );

    // static class inner
    byInnerClass.dalamnya dalam = new byInnerClass.dalamnya(); 
    dalam.setNama("jero");
    dalam.getNama();

    System.out.println(dalam.getNama());
    
    // STATIC BLOCK
      System.out.println(Application.PROCESSORS); //mengambil core leptop
  }

  
}
