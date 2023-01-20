package HomeWorkSix;

public class Dog extends Animal {

  @Override
  public String toString() {
    return "Dog{" +
      "name='" + name + '\'' +
      ", runDistance=" + runDistance +
      ", jumpHeight=" + jumpHeight +
      ", swimDistance=" + swimDistance +
      '}';
  }

  public Dog(String name, float runDistance, float jumpHeight, float swimDistance) {
    super(name, runDistance, jumpHeight, swimDistance);
  }
}
