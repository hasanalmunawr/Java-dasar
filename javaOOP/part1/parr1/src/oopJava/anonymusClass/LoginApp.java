package oopJava.anonymusClass;

public class LoginApp {
  public static void main(String[] args) {
    
    LoginRequest login1 = new LoginRequest("hasan", "almu");
    System.out.println(login1);
    System.out.println(login1.username());
    System.out.println(login1.pasword());

    System.out.println(new LoginRequest());
    System.out.println(new LoginRequest("hasan"));
    System.out.println(new LoginRequest("hasan", "almu"));
  }
  
}
