public class Initialization {

  private final static int NUMBER_OF_REQUESTS = 10;
  private final static int NUMBER_OF_FLOORS = 18;

  public static void main (String[] args) {
    var requests = Queue.generateQueue(NUMBER_OF_REQUESTS, NUMBER_OF_FLOORS);
    System.out.println(requests);

    Elevator elevator1 = new Elevator(1);
    Elevator elevator2 = new Elevator(2);

    Queue queue = new Queue(requests, elevator1, elevator2);

    queue.start();
    elevator1.start();
    elevator2.start();

  }
}
