package latihan.latihanByDea;

 public class admin extends User{
  final String namo = "Admin";

  @Override
  public void notification() {
    // super.notification();
    System.out.println("User crated by " + namo);
    showToken(this.token);

  }

  
}
