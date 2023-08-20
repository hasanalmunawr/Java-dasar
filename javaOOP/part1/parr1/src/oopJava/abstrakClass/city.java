package oopJava.abstrakClass;

public class city extends location{

  int nomor;

  public city(String name) {
    super(name);
  }

  public city(String daerah, int nomor) {
    super(daerah);
    this.nomor = nomor;
  }

  public int getNomor() {
    return this.nomor;
  }


  
}
