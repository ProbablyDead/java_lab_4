import java.util.ArrayList;
import java.util.Random;

import javafx.util.Pair;

public class Queue extends Thread {
  ArrayList<Pair<Integer, Boolean>> queuePairs;
  
  Queue (ArrayList<Pair<Integer, Boolean>> queuePairs) {
    this.queuePairs = queuePairs;
  }

  public static ArrayList<Pair<Integer, Boolean>> generateQueue (int requestsCount, int floorsCount) {
    ArrayList<Pair<Integer, Boolean>> result = new ArrayList<Pair<Integer, Boolean>>();

    Random random = new Random();

    for (int i = 0; i < requestsCount; ++i) {
      result.add(new Pair<>(random.nextInt(floorsCount), random.nextBoolean()));
    }

    return result;
  }

  @Override
  public void run () {

  }
}
