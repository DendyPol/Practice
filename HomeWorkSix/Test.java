package HomeWorkSix;

public class Test {
  public static void main(String[] args) {
    var cat = new Cat[2];
    cat[0] = new Cat("Барсик", 254.3F, 4.5F, 0.01F);
    cat[1] = new Cat("Персик", 232.1F, 3.8F, 0.02F);
    var dog = new Dog[2];
    dog[0] = new Dog("Барбос", 402.6F, 1.4F, 8.4F);
    dog[1] = new Dog("Белка", 621.8F, 3.2F, 10.1F);
    for (Cat statOne : cat) {
      statOne.animalInfo();
      statOne.workout();
    }
    for (Dog statTwo: dog) {
      statTwo.animalInfo();
      statTwo.workout();
    }
  }
}
