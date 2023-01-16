package HomeWorkFive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person {
  private String surname;
  private String name;
  private String patronymic;
  private String position;
  private String email;
  private String phone;
  private double salary;
  private int age;

  public void printInfo() {
    String message = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s"
      , "Фамилия: " + this.surname
      , "Имя: " + this.name
      , "Отчество: " + this.patronymic
      , "Должность: " + this.position
      , "Почта: " + this.email + this.phone
      , "Зар.Плата: " + this.salary
      , "Возраст: " + this.age);
    System.out.println(message);
  }
}
