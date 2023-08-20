package com.tutorial.pengenalanpart1.byStream;

import java.io.FileInputStream;
import java.io.IOException;

public class main {
  public static void main(String[] args) throws IOException {
    
    FileInputStream inputFile = null;

    System.out.println("file input bernilai " + inputFile);
    
    inputFile = new FileInputStream("input.txt");
    System.out.println("file input bernilai " + inputFile);

    inputFile.close();


  }
  
}
