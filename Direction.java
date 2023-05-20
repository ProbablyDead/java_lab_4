import java.util.Random;

public enum Direction {
  UP ("up"),
  DOWN ("down"),
  STANDING ("standing");

  private String title;

  private Direction (String title) {
    this.title = title;
  }

  public static Direction getRandomDirection (Random random) {
    return random.nextInt(2) == 0 ? Direction.UP : Direction.DOWN;
  }

  @Override 
  public String toString () {
    return title;
  }

}

