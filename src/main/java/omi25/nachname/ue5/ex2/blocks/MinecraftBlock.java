package omi25.nachname.ue5.ex2.blocks;

import omi25.nachname.ue5.ex2.Player;
import omi25.nachname.ue5.ex2.tools.Tool;

public abstract class MinecraftBlock {
  private final String name;
  private final Class<? extends Tool> toolToBreak;

  public MinecraftBlock(String name, Class<? extends Tool> toolToBreak) {
    this.name = name;
    this.toolToBreak = toolToBreak;
  }

  public String getName() {
    return name;
  }

  public void onStep(Player player) {
    System.out.printf("Player \"%s\" steps on %s%n", player.getName(), name);
  }

  public boolean canBeBroken(Tool tool) {
    return toolToBreak.isAssignableFrom(tool.getClass());
  }

  public void onBreak(Player player) {
    System.out.printf("Player \"%s\" breaks %s%n", player.getName(), name);
  }
}
