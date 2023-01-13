package HomeWorkFive;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
  private String surname;
  private String name;
  private String patronymic;
  private String position;
  private String email;
  private long phone;
  private double salary;
  private int age;

  public Person(String surname, String name, String patronymic,
                String position, String email, long phone, int salary, int age) {
    this.surname = surname;
    this.name = name;
    this.patronymic = patronymic;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
  }

  public void printInfo() {
    String message = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s"
      , "Фамилия: " + this.surname
      , "Имя: " + this.name
      , "Отчество: " + this.patronymic
      , "Должность: " + this.position
      , "Почта: " + this.email + this.phone
      , "Зар.Плата: " + this.salary
      , "Возраст: " + this.age);
    printMessage(message);
  }

  private void printMessage(String message) {
    System.out.println(message);
  }
}
