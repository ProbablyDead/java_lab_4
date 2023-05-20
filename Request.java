public class Request {
  private int floor;
  private boolean isUp;
  private int delay;

  public int getFloor() {
      return floor;
  }

  public boolean isUp() {
      return isUp;
  }

  public int getDelay() {
      return delay;
  }

  @Override
  public String toString () {
    return String.format("Floor %d; Direction %s", floor, isUp ? "up" : "down");
  }

  Request (int floor, boolean isUp, int delay) {
    this.floor = floor;
    this.isUp = isUp;
    this.delay = delay;
  }
}

