package HomeWorkSix;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Animal {
  protected String name;
  protected float runDistance;
  protected float jumpHeight;
  protected float swimDistance;
  protected final int MAX_RUN_DISTANCE = 500;
  protected final int MAX_JUMP_HEIGHT = 3;
  protected final int MAX_SWIM_DISTANCE = 8;

  @Override
  public String toString() {
    return "Animal{" +
      "name='" + name + '\'' +
      ", runDistance=" + runDistance +
      ", jumpHeight=" + jumpHeight +
      ", swimDistance=" + swimDistance +
      '}';
  }

  public void animalInfo() {
    System.out.println(this);
  }

  public void workout() {
    System.out.println("Бег на 500 метров: " + (MAX_RUN_DISTANCE <= runDistance));
    System.out.println("Прыжок в высоту 3 метра: " + (MAX_JUMP_HEIGHT <= jumpHeight));
    System.out.println("Заплыв на 8 метров: " + (MAX_SWIM_DISTANCE <= swimDistance));
  }
}
