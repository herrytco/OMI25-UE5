package omi25.nachname.ue5.ex2;

public class Player {
  private final String name;
  private int health;

  public Player(String name, int health) {
    this.name = name;
    this.health = health;
  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }

  public void takeDamage(int damage) {
    health = Math.max(0, health - damage);
    System.out.printf("Player \"%s\" took %d damage%n", name, damage);

    if (health == 0) {
      System.out.printf("Player \"%s\" died%n", name);
    }
  }
}
