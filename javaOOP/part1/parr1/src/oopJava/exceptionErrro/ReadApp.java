package oopJava.exceptionErrro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Target;

public class ReadApp {
  public static void main(String[] args) {
    
    //READ FILE 

    // BufferedReader reader = null;

    // //CLOSE MANUAL
    // try {
    //   reader = new BufferedReader(
    //     new FileReader("ReadMe.md")
    //   );

    //   while(true) {
    //     String line = reader.readLine();
    //     if (line == null) {
    //       break;
    //     }
    //     System.out.println(line);
    //   }
    // } catch (Throwable trow) {
    //   // TODO: handle exception
    //   System.out.println("error membaca pesan" + trow.getMessage());
    // } finally {
    //   if (reader != null) {
    //    try {
    //      reader.close();
    //      System.out.println("sukses menutup");
    //    } catch (IOException ecep) {
    //     // TODO: handle exception
    //     System.out.println("error menutup read me" + ecep.getMessage());
    //    }
    //   }
    // }

    //TRY WITH RESOURCE
    // menghemat memori souce code, close secara ototmatis
    try (BufferedReader reader = new BufferedReader(new FileReader("ReadMe.md"))) {
      while(true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }
      }
    } catch (Throwable throwable) {
      System.out.println("error membaca file" + throwable.getMessage());
    }
  }
  
}
