package home_work_six_dendy;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Animal {
  protected String name;
  protected float runDistanc;
  protected float jumpHeight;
  protected float swimDistance;
  protected final int MAX_RUN_DISTANCE = 500;
  protected final int MAX_JUMP_HEIGHT = 3;
  protected final int MAX_SWIM_DISTANCE = 8;

  public void workout() {
    System.out.println("Бег на 500 метров: " + (MAX_RUN_DISTANCE <= runDistanc));
    System.out.println("Прыжок в высоту 3 метра: " + (MAX_JUMP_HEIGHT <= jumpHeight));
    System.out.println("Заплыв на 8 метров: " + (MAX_SWIM_DISTANCE <= swimDistance));
  }
}
