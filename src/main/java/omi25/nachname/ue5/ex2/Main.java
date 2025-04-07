package omi25.nachname.ue5.ex2;

import java.util.ArrayList;
import java.util.List;
import omi25.nachname.ue5.ex2.blocks.DirtBlock;
import omi25.nachname.ue5.ex2.blocks.ExplosionBlock;
import omi25.nachname.ue5.ex2.blocks.FireBlock;
import omi25.nachname.ue5.ex2.blocks.LavaBlock;
import omi25.nachname.ue5.ex2.blocks.MinecraftBlock;
import omi25.nachname.ue5.ex2.tools.Pickaxe;

public class Main {
  public static final int MAP_SIZE = 3;

  public static void main(String[] args) {
    var player1 = new Pickaxe("Steve", 100);

    MinecraftBlock[][] blocks = new MinecraftBlock[MAP_SIZE][MAP_SIZE];

    for (int i = 0; i < MAP_SIZE; i++) {
      for (int j = 0; j < MAP_SIZE; j++) {
        blocks[i][j] = new DirtBlock();

        if ((i + j) % 2 == 0) {
          blocks[i][j] = new FireBlock();
        }
      }
    }
    blocks[MAP_SIZE / 2][MAP_SIZE / 2] = new LavaBlock();
    blocks[MAP_SIZE - 1][MAP_SIZE - 1] = new ExplosionBlock();

    // Steve takes a walk
    for (int x = 0; x < MAP_SIZE; x++) {
      for (int y = 0; y < MAP_SIZE; y++) {
        var block = blocks[x][y];
        block.onStep(player1);

        if (block.canBeBroken(player1)) {
          block.onBreak(player1);
        }

        var neighbours = findNeighbours(blocks, x, y);
        for (var nBlock : neighbours) {
          if (nBlock instanceof LavaBlock lava) {
            lava.onWalkPast(player1);
          }
        }
      }
    }
  }

  public static List<MinecraftBlock> findNeighbours(MinecraftBlock[][] map, int x, int y) {
    var neighbours = new ArrayList<MinecraftBlock>();

    if (x > 0) {
      neighbours.add(map[x - 1][y]);
    }
    if (x < map.length - 1) {
      neighbours.add(map[x + 1][y]);
    }
    if (y > 0) {
      neighbours.add(map[x][y - 1]);
    }
    if (y < map[x].length - 1) {
      neighbours.add(map[x][y + 1]);
    }

    return neighbours;
  }
}
