package oopJava.exceptionErrro;

import java.lang.reflect.Field;

import oopJava.anonymusClass.LoginRequest;

public class ValidationUtil {
  
  public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException { //wajib pake thowhg
    if (loginRequest.username() == null) {
      throw new ValidationException("Username cannot null");
    } else if (loginRequest.username().isBlank()) {
      throw new NullPointerException("Username is Blank");
    } else if (loginRequest.pasword() == null) {
      throw new ValidationException("Password cannot null");
    } else if (loginRequest.pasword().isBlank()) {
      throw new NullPointerException("Password is Blank");
    }
  }
  public static void validateRun(LoginRequest loginRequest)  { //wajib pake thowhg
    if (loginRequest.username() == null) {
      throw new BlankEkxception("Username cannot null");
    } else if (loginRequest.username().isBlank()) {
      throw new NullPointerException("Username is Blank");
    } else if (loginRequest.pasword() == null) {
      throw new BlankEkxception("Password cannot null");
    } else if (loginRequest.pasword().isBlank()) {
      throw new NullPointerException("Password is Blank");
    }
  }

  public static void ValidationRefleksion(Object object) {
    Class aClass = object.getClass();
    Field[] fields = aClass.getDeclaredFields();

    for(var field : fields) {
      field.setAccessible(true);

      if (field.getAnnotation(NotBlanks.class) != null) {
        //validated
        try {
          String value = (String) field.get(object);
          
          if(value == null || value.isBlank()) {
            throw new BlankEkxception("field" + field.getName() + "is blank" );
          }
        } catch (IllegalAccessException e) {
          // TODO: handle exception
          System.out.println("tidak bisa mengakses field" + field.getName());

        }
      }
    }
  }
}
