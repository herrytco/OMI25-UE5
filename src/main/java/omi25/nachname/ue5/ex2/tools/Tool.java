package omi25.nachname.ue5.ex2.tools;

import omi25.nachname.ue5.ex2.Player;

public class Tool extends Player {
  private final String toolName;

  public Tool(String name, int health, String toolName) {
    super(name, health);
    this.toolName = toolName;
  }
}
