package latihan.classMethod;

import latihan.latihanByDea.admin;
import oopJava.abstrakClass.city;
import oopJava.abstrakClass.location;

public class locationApp {
  
  public static void main(String[] args) {

   city City = new city("dino",12);

   System.out.println(City.getDaerah());
   System.out.println(City.getNomor());

   admin Admin = new admin();
  //  Admin.userCreated("hasan", "123");
   Admin.notification();
  }
}
