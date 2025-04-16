package omi25.nachname.ue5.ex5.v2;

public class Session {
  private final String username;
  private final long loginTimestamp;

  public Session(String username) {
    this.username = username;
    this.loginTimestamp = System.currentTimeMillis();
  }

  public String getUsername() {
    return username;
  }

  public long getLoginTimestamp() {
    return loginTimestamp;
  }
}