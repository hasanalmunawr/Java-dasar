package oopJava.variableHidding;

import oopJava.person;
import oopJava.personApp;
import oopJava.Packge.product;
import oopJava.Packge.productApp;
import oopJava.penurunan.employi;

public class ParentsApp  {
    
  
  public static void main(String[] args) {
  

    Child child = new Child("jarwo");
    child.name = "hasan";
    child.DoIt();
    System.out.println(child.name);

    Parents parents = (Parents) child; //konversi
    parents.name = "parno";
    parents.DoIt();
    System.out.println(parents.name);

    product product = new product("koip",300);
    System.out.println(product.getName());
    System.out.println(product.getPrice());

    
  }

}
