package latihan.LatihanbyChorme.myClass;

public class Penjual extends Orang{ 
  private int rating;
  
  public String showTypeUser() {
    return "ini Penjual";
  }

  public Penjual(String nama, String kota, int umur, int rating) {
    super(nama, kota, umur);
    this.rating = rating;
  }

  public void PrintUser() {
    super.PrintUser();
    System.out.println("Rating toko = "+this.rating+"/10");
  }

  // setter
  public void setRating(int rating) {
    if (rating <= 10) {
      this.rating = rating;
    } else {
      System.out.println("rating tidak boleh melebihi dari 10");
    }
  }
  public int getRating() {
    return this.rating;
  }
}
