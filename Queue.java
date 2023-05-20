import java.util.ArrayList;
import java.util.Random;

public class Queue extends Thread {
  private ArrayList<Request> queuePairs;
  
  Queue (ArrayList<Request> queuePairs) {
    this.queuePairs = queuePairs;
  }

  public static ArrayList<Request> generateQueue (int requestsCount, int floorsCount, int delay) {
    ArrayList<Request> result = new ArrayList<>();

    Random random = new Random();

    for (int i = 0; i < requestsCount; ++i) {
      result.add(new Request(random.nextInt(floorsCount), Direction.getRandomDirection(random), delay));
    }

    return result;
  }

  @Override
  public void run () {
    for (var request : queuePairs) {
      System.out.println(request);
      try {
        sleep(request.getDelay());
      } catch (Exception exception) {}
    }
  }
}
