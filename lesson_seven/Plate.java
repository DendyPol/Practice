package lesson_seven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Plate {
  private int food;

  public void decreaseFood(int appetite) {
    if (appetite > food) {
      System.out.println("Недостаточно еды: " + (appetite - food));
    } else {
      food -= appetite;
    }
  }

  public void addFood(int giveFood) {
    food += giveFood;
    System.out.println(food > 0 ? "Еды достаточно: " + (food) : "Еды нет, нужно больше еды: ");
  }
}
