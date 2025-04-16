package omi25.nachname.ue5.ex5.v1;

import java.util.*;

public class SessionManager {
  private final Set<String> loggedInUsers = new HashSet<>();

  public void login(String username) {
    if (!username.isEmpty()) {
      loggedInUsers.add(username.toLowerCase());
    }
  }

  public void logout(String username) {
    loggedInUsers.remove(username.toLowerCase());
  }

  public void printUsers() {
    for (String user : loggedInUsers) {
      System.out.println("User: " + user);
    }
  }
}