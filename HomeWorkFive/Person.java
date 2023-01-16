package HomeWorkFive;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
  private Object message;
  private String surname;
  private String name;
  private String patronymic;
  private String position;
  private String email;
  private String phone;
  private double salary;
  private int age;

  public Person(String surname, String name, String patronymic,
                String position, String email, String phone, double salary, int age) {
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
    String message =
      """
        Фамилия:""" + this.surname + """
        " Имя:""" + this.name + """
        " Отчество:""" + this.patronymic + """
        " Должность:""" + this.position + """
        " Почта:""" + this.email + """
        " Телефон:""" + this.phone + """
        " Зар.Плата:""" + this.salary + """
        " Возраст:""" + this.age;
    System.out.println(message);
  }
}
