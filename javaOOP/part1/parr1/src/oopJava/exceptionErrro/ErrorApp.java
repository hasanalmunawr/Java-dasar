package oopJava.exceptionErrro;

import oopJava.anonymusClass.LoginRequest;

public class ErrorApp {
  public static void main(String[] args) {
    
    LoginRequest login = new LoginRequest("hasan", "jaiu");

    // ValidationUtil.validate(login); // akan error
    // untuk mengatasi erronya maka akan menggunakan try catht

    try {
      ValidationUtil.validate(login);
      System.out.println("Succes Login");
    } catch (ValidationException | NullPointerException e) { //cara lebih singkat, bisa lebih dari 2
      System.out.println("Terjadi error di "+ e.getMessage());
    } finally {
      System.out.println("selalu di eksekusi"); //selalu di eksekusi mau error atau tidak
    }

    LoginRequest login2 = new LoginRequest(null, null);
    ValidationUtil.validateRun(login2);
  }
  
}
