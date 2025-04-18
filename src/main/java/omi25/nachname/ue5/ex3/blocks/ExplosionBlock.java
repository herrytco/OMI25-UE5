package omi25.nachname.ue5.ex3.blocks;

import omi25.nachname.ue5.ex3.Player;
import omi25.nachname.ue5.ex3.tools.Pickaxe;

public class ExplosionBlock extends MinecraftBlock {
  public ExplosionBlock() {
    super("TNT", Pickaxe.class);
  }

  @Override
  public void onBreak(Player player) {
    player.takeDamage(100);
  }
}
