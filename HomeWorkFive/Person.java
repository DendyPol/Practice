package HomeWorkFive;

public class Person {
  public static final String DEFAULT_SURNAME = "Первовский";
  public static final String DEFAULT_NAME = "Петр";
  public static final String DEFAULT_PATRONYMIC = "Петрович";
  public static final String DEFAULT_POSITION = "Начальник";
  public static final String DEFAULT_EMAIL = "perviy@java.com";
  public static final long DEFAULT_PHONE = 89991111111L;
  public static final int DEFAULT_SALARY = 100000;
  public static final int DEFAULT_AGE = 49;
  private String surname;
  private String name;
  private String patronymic;
  private String position;
  private String email;
  private long phone;
  private double salary;
  private int age;

  public Person() {
    this(DEFAULT_SURNAME, DEFAULT_NAME, DEFAULT_PATRONYMIC,
      DEFAULT_POSITION, DEFAULT_EMAIL, DEFAULT_PHONE, DEFAULT_SALARY, DEFAULT_AGE);
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

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
    String message = "Фамилия: " + this.surname + '\n' + "Имя: " + this.name + '\n' + "Отчество: " + this.patronymic +
      '\n' + "Должность: " + this.position + '\n' + "Почта: " + this.email + '\n' + this.phone + '\n' +
      "Зар.Плата: " + this.salary + '\n' + "Возраст: " + this.age + '\n';
    printMessage(message);
  }

  private void printMessage(String message) {
    System.out.println(message);
  }
}
