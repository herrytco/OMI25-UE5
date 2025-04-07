package omi25.nachname.ue5.ex2.blocks;

import omi25.nachname.ue5.ex2.Player;
import omi25.nachname.ue5.ex2.tools.Shovel;

public class FireBlock extends MinecraftBlock {
  public FireBlock() {
    super("FireBlock", Shovel.class);
  }

  @Override
  public void onStep(Player player) {
    super.onStep(player);
    player.takeDamage(1);
  }
}
