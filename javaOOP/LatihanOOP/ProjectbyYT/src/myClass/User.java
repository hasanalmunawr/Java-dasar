package myClass;

abstract class User {

    private String name;
    private int age;
    private String gender;

    public abstract String showTypeUser();

    //Constraktor
    public User(String name, int age, String gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
    }

    public void PrintUserInfo() {
    System.out.println("name =" + this.name + ", age =" + this.age
    + ", gender =" + this.gender);
    }

    //Setter method
    public void setName(String name) {
      this.name = name;
    }
    public void setAge(int age) {
      this.age = age;
    }
    public void setJenisKelamin(String gender) {
      this.gender = gender;
    }

    //Getter method
    public String getName() {
      return name;
    }
    public int getAge() {
      return age;
    }
    public String getGender() {
      return gender;
    }



}
