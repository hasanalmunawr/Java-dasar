package oopJava.anonymusClass.staticMatery;

public class byField {

  // static field
  public static final String Tema = "Belajar java "; //biasanya final 
  public static int bagian = 1;
  
  // statis method
  public static int sum(int...values) {
    int total = 0;
    for (var value : values) {
      total += value;
    }
    return total;
  }

  // static block
  // public static final int PROSESOR ;
    
  //   static {
  //     PROSESOR = Rutime.getRuntime().availableProsesor():
  //   }
  
}
