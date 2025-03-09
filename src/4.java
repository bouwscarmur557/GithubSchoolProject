import java.util.*;

class Main {
  public static void main(String[] args) {
    int sum = 0;
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = (int)(Math.random() * 10);
      sum += arr[i];
    }
    System.out.println("The sum of the array is: " + sum);
  }
}
