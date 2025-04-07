package omi25.nachname.ue5.ex1;

public class Logger {
  private static Logger instance;

  public int nLoggedLines = 0;

  public static Logger getInstance() {
    if (instance == null) {
      instance = new Logger();
    }
    return instance;
  }

  public void log(String message) {
    nLoggedLines++;
    System.out.println("LOG: " + message);
  }
}
