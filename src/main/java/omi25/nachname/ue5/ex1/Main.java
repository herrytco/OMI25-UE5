package omi25.nachname.ue5.ex1;

public class Main {
  public static void main(String[] args) {
    NotificationManager notificationManager = new NotificationManager();

    notificationManager.processReport("student@example.com");

    System.out.println("Printed lines: " + notificationManager.reportGenerator.printer.printedLines);
  }
}
