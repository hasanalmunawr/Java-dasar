package oopJava.penurunan;

import oopJava.person;

public class company { //OUTER CLASS NYA
  private String name;

  public String getCompeny() { //getter dan satter
    return name;
  }
  public void setCompany(String name) {
    this.name = name;
  }
  
  public class emplymen{ //INNER CLASS NYA
    private String name;
  
    public String getnama() {
      // return company.this.getCompeny();
      return company.this.name; //bisa begini juga
    }
    public String getname() { //getter dan satter
      return name;
    }
    public void setNama(String name) {
      this.name = name;
    }
    public String getCompany() {
      return company.this.getCompeny();
    }
    
  }

}

