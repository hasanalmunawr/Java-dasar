package com.tutorial.project_gabutJava;

import java.util.Scanner;

public class looping2 {
  public static void main(String[] args) {
    
    // make a looping fibonacci
    int fn,fn1,fn2,n,i=0 ;
    Scanner requestUser = new Scanner(System.in);

    // rumus (fn = fn-1 + fn-2)  -> iterasi kesatu
    // f(4) = f3 + f2

    System.out.print("masukan mau sampe berapa fibonacinya: ");
    n = requestUser.nextInt();

    fn2 = 0;
    fn1 = 1;
    fn = 1;
    
    // Use for 
    // for (int i = 1; i <=n; i++) {
    //   System.out.println("nilai ke -"+ i + "adalah "+ fn);
    //   fn = fn2 + fn1;
    //   fn2 = fn1;
    //   fn1 = fn;
    // }

    // use while
    while (i < n) {
      System.out.println("fibannci ke "+i+ "adalah" + fn);
      i++;
      fn = fn2 + fn1;
      fn2 = fn1;
      fn1 = fn;
          
      
      }
      
      // use do while
    //   do{
    //     System.out.println("fibannci ke "+i+ "adalah " + fn);
    //     i++;
    //     fn = fn1 + fn2;
    //     fn2 = fn1;
    //     fn1 = fn;
      
    // } while(i < n);
  }
  
}
