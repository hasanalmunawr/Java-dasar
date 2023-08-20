package latihan.latihanByDea;

import java.util.UUID;

import oopJava.Packge.product;

abstract class display  {

  void notification(){};

  void showToken(UUID token) {
    System.out.println("Your Token is " + token);
  }
}

class User extends display{

  protected String username;
  protected String password;

  protected UUID token;

  void createdToken() {
    token = UUID.randomUUID();
  }

  void register(String username, String password) {
    this.username = username;
    this.password = password;
  }

  void notification() {
    System.out.println("User crated by " + username);
    showToken(this.token);
  }
}

