package oopJava.anonymusClass.staticMatery;

public class Application {
  
  public static final int PROCESSORS;

  static{
    System.out.println("akses class app");
    PROCESSORS = Runtime.getRuntime().availableProcessors();
    System.out.print("Core");
  }
  
}
