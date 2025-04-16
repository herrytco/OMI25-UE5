package omi25.nachname.ue5.ex5.v3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SessionManager {
  private final List<String> users = new ArrayList<>();

  public void login(String username) {
    if (users.contains(username)) {
      return;
    }
    users.add(username);
    System.out.println(username + " logged in at " + new Date());
  }

  public void logout(String username) {
    users.remove(username);
    System.out.println(username + " logged out at " + new Date());
  }

  public void printUsers() {
    for (String u : users) {
      System.out.println(u);
    }
  }
}
