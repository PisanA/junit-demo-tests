// This directory within the tests repository may house solution code to ensure
// that the tests are working properly. This means that the tests repository will normally be private.

import java.util.*;
import java.io.*;

class Main {
  public static int input() {
    Scanner scan = new Scanner(System.in);
    return scan.nextInt();
  }
  
  public static void print() {
    System.out.println("JUnit is so cool!");
  }
  
  public static void openFile() {
    try {
      Scanner scan = new Scanner(new File("text.txt")); // text.txt is in the roor folder
    } catch (FileNotFoundException e) {
      System.out.println("Error opening the file!");
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
  
  
}
