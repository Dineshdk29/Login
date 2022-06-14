package Exception;

import java.util.Scanner;

class UsernameException extends Exception {
 
 public UsernameException(String user) {
  super(user);
 }
}

class PasswordException extends Exception {
 
 public PasswordException(String pass) {
  super(pass);
 }
}

public class Login {

 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username, password;
  
  System.out.print("Enter username : ");
  username = s.nextLine();
  
  System.out.print("Enter password : ");
  password = s.nextLine();
  
  int length = username.length();
  
  try {
   if(length < 8)
    throw new UsernameException("Username must be greater than 8 characters ");
   else if(!password.equals("dk"))
    throw new PasswordException("Incorrect password ");
   else
    System.out.println("Login Successfull");
  }
  catch (UsernameException u) {
   u.printStackTrace();
  }
  catch (PasswordException p) {
   p.printStackTrace();
  }
 }
}