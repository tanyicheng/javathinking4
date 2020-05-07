package exercise.holding;//: holding/SimpleCollection.java

import java.util.Collection;
import java.util.HashSet;

public class E02_SimpleCollection2 {
  public static void main(String[] args) {
    Collection<Integer> c = new HashSet<Integer>();
    for(int i = 0; i < 10; i++)
      c.add(i); // Autoboxing
    for(Integer i : c)
      System.out.print(i + ", ");
  }
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~
