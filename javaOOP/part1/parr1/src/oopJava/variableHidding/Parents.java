package oopJava.variableHidding;

 public class Parents {
   String name;

  void DoIt() {
    System.out.println("Do it in parents");
  }
  
}

 class Child extends Parents {

  // String name;
  Child(String name) { //constracter
    this.name = name;
  }

  void DoIt() {
    System.out.println("Do it in child");
  }
}
