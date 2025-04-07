package omi25.nachname.ue5.ex2.blocks;

import omi25.nachname.ue5.ex2.Player;
import omi25.nachname.ue5.ex2.tools.Bucket;

public class LavaBlock extends MinecraftBlock {
  public LavaBlock() {
    super("Lava", Bucket.class);
  }

  @Override
  public void onStep(Player player) {
    super.onStep(player);
    player.takeDamage(5);
  }

  public void onWalkPast(Player player) {
    System.out.printf("Player \"%s\" walks past %s%n", player.getName(), getName());
    player.takeDamage(5);
  }
}
