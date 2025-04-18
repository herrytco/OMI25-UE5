package omi25.nachname.ue5.ex5.v2;

import java.util.HashMap;
import java.util.Map;

public class SessionManager {
  private final Map<String, Session> activeSessions = new HashMap<>();

  public void login(String username) {
    if (!activeSessions.containsKey(username)) {
      activeSessions.put(username, new Session(username, System.currentTimeMillis()));
    }
  }

  public void logout(String username) {
    activeSessions.remove(username);
  }

  public void printUsers() {
    for (Session session : activeSessions.values()) {
      System.out.println(session.username());
    }
  }
}
