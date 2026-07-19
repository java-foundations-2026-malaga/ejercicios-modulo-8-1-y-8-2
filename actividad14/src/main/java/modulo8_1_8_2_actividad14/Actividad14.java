package modulo8_1_8_2_actividad14;

public class Actividad14 {
  public static void main(String[] args) {
    java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
    for (int i = 1; i <= 20; i++) numbers.add(i);
    for (Integer number : numbers) {
      if (number % 2 == 0) numbers.remove(number);
    }
    System.out.println(numbers);
  }
}
