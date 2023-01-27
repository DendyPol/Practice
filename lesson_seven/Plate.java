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

  public void info() {
    System.out.println("Plate: " + food);
  }

  public boolean decreaseFood(int appetite) {
    if (appetite > food) {
      System.out.println("Недостаточно еды: " + (appetite - food));
      return false;
    } else {
      food -= appetite;
      return true;
    }
  }

  public void addFood(int giveFood) {
    food += giveFood;
    System.out.println(food > 0 ? "Еды достаточно: " + (food) : "Еды нет, нужно больше еды: ");
  }
}
