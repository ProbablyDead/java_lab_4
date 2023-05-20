import java.util.ArrayDeque;

public class Elevator extends Thread {
  private int floor;
  private Direction direction;
  private ArrayDeque<Integer> queue;
  private final static int delay = 1000;

  public int getFloor() {
    return floor;
  }

  public Direction getDirection () {
    return direction;
  }

  public void setFloor(int floor) {
    this.floor = floor;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public void addFloorToQueue (int floor) {
    this.queue.addLast(floor);
  }
  
  Elevator () {
    floor = 0;
    direction = Direction.STANDING;
    queue = new ArrayDeque<>();
  }

  private void move () {
    if (queue.isEmpty()) { 
      direction = Direction.STANDING;
      return; 
    } 

    int nextFloor = queue.getFirst();

    if (floor == nextFloor) {
      queue.pop();
      if (!queue.isEmpty()){
        nextFloor = queue.getFirst();
      }
    }

    if (nextFloor > floor) { direction = Direction.UP; }
    else if (nextFloor == floor) { direction = Direction.STANDING; }
    else if (nextFloor < floor) { direction = Direction.DOWN; }

    floor += direction.getShift();
  }

  @Override
  public void run () {
    while (true) {
      move();
      System.out.println(queue.isEmpty() ? "" : (queue + " ") + floor);
      try { sleep(delay); } catch (Exception exception) {}
    }
  }

}
