package home_work_six;

public class Cat extends Animal {
  public Cat(String name, float runDistance, float jumpHeight, float swimDistance) {
    super(name, runDistance, jumpHeight, swimDistance);
  }

  @Override
  public void workout() {
    super.workout();
    System.out.println("Кот не умеет плавать");
  }
}
