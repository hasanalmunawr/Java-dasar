package oopJava.FinalClass;

 class SocialMedia {
  String name;
  String pw;

  
}

class Facebook extends SocialMedia {
  final void login(String name, String pw) {
    this.name = name;
    this.pw = pw;
  }

 }
//ERROR
 class FakeFacebook extends Facebook { // akan erro karena class nya sudah final
  // yang berarti tidak bisa di turunkan lagi
  // void login(String name, String pw) { //error
  // }
 }