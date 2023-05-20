public class Elevator extends Thread {
  private int floor;
  private Direction direction;

  public int getFloor() {
      return floor;
  }

  public Direction getDirection () {
    return direction;
  }
  
  Elevator () {
    floor = 0;
    direction = Direction.STANDING;
  }

  @Override
  public void run () {
  }

}
