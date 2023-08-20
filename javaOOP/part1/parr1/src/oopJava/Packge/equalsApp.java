package oopJava.Packge;

public class equalsApp {
  public static void main(String[] args) {
    
    String first = "hasan";
    first = first + " " + "almunawar";
    
    System.out.println(first);

    String second = "hasan almunawar";
    System.out.println(second);

    System.out.println(first == second); //false -> object bukan isi yang di banding kan
    System.out.println(first.equals(second));//true

    String three = "hasan almunawar";
    System.out.println(second.equals(three)); //true

  }
  
}
