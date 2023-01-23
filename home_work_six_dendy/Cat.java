package home_work_six_dendy;

public class Cat extends Animal {
  public Cat(String name, float runDistanc, float jumpHeight, float swimDistance) {
    super(name, runDistanc, jumpHeight, swimDistance);
  }

  @Override
  public void workout() {
    super.workout();
    System.out.println("Кот не умеет плавать");
  }
}
