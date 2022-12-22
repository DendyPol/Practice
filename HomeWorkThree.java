import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkThree {
  static Scanner game = new Scanner(System.in);
  static Random random = new Random();

  public static void main(String[] args) {
    restartGame();
  }

  private static void restartGame() {
    System.out.println("Главное меню:\n(1) - Угадай число\n(2) - Угадай слово\n(3) - Закрыть игру");
    int play = game.nextInt();
    if (play == 1) {
      taskOne();
    } else if (play == 2) {
      taskTwo();
    } else System.exit(0);
  }

  private static void taskOne() {
    int choice;
    var number = random.nextInt(9);
    System.out.println("Внимание! Крутится рулетка!\nВыберите число от 0 до 9, у вас три попытки");
    for (int i = 0; i < 3; i++) {
      System.out.println("Попытка номер: " + (i + 1) + "!");
      choice = game.nextInt();
      if (choice == number) {
        System.out.println("Вот это да! Вы молодец! \nМожет еще разок? 1 - Да/ 2 - Выйти в меню");
        choice = game.nextInt();
        if (choice == 1) {
          taskOne();
        } else restartGame();
      } else {
        System.out.println("Это число " + ((number > choice) ? "больше" : "меньше"));
      }
    }
    System.out.println("Ну ничего, повезет в следующий раз! \nМожет еще разок? 1 - Да/ 2 - Выйти в меню");
    choice = game.nextInt();
    if (choice == 1) {
      taskOne();
    } else restartGame();
  }

  private static void taskTwo() {
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
      "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
      "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    String guessWord = words[random.nextInt(words.length)];
    String word;
    System.out.println("Компьютер загадал одно из следующий слов!\n" + Arrays.toString(words));
    do {
      word = game.nextLine();
      for (int i = 0; i < 15; i++)
        if (i < guessWord.length() && i < word.length() &&
          guessWord.charAt(i) == word.charAt(i))
          System.out.print(word.charAt(i));
        else
          System.out.print((guessWord.equals(word)) ? "" : "#");
      System.out.println();
    } while (!guessWord.equals(word));
    System.out.println("Вот это мастерство! \nМожет еще разок? 1 - да/ 2 - Выйти в меню");
    var reGame = game.nextInt();
    if (reGame == 1) {
      taskTwo();
    } else restartGame();
  }
}
