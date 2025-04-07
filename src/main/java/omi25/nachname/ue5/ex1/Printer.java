package omi25.nachname.ue5.ex1;

public class Printer {

  public int printedLines = 0;

  public void print(String message) {
    printedLines++;
    System.out.println(message);
  }
}
