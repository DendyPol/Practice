package lesson_seven;

public class MainClass {
  public static void main(String[] args) {
    var plate = new Plate(20);
    var cats = new Cat[5];
    cats[0] = new Cat("Барсик", 7, false);
    cats[1] = new Cat("Мурзик", 8, false);
    cats[2] = new Cat("Рыжик", 4, false);
    cats[3] = new Cat("Серый", 4, false);
    cats[4] = new Cat("Черныш", 5, false);
    for (Cat statistic : cats) {
      statistic.eat(plate);
      System.out.println(plate);
      plate.addFood(4);
    }
  }
}
