import java.util.Random;

public enum Direction {
  UP ("up", 1),
  DOWN ("down", -1),
  STANDING ("standing", 0);

  private String title;
  private int step;

  private Direction (String title, int step) {
    this.title = title;
    this.step = step;
  }

  public static Direction getRandomDirection (Random random) {
    return random.nextInt(2) == 0 ? Direction.UP : Direction.DOWN;
  }

  public int getShift () {
    return step;
  }

  @Override 
  public String toString () {
    return title;
  }

}

