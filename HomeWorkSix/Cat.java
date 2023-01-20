package HomeWorkSix;

public class Cat extends Animal {

  @Override
  public String toString() {
    return "Cat{" +
      "name='" + name + '\'' +
      ", runDistance=" + runDistance +
      ", jumpHeight=" + jumpHeight +
      ", swimDistance=" + swimDistance +
      '}';
  }

  @Override
  public void workout() {
    super.workout();
    System.out.println("Кот не умеет плавать");
  }

  public Cat(String name, float runDistance, float jumpHeight, float swimDistance) {
    super(name, runDistance, jumpHeight, swimDistance);
  }
}
