package com.tutorial.pengenalanpart1.IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class inputFile {
  public static void main(String[] args) throws IOException {

    // try {
    //   FileInputStream fileInput = new FileInputStream();
    
    // } catch (IOException e) {
      //   System.err.println(e);
      // }
      
    FileInputStream fileInput = new FileInputStream("inputFile.txt");
    System.out.println((char)fileInput.read());
  }
  
}
