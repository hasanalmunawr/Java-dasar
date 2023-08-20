package oopJava.exceptionErrro;

public class frelsionApp {
  public static void main(String[] args) {
    
    CreateUserReqest create1 = new CreateUserReqest();
    create1.setNama("");
    create1.setPaswword("1234");
    
    // CreateUserReqest create2 = new CreateUserReqest("m","");


    // ValidationUtil.ValidationRefleksion(create2);
    ValidationUtil.ValidationRefleksion(create1); //tanpa try cathc lebih mudah

  }
  
}
