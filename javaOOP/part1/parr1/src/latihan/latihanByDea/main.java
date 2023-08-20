package latihan.latihanByDea;

import java.util.Scanner;

public class main  extends User{
  public static void main(String[] args) {

    Scanner inputUser = new Scanner(System.in);

    System.out.println("Input Username = ");
    String inputUsername = inputUser.nextLine();

    System.out.println("Input Password = ");
    String inputPassword = inputUser.nextLine();
    
    var user = new User();
    user.register(inputUsername, inputPassword);
    user.notification();

   

  }
  
}
