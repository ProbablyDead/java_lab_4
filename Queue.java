import java.util.ArrayList;
import java.util.Random;

public class Queue extends Thread {
  private final static int MAX_DELAY = 1000;

  private ArrayList<Request> queuePairs;
  private Elevator elevator1;
  private Elevator elevator2;
  
  Queue (ArrayList<Request> queuePairs, Elevator elevator1, Elevator elevator2) {
    this.queuePairs = queuePairs;
    this.elevator1 = elevator1;
    this.elevator2 = elevator2;
  }

  public static ArrayList<Request> generateQueue (int requestsCount, int floorsCount) {
    ArrayList<Request> result = new ArrayList<>();

    Random random = new Random();

    for (int i = 0; i < requestsCount; ++i) {
      result.add(new Request(random.nextInt(floorsCount), Direction.getRandomDirection(random), random.nextInt(MAX_DELAY)));
    }

    return result;
  }

  @Override
  public void run () {
    for (var request : queuePairs) {
      operate(request);
      try { sleep(request.getDelay()); } catch (Exception exception) {}
    }
  }

  private void operate (Request request) {
    elevator1.addFloorToQueue(request.getFloor());
  }
}
