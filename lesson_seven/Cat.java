package lesson_seven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cat {
  private String name;
  private int appetite;
  private boolean full;

  public void eat(Plate plate) {
    plate.decreaseFood(appetite);
    System.out.println("Кот поел: " + name);
    String isFull = !full ? "сыт" : "голоден";
    System.out.println(isFull);
  }
}
