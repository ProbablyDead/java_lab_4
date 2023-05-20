public class Initialization {
  private final static int NUMBER_OF_REQUESTS = 10;
  private final static int NUMBER_OF_FLOORS = 18;
  private final static int MAX_DELAY = 100;

  public static void main (String[] args) {
    var requests = Queue.generateQueue(NUMBER_OF_REQUESTS, NUMBER_OF_FLOORS, MAX_DELAY);

    Queue queue = new Queue(requests);
    queue.start();
  }
}
