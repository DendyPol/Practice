package HomeWorkFive;
public class Test {
  public static void main(String[] args) {
    Person[] perArray = new Person[5];
    perArray[0] = new Person("Первовский", "Петр", "Петрович", "Начальник", "perviy@java.com", "89991111111", 95000, 51);
    perArray[1] = new Person("Второвьев", "Владимир", "Викторович", "Замместитель начальника", "vtoroy@java.com", "89991111112", 75000, 44);
    perArray[2] = new Person("Третьев", "Тарас", "Карпатович", "Руководитель отдела", "treiy@java.com", "89991111113", 65000, 39);
    perArray[3] = new Person("Четвертых", "Игнат", "Витальевич", "Бухгалтер", "chetvertiy@java.com", "89991111114", 65000, 32);
    perArray[4] = new Person("Пятинский", "Адам", "Эльдарович", "Менеджер", "pyatiy@java.com", "89991111115", 35000, 21);
    for (Person person : perArray) {
      if (person.getAge() > 40) person.printInfo();
    }
  }
}
