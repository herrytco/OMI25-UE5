package omi25.nachname.ue5.ex1;

public class Logger {
  private static Logger instance;

  public static Logger getInstance() {
    if (instance == null) {
      instance = new Logger();
    }
    return instance;
  }

  public void log(String message) {
    System.out.println("LOG: " + message);
  }
}
