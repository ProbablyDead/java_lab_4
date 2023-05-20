public class Initialization {

  private final static int NUMBER_OF_REQUESTS = 5;
  private final static int NUMBER_OF_FLOORS = 8;

  public static void main (String[] args) {
    var requests = Queue.generateQueue(NUMBER_OF_REQUESTS, NUMBER_OF_FLOORS);

    Elevator elevator1 = new Elevator();
    Elevator elevator2 = new Elevator();

    Queue queue = new Queue(requests, elevator1, elevator2);

    queue.start();
    elevator1.start();
    elevator2.start();

  }
}
