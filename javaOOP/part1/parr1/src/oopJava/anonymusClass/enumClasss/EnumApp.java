package oopJava.anonymusClass.enumClasss;

public class EnumApp {

  public static void main(String[] args) {

    Costumer costum = new Costumer("hasan", Level.VIP);
    System.out.println(costum.getNama());
    System.out.println(costum.getLevel());
    System.out.println(costum.getLevel().getDescription());

    String LevelName = Level.PREMENIUM.name();
    System.out.println(LevelName);

    Level level = Level.valueOf("STANDART");
    System.out.println(level);

    System.out.print("\n Menampilkan macam2 level = ");
    for (var valu : Level.values()) {
      System.out.println(valu);
    }

  }
  
}
