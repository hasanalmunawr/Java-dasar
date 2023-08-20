package oopJava.Packge;

public class productApp {
  public static void main(String[] args) {
    
    product Product = new product("mackbookPro ",30000);
    // Product.name = "kopi"; //bisa di akses
    // Product.price = 2000;
    
    System.out.println(Product.getName());
    System.out.println(Product.getPrice());
    System.out.println(Product);
    
    
    product Product2 = new product("mackbookPro ",30000);

    System.out.println(Product.equals(Product2));
    System.out.println(Product.hashCode() == Product2.hashCode());
  }
  
}
