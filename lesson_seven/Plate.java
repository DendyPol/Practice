package lesson_seven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Plate {
  private int food;

  @Override
  public String toString() {
    return "Plate{" +
      "food=" + food +
      '}';
  }

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
