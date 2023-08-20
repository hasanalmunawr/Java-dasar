package oopJava.exceptionErrro;

public class DataBaseApp {
  public static void main(String[] args) {
    
  //   ConnectDataBase("hasan", null);
  //   System.out.println("sukses login");
  // }
  
  // public static void ConnectDataBase(String username, String password) {
  //   if(username==null||password==null) {
  //     throw new DataBaseError("tidak bisa konek ke data base");
  //   }
  // }

  //mencari lokasi error STACKTRACEELEMENT
  try {
  sampleError();
  }catch (RuntimeException t) {  //error bertingkat
    // StackTraceElement[] stackTraces = t.getStackTrace();

    t.printStackTrace();  //mancari error
  }
}

public static void sampleError() {
    try {
      String[] names = {"hasan","almunawar"};
      System.out.println(names[10]);
    }catch (Throwable t) {
      StackTraceElement[] stackTraces = t.getStackTrace();
    
      t.printStackTrace();  //mancari error
    }

  }

}
