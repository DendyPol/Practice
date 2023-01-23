package home_work_six_dendy;

public class Test {
  public static void main(String[] args) {
    var cats = new Cat[2];
    cats[0] = new Cat("Барсик", 254.3F, 4.5F, 0.01F);
    cats[1] = new Cat("Персик", 232.1F, 3.8F, 0.02F);
    var dogs = new Dog[2];
    dogs[0] = new Dog("Барбос", 402.6F, 1.4F, 8.4F);
    dogs[1] = new Dog("Белка", 621.8F, 3.2F, 10.1F);
    for (Cat statsOne : cats) {
      statsOne.toString();
      statsOne.workout();
    }
    for (Dog statsTwo : dogs) {
      statsTwo.toString();
      statsTwo.workout();
    }
  }
}
