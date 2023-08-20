package oopJava.Packge;

public class product {

 protected String name;
 protected int price;

  public product(String name, int price) { //lebih mudah menggunakan konstraktor
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public String toString() { //overaid method toString/ reprentasi dari string
    return "Product name " + name + "Price " + price;
  }

  public int hashCode() { //reprantsasi dari interger
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + price;

    return result;
  }

  public boolean equals(Object o) { //mengecek kondisi sama atau tidak nya object
    if (this == o) return true;
    if (!(o instanceof product)) return false;

    product Product = (product) o;

    if (price != Product.price) return false;
    return name != null ? name.equals(Product.name) : Product.name == null;
  } // direkomendasikan selalu mengoveride equals di setiap method untuk mwngecek benar atau tidak nya
}
