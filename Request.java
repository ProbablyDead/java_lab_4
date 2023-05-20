public class Request {
  private int floor;
  private Direction direction;
  private int delay;

  public int getFloor() {
    return floor;
  }

  public Direction getDirection() {
    return direction;
  }

  public int getDelay() {
    return delay;
  }

  @Override
  public String toString () {
    return String.format("Floor %d; Direction %s", floor, direction);
  }

  Request (int floor, Direction direction, int delay) {
    this.floor = floor;
    this.direction = direction;
    this.delay = delay;
  }
}

