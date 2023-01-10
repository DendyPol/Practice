import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
  private static final char DOT_EMPTY = '•';
  private static final char DOT_X = 'X';
  private static final char DOT_O = 'O';
  private static final int SIZE = 5;
  private static final int DOTS_TO_WIN = 4;
  private static final char[][] map = new char[SIZE][SIZE];
  private static final Scanner scanner = new Scanner(System.in);
  private static final Random random = new Random();

  public static void main(String[] args) {
    prepareToGame();
    playGame();
    System.out.println("Игра закочена!");
  }

  private static void prepareToGame() {
    initMap();
    printMap();
  }

  private static void printMap() {
    printColumnNumbers();
    System.out.println();
    printRow();
    System.out.println();
  }

  private static void printColumnNumbers() {
    for (int i = 0; i <= SIZE; i++) {
      System.out.print(i + " ");
    }
  }

  private static void printRow() {
    for (int i = 0; i < map.length; i++) {
      System.out.print((i + 1) + " ");
      for (int j = 0; j < map[i].length; j++) {
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static void initMap() {
    for (char[] row : map) {
      Arrays.fill(row, DOT_EMPTY);
    }
  }

  private static void playGame() {
    while (true) {
      humanTurn();
      printMap();
      if (checkDiagonal(DOT_X)) {
        System.out.println("Ты победил!");
        break;
      } else if (checkLanes(DOT_X)) {
        System.out.println("Ты победил!");
        break;
      }
      if (isMapFull()) {
        System.out.println("draw!");
      }
      aiTurn();
      printMap();
      if (checkDiagonal(DOT_O)) {
        System.out.println("Победил PC!");
        break;
      } else if (checkLanes(DOT_O)) {
        System.out.println("Победил PC!");
        break;
      }
      if (isMapFull()) {
        System.out.println("draw!");
      }
    }
  }

  private static void humanTurn() {
    int colIndex = -1, rowIndex = -1;
    do {
      System.out.println("Введите два числа '<номер строки> <номер колонки>'");
      String[] stringData = scanner.nextLine().split(" ");
      if (stringData.length != 2) {
        System.out.println("Были введены некорректные данные");
        continue;
      }
      try {
        rowIndex = Integer.parseInt(stringData[0]) - 1;
        colIndex = Integer.parseInt(stringData[1]) - 1;
      } catch (NumberFormatException e) {
        System.out.println("Были введены некорректные данные!");
      }
    } while (!isCellValid(rowIndex, colIndex));
    map[rowIndex][colIndex] = DOT_X;
  }

  private static void aiTurn() {
    int[] block = blockAiMethod();
    if (block == null) {
      block = randomStep();
    }
    var closeRow = block[0];
    var closeCol = block[1];
    turn(closeRow, closeCol, DOT_O);
  }

  private static int[] blockAiMethod() {
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == DOT_EMPTY && checkStepHuman(i, j)) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }

  private static boolean checkStepHuman(int rowIndex, int colIndex) {
    turn(rowIndex, colIndex, DOT_X);
    boolean result = checkDiagonal(DOT_X) || checkLanes(DOT_X);
    turn(rowIndex, colIndex, DOT_EMPTY);
    return result;
  }

  private static int[] randomStep() {
    int rowIndex, colIndex;
    do {
      rowIndex = random.nextInt(SIZE);
      colIndex = random.nextInt(SIZE);
    } while (!isCellValid(rowIndex, colIndex));
    return new int[]{rowIndex, colIndex};
  }

  private static void turn(int rowIndex, int colIndex, char symbol) {
    map[rowIndex][colIndex] = symbol;
  }

  private static boolean isCellValid(int rowIndex, int colIndex) {
    if (rowIndex < 0 || rowIndex >= SIZE || colIndex < 0 || colIndex >= SIZE) {
      return false;
    }
    return map[rowIndex][colIndex] == DOT_EMPTY;
  }

  private static boolean checkLanes(char symbol) {
    for (int i = 0; i < SIZE; i++) {
      var cols = 0;
      var rows = 0;
      for (int j = 0; j < SIZE; j++) {
        cols = (map[i][j] == symbol) ? cols + 1 : 0;
        rows = (map[j][i] == symbol) ? rows + 1 : 0;
        if (cols == DOTS_TO_WIN || rows == DOTS_TO_WIN) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean checkDiagonal(char symbol) {
    var right = 0;
    var left = 0;
    for (int i = 0; i < SIZE; i++) {
      right = (map[i][i] == symbol) ? right + 1 : 0;
      left = (map[i][SIZE - i - 1] == symbol) ? left + 1 : 0;
      if (right == DOTS_TO_WIN || left == DOTS_TO_WIN) {
        return true;
      }
    }
    for (int i = 0; i < SIZE - 1; i++) {
      right = (map[i][i + 1] == symbol) ? right + 1 : 0;
      left = (map[i][SIZE - i - 2] == symbol) ? left + 1 : 0;
      if (right == DOTS_TO_WIN || left == DOTS_TO_WIN) {
        return true;
      }
    }
    for (int i = 0; i < SIZE - 1; i++) {
      right = (map[i + 1][i] == symbol) ? right + 1 : 0;
      left = (map[i + 1][SIZE - i - 1] == symbol) ? left + 1 : 0;
      if (right == DOTS_TO_WIN || left == DOTS_TO_WIN) {
        return true;
      }
    }
    return false;
  }

  private static boolean isMapFull() {
    for (char[] row : map) {
      for (char cell : row) {
        if (cell == DOT_EMPTY) {
          return false;
        }
      }
    }
    return true;
  }
}
