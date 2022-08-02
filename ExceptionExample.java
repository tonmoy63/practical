package com.kogent;

public class ExceptionExample {
      public void show() {
    	  String a="i am error";
    	  System.out.println(a);
    	  try {
    		  int i=50/0;
    		  System.out.println(i);
    	  }
    	  catch (Exception e) {
    		  System.out.println(e);
    	  }
      }
      public static void main(String args[]) {
    	  ExceptionExample x= new ExceptionExample();
    	  x.show();
      }
}
